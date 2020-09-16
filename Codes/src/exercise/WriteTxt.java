/**
 * 
 */
package exercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author lpw
 *
 */
public class WriteTxt {
	public static String readfile(String filepath) throws FileNotFoundException, IOException {
		String name="";
		try {
			File file = new File(filepath);
			if (!file.isDirectory()) {
				System.out.println("文件");
				System.out.println("path=" + file.getPath());
				System.out.println("absolutepath=" + file.getAbsolutePath());
				System.out.println("name=" + file.getName());
			} else if (file.isDirectory()) {
				// System.out.println("文件夹");
				String[] filelist = file.list();
				for (int i = 0; i < filelist.length; i++) {
					File readfile = new File(filepath + "\\" + filelist[i]);
					if (!readfile.isDirectory()) {
						//System.out.println("path=" + readfile.getPath());
						//System.out.println("absolutepath=" + readfile.getAbsolutePath());
						//System.out.println("parentname=" + readfile.getParentFile());
						/*if(readfile.getName().equals("111.txt")) {
							System.out.println("lpw");
							readfile.renameTo(new File(readfile.getParentFile()+"\\"+"112.txt"));
						}*/
						String str=readfile.getName().substring(0,readfile.getName().length()-4);
						
						name=name+str+"\n";
						System.out.println(str+" "+"1");
						//String str=readfile.getName().substring(0,readfile.getName().length()-4);
						//System.out.println(str);
					} else if (readfile.isDirectory()) {
						readfile(filepath + "\\" + filelist[i]);
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("readfile()   Exception:" + e.getMessage());
		}
		return name;
	}
	
	public static void writeFile(String name) {
		try {
			File writeName = new File("C:\\Users\\Public\\Desktop\\name.txt");
			Writer out = new FileWriter(writeName);
			out.write(name);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String name=WriteTxt.readfile("D:\\software_relax\\Tencent\\QQ Files\\QQ data\\3609548930\\FileRecv\\pic");
		try {
			BufferedWriter out=new BufferedWriter(new FileWriter("1.txt"));
			out.write(name);
			out.close();
			System.out.println("lpw");
		}catch(IOException e) {
		}
	}
}
