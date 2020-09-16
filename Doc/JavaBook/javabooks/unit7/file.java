import java.io.*;
public class file {
	public static void main(String args[]){
		File f = new File("D:\\Java\\student.txt");
		//File(String file-path);filepath(parent\\child);
		if(f.exists()) f.delete();
		else
			try{
				f.createNewFile();
			}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("�ļ�����"+f.getName());
		System.out.println("�ļ�·����"+f.getPath());
		System.out.println("����·����"+f.getAbsolutePath());
		System.out.println("���ļ�������"+f.getParent());
		System.out.println(f.exists()?"�ļ�����":"�ļ�������");
		System.out.println(f.canRead()?"�ļ��ɶ�":"�ļ����ɶ�");
		System.out.println(f.canWrite()?"�ļ���д":"�ļ�����д");
		System.out.println(f.isDirectory()?"��Ŀ¼":"����Ŀ¼");
		System.out.println(f.isFile()?"���ļ�":"�����ļ�");
		System.out.println(f.isAbsolute()?"�Ǿ���·��":"���Ǿ���·��");
		System.out.println("�ļ���С��"+f.length()+" Bytes");
	}
}