//简介：数据输入流和数据输出流例程


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream; 
import java.io.FileOutputStream; 
public class J_Data {
	public static void main(String args[]){
		try{
			FileOutputStream fout=new FileOutputStream("fout.txt");
			DataOutputStream dfout=new DataOutputStream(fout);
			//创建文件fout.txt对应的数据输入流,  嵌套装饰
			
			int i;
			for(i=0;i<4;i++)
				dfout.writeInt('0'+i);
			dfout.close();
			
			FileInputStream fin=new FileInputStream("fout.txt");
			DataInputStream dfin=new DataInputStream(fin);
			for(i=0;i<4;i++)
				System.out.print(dfin.readInt()+", ");
			dfin.close();
		}
		catch(Exception e){
			System.out.println("发生异常:"+e);
			e.printStackTrace();
		}
	}
}

//类java.io.DataOutputStream的成员方法，写入数据
/*    
  		public final void writeBoolean(boolean v) throws IOException;
  		public final void writeByte(int v) throws IOException;
  		public final void writeShort(int v) throws IOException;
  		public final void writeChar(int v) throws IOException;
  		public final void writeInt(int v) throws IOException;
  		public final void writeLong(long v) throws IOException;
  		public final void writeFloat(float v) throws IOException;
  		public final void writeDouble(double v) throws IOException;
*/

///不管是写入还是读出，都是根据基本数据类型的格式确定的

//类java.io.DataInputStream的成员方法，读出数据
/*    
		public final void readBoolean() throws IOException;
		public final void readByte() throws IOException;
		public final void readShort() throws IOException;
		public final void readChar() throws IOException;
		public final void readInt() throws IOException;
		public final void readLong() throws IOException;
		public final void readFloat() throws IOException;
		public final void readDouble() throws IOException;
*/