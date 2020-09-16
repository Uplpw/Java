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
		System.out.println("文件名："+f.getName());
		System.out.println("文件路径："+f.getPath());
		System.out.println("绝对路径："+f.getAbsolutePath());
		System.out.println("父文件夹名："+f.getParent());
		System.out.println(f.exists()?"文件存在":"文件不存在");
		System.out.println(f.canRead()?"文件可读":"文件不可读");
		System.out.println(f.canWrite()?"文件可写":"文件不可写");
		System.out.println(f.isDirectory()?"是目录":"不是目录");
		System.out.println(f.isFile()?"是文件":"不是文件");
		System.out.println(f.isAbsolute()?"是绝对路径":"不是绝对路径");
		System.out.println("文件大小："+f.length()+" Bytes");
	}
}