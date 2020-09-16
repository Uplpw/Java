package MD5;
public class MD5 {
	
	//十六进制常量数组
    static String hexs[]={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
    
    //ABCD初始化
    public static long A=0x67452301L;
    public static long B=0xefcdab89L;
    public static long C=0x98badcfeL;
    public static long D=0x10325476L;


    //四个移位数组，在四次循环中移位
    static final int[] S1 = {7, 12, 17, 22} ;
    static final int[] S2 = {5, 9, 14, 20};
    static final int[] S3 = {4, 11, 16, 23};
    static final int[] S4 = {6, 10, 15, 21};

    //生成ABCD数组,主要用于十六次迭代中的替换
    public long[] result={A,B,C,D};

    public String digest(String inputStr){
        byte[] inputBytes=inputStr.getBytes();   //将参数（消息）转为字节处理
        int byteLen=inputBytes.length;           //获取参数的长度（字节）
        int groupCount=0;                        //完整分组的个数
        groupCount=byteLen/64;                   //计算分组个数
        long[] groups=null;                      //每个小组(64字节)分为的16个小组(4字节)

        //处理每一个完整分组，进行四轮循环
        for(int i=0;i<groupCount;i++){
            groups=divGroup(inputBytes,i*64);
            mainRound(groups);                       //处理分组，核心算法
        }

        //处理完整分组后剩余的位数
        int rest=byteLen%64;              //512位分组后的余数
        byte [] tempBytes=new byte[64];
        if(rest<=56){
            for(int i=0;i<rest;i++)
                tempBytes[i]=inputBytes[byteLen-rest+i];
            if(rest<56){
                tempBytes[rest]=(byte)(1<<7);
                for(int i=1;i<56-rest;i++)
                    tempBytes[rest+i]=0;
            }
            long len=(long)(byteLen<<3);
            for(int i=0;i<8;i++){
                tempBytes[56+i]=(byte)(len & 0xFFL);
                len=len>>8;
            }
            groups=divGroup(tempBytes,0);
            mainRound(groups);//处理分组
        }else{
            for(int i=0;i<rest;i++)
                tempBytes[i]=inputBytes[byteLen-rest+i];
            tempBytes[rest]=(byte)(1<<7);
            for(int i=rest+1;i<64;i++)
                tempBytes[i]=0;
            groups=divGroup(tempBytes,0);
            mainRound(groups);//处理分组

            for(int i=0;i<56;i++)
                tempBytes[i]=0;
            long len=(long)(byteLen<<3);
            for(int i=0;i<8;i++){
                tempBytes[56+i]=(byte)(len & 0xFFL);
                len=len>>8;
            }
            groups=divGroup(tempBytes,0);
            mainRound(groups);//处理分组
        }

        //将结果转换成十六进制的字符串
        String resStr="";
        long temp=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                temp=result[i] & 0x0FL;
                String a=hexs[(int)(temp)];
                result[i]=result[i]>>4;
                temp=result[i] & 0x0FL;
                resStr+=hexs[(int)(temp)]+a;
                result[i]=result[i]>>4;
            }
        }
        return resStr;
    }

    // 从inputBytes的index开始取512位，作为新的分组  将每一个512位的分组再细分成16个小组，每个小组64位（8个字节）
    public static long[] divGroup(byte[] inputBytes,int index){
        long[] temp=new long[16];
        for(int i=0;i<16;i++){
            temp[i]=process32(inputBytes[4*i+index])|
                (process32(inputBytes[4*i+1+index]))<<8|
                (process32(inputBytes[4*i+2+index]))<<16|
                (process32(inputBytes[4*i+3+index]))<<24;
        }
        return temp;
    }
    
    //处理32位可能导致的错误
    public static long process32(byte b){
        return b < 0 ? b & 0x7F + 128 : b;
     }

    //主要的操作，四轮循环
    public void mainRound(long[] groups) {
        long a = A, b = B, c = C, d = D;
        
        //第一轮，16次迭代
        a = FF(a, b, c, d, groups[0], S1[0], 0xd76aa478L); 
        d = FF(d, a, b, c, groups[1], S1[1], 0xe8c7b756L); 
        c = FF(c, d, a, b, groups[2], S1[2], 0x242070dbL); 
        b = FF(b, c, d, a, groups[3], S1[3], 0xc1bdceeeL); 
        a = FF(a, b, c, d, groups[4], S1[0], 0xf57c0fafL); 
        d = FF(d, a, b, c, groups[5], S1[1], 0x4787c62aL); 
        c = FF(c, d, a, b, groups[6], S1[2], 0xa8304613L); 
        b = FF(b, c, d, a, groups[7], S1[3], 0xfd469501L); 
        a = FF(a, b, c, d, groups[8], S1[0], 0x698098d8L); 
        d = FF(d, a, b, c, groups[9], S1[1], 0x8b44f7afL); 
        c = FF(c, d, a, b, groups[10], S1[2], 0xffff5bb1L); 
        b = FF(b, c, d, a, groups[11], S1[3], 0x895cd7beL);
        a = FF(a, b, c, d, groups[12], S1[0], 0x6b901122L);
        d = FF(d, a, b, c, groups[13], S1[1], 0xfd987193L);
        c = FF(c, d, a, b, groups[14], S1[2], 0xa679438eL);
        b = FF(b, c, d, a, groups[15], S1[3], 0x49b40821L);

        //第二轮，16次迭代
        a = GG(a, b, c, d, groups[1], S2[0], 0xf61e2562L);
        d = GG(d, a, b, c, groups[6], S2[1], 0xc040b340L);
        c = GG(c, d, a, b, groups[11], S2[2], 0x265e5a51L);
        b = GG(b, c, d, a, groups[0], S2[3], 0xe9b6c7aaL);
        a = GG(a, b, c, d, groups[5], S2[0], 0xd62f105dL);
        d = GG(d, a, b, c, groups[10], S2[1], 0x2441453L);
        c = GG(c, d, a, b, groups[15], S2[2], 0xd8a1e681L);
        b = GG(b, c, d, a, groups[4], S2[3], 0xe7d3fbc8L);
        a = GG(a, b, c, d, groups[9], S2[0], 0x21e1cde6L);
        d = GG(d, a, b, c, groups[14], S2[1], 0xc33707d6L);
        c = GG(c, d, a, b, groups[3], S2[2], 0xf4d50d87L);
        b = GG(b, c, d, a, groups[8], S2[3], 0x455a14edL);
        a = GG(a, b, c, d, groups[13], S2[0], 0xa9e3e905L);
        d = GG(d, a, b, c, groups[2], S2[1], 0xfcefa3f8L);
        c = GG(c, d, a, b, groups[7], S2[2], 0x676f02d9L);
        b = GG(b, c, d, a, groups[12], S2[3], 0x8d2a4c8aL);

        //第三轮，16次迭代
        a = HH(a, b, c, d, groups[5], S3[0], 0xfffa3942L);
        d = HH(d, a, b, c, groups[8], S3[1], 0x8771f681L);
        c = HH(c, d, a, b, groups[11], S3[2], 0x6d9d6122L);
        b = HH(b, c, d, a, groups[14], S3[3], 0xfde5380cL);
        a = HH(a, b, c, d, groups[1], S3[0], 0xa4beea44L);
        d = HH(d, a, b, c, groups[4], S3[1], 0x4bdecfa9L);
        c = HH(c, d, a, b, groups[7], S3[2], 0xf6bb4b60L);
        b = HH(b, c, d, a, groups[10], S3[3], 0xbebfbc70L);
        a = HH(a, b, c, d, groups[13], S3[0], 0x289b7ec6L);
        d = HH(d, a, b, c, groups[0], S3[1], 0xeaa127faL);
        c = HH(c, d, a, b, groups[3], S3[2], 0xd4ef3085L);
        b = HH(b, c, d, a, groups[6], S3[3], 0x4881d05L);
        a = HH(a, b, c, d, groups[9], S3[0], 0xd9d4d039L);
        d = HH(d, a, b, c, groups[12], S3[1], 0xe6db99e5L);
        c = HH(c, d, a, b, groups[15], S3[2], 0x1fa27cf8L);
        b = HH(b, c, d, a, groups[2], S3[3], 0xc4ac5665L);

        //第四轮，16次迭代
        a = II(a, b, c, d, groups[0], S4[0], 0xf4292244L);
        d = II(d, a, b, c, groups[7], S4[1], 0x432aff97L);
        c = II(c, d, a, b, groups[14], S4[2], 0xab9423a7L);
        b = II(b, c, d, a, groups[5], S4[3], 0xfc93a039L);
        a = II(a, b, c, d, groups[12], S4[0], 0x655b59c3L);
        d = II(d, a, b, c, groups[3], S4[1], 0x8f0ccc92L);
        c = II(c, d, a, b, groups[10], S4[2], 0xffeff47dL);
        b = II(b, c, d, a, groups[1], S4[3], 0x85845dd1L);
        a = II(a, b, c, d, groups[8], S4[0], 0x6fa87e4fL);
        d = II(d, a, b, c, groups[15], S4[1], 0xfe2ce6e0L);
        c = II(c, d, a, b, groups[6], S4[2], 0xa3014314L);
        b = II(b, c, d, a, groups[13], S4[3], 0x4e0811a1L);
        a = II(a, b, c, d, groups[4], S4[0], 0xf7537e82L);
        d = II(d, a, b, c, groups[11], S4[1], 0xbd3af235L);
        c = II(c, d, a, b, groups[2], S4[2], 0x2ad7d2bbL);
        b = II(b, c, d, a, groups[9], S4[3], 0xeb86d391L);

        //加入到之前计算的结果当中
        result[0] += a;
        result[1] += b;
        result[2] += c;
        result[3] += d;
        //与0xFFFFFFFFL进行与操作保证是32位无符号数
        result[0]=result[0] & 0xFFFFFFFFL;
        result[1]=result[1] & 0xFFFFFFFFL;
        result[2]=result[2] & 0xFFFFFFFFL;
        result[3]=result[3] & 0xFFFFFFFFL;
    }

    //四个非线性函数F()、G()、H()、I()
    public static long F(long x, long y, long z) {
        return (x & y) | ((~x) & z);
    }

    public static long G(long x, long y, long z) {
        return (x & z) | (y & (~z));
    }

    public static long H(long x, long y, long z) {
        return x ^ y ^ z;
    }

    public static long I(long x, long y, long z) {
        return y ^ (x | (~z));
    }
    
    //四轮运算中的处理过程FF()、GG()、HH()、II()
    /*
     * 由于java中long类型是8个字节，进行循环左移时需要进行调整重新设置位32位有效位数
     * 
     * ((a&0xFFFFFFFFL)<< s) | ((a&0xFFFFFFFFL) >>> (32 - s)) 实现32位无符号循环左移
     * 即：64位long 取左移的s位 以及 无符号右移的32-s位进行或操作
     */
    public static long FF(long a, long b, long c, long d, long M, long s, long T) {
        a += F(b, c, d) + M + T;
        a = ((a&0xFFFFFFFFL)<< s) | ((a&0xFFFFFFFFL) >>> (32 - s));
        a += b;
        return (a);
    }

    public static long GG(long a, long b, long c, long d, long M, long s, long T) {
        a += G(b, c, d) + M + T;
        a = ((a&0xFFFFFFFFL) << s) | ((a&0xFFFFFFFFL) >>> (32 - s));
        a += b;
        return (a);
    }

    public static long HH(long a, long b, long c, long d, long M, long s, long T) {
        a += H(b, c, d) + M + T;
        a = ((a&0xFFFFFFFFL) << s) | ((a&0xFFFFFFFFL) >>> (32 - s));
        a += b;
        return (a);
    }

    public static long II(long a, long b, long c, long d, long M, long s, long T) {
        a += I(b, c, d) + M + T;
        a = ((a&0xFFFFFFFFL) << s) | ((a&0xFFFFFFFFL) >>> (32 - s));
        a += b;
        return (a);
    }
    
    //主函数
    public static void main(String []args){
        MD5 md=new MD5();
        System.out.println(md.digest("abc"));  //输出"abc"MD5加密后的128位
    }
}