package internet_safety;

import java.util.ArrayList;

/*
 * 根据加密后的输出维吉尼亚密钥长度
 */
class Process{
	ArrayList listLength = new ArrayList();
	ArrayList<String> listStr=new ArrayList<String>();
	
	public int gcd(int m, int n) {
        if(m>n){
        	if (n == 0) return m;
        	else return (gcd(n, m % n));
        }else{
        	if(m==0) return n;
        	else return (gcd(m,n%m));
       }
	}
	
	//处理加密后的字符串
	public void process(String str) {
		for(int i=3; i<=25; i++) {
			for(int j=0; j<str.length()-i; j++) {
				String string=str.substring(j, i+j);
				ArrayList list=new ArrayList();
				for(int k=j;k<=str.lastIndexOf(string);k=k+i) {
					k=str.indexOf(string,k);
					if(k==-1) break;
					list.add(k);
				}
				if(list.size()<=2) {
					continue;
				}else {
					int length=(int)list.get(0);
					int distance=(int)list.get(1)-(int)list.get(0);
					for(int l=2; l<list.size();l++) {
						distance=gcd(distance,(int)list.get(l)-length);
					}
					if(distance>1) {
						this.listLength.add(distance);
						this.listStr.add(string);
					}
				}	
			}
		}
	}
	
	//显示所有可能的子字符串及密钥长度
	public void show() {
		for(int i=0;i<this.listLength.size();i++) {
			System.out.print("i="+i+", 密钥长度："+this.listLength.get(i));
			System.out.println(", 字符串："+listStr.get(i));
		}
	}
	
	//大致的分析统计
	public void statics(){
		int length=(int)listLength.get(0);
		for(int i=1; i<listLength.size();i++){
			length=gcd(length, (int)listLength.get(i));
		}
		System.out.println("密钥长度："+length);
	}
}

public class test_04 {
	public static void main(String[] args) {
		//书上的用例
		String str_1="CHREEVOAHMAERATBIAXXWTNXBEEOPHBSBQMQEQERBWRVXUOAKXAOSXXWEAHBWGJMMQMNKGRFVGXWTRZXWIAKLXFP"
				+ "SKAUTEMNDCMGTSXMXBTUIADNGMGPSRELXNJELXVRVPRTULHDNQWTWDTYGBPHXTFALJHASVBFXNGLLCHRZBWELEKMSJ"
				+ "IKNBHWRJGNMGJSGLXFEYPHAGNRBIEQJTAMRVLCRREMNDGLXRRIMGNSNRWCHRQHAEYEVTAQEBBIPEEWEVKAKOEWADRE"
				+ "MXMTBJJCHRTKDNVRZCHRCLQOHPWQAIIWXNRMGWOIIFKEE";
		
		//某个演讲片段
		char[] str_2=("ChinasHuaweiTechnologiesonTuesdaylaunchedanewmodelofsmartphoneYintheKenyanmarketThenew"
				+ "modelwillberetailingatshillingsUSdollarsintheeastAfricancountryStevenLiheadofHuaweieasternAfr"
				+ "icamobilesaidthemodelhasgonethroughrigoroustestingonmultipledimensionsandvariouslevelstoensur"
				+ "equalityTheYoneofHuaweismidrangedevicesisthesecondsmartphonelaunchedintheKenyanmarketthisyear"
				+ "followingrecentlaunchofYPrimeHuaweihasalsopartneredwithcreditfacilityLipaLaterthatallowsconsu"
				+ "merstobuyitsproductsinmonthlyinstallments").toLowerCase().toCharArray();
		
		//经过加密后的片段
		String str_3="uhgfaqzuyoegleaznmdoeaeqgnrmeqvawdasfcfwdyfeueobwlmxsksrrhhmfewanrzeiwnwsnksriwtrzelwwkgdcdwgd"
				+ "lzwrclagdilyarkhgdlgfgqmsbgljsrqanrzecssrsfpacyfcmmnrjyqletwnjahcsdmxhsswcaeyktcjnyxrguakgbgd"
				+ "eqsiblhceobwlfssegnclhpguezrgyopguqleqlilyoleujlindebamcfsggnqsnbnapaosklcnejktmwnqmrciuydirq"
				+ "tfwymfemxhsswcaskadpsnewdcniawsgktfwscuolvsksrrhhmfejsuluhcvillhccelqaleapcerlhgkycsrdgljgwgf"
				+ "gpwccftjsuluhmxynjikwhsswcahykajkonsrrfepwduatfurcvirxaaalglyjapydarwrrzarsljgwquolkukwrqlozm"
				+ "yglsnjobmcrkileollhjqilktydlkwnrk";
		
		//维吉尼亚加密
		char[] ciper="say".toCharArray();
		int i=0;
		while(i<str_2.length) {
			str_2[i]=(char)((str_2[i]-'a'+ciper[i%ciper.length]-'a')%26+97);
			i++;
		}
		
		Process p=new Process();
		p.process(new String(str_2));
		//显示所有可能的子字符串及密钥长度
		p.show();
		//p.statics();
		
	}
}
