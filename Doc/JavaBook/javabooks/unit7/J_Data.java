//��飺�������������������������


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream; 
import java.io.FileOutputStream; 
public class J_Data {
	public static void main(String args[]){
		try{
			FileOutputStream fout=new FileOutputStream("fout.txt");
			DataOutputStream dfout=new DataOutputStream(fout);
			//�����ļ�fout.txt��Ӧ������������,  Ƕ��װ��
			
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
			System.out.println("�����쳣:"+e);
			e.printStackTrace();
		}
	}
}

//��java.io.DataOutputStream�ĳ�Ա������д������
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

///������д�뻹�Ƕ��������Ǹ��ݻ����������͵ĸ�ʽȷ����

//��java.io.DataInputStream�ĳ�Ա��������������
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