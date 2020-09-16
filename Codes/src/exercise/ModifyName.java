/**
 * 
 */
package exercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author lpw
 *
 */
public class ModifyName {
	public static boolean readfile(String filepath) throws FileNotFoundException, IOException {
		try {
			File file = new File(filepath);
			if (!file.isDirectory()) {
				System.out.println("文件");
			} else if (file.isDirectory()) {
				String[] filelist = file.list();
				for (int i = 0; i < filelist.length; i++) {
					File readfile = new File(filepath + "\\" + filelist[i]);
					File filedir=new File(readfile.getParentFile()+"\\models");
					if (readfile.isDirectory() && 
							!readfile.getParentFile().toString().equals("D:\\model\\sdm-net data\\Monitor")) {
						System.out.println("parentname=" + readfile.getParentFile());
						if(!filedir.exists()) { 
							filedir.mkdir();
						}
						//String name=readfile.getName();
						/*if(!name.substring(name.length()-3, name.length()).equals("obj")) {
							readfile.delete();
						}*/
						//System.out.println("name=" + readfile.getName());
						// readfile.delete();
						// System.out.println("path=" + readfile.getPath());
						// System.out.println("absolutepath=" + readfile.getAbsolutePath());
						// System.out.println("parentname=" + readfile.getParentFile());
						/*
						 * File filedir=new File(readfile.getParentFile()+"\\models");
						 * if(!filedir.exists()) { filedir.mkdir(); }
						 */
						// File file11=new File(readfile.getPath());
						// move(file11,readfile.getParentFile()+"\\models\\"+readfile.getName());
					} else if (readfile.isDirectory()) {
						readfile(filepath + "\\" + filelist[i]);
						/*
						 * if(readfile.getName().equals("models")) {
						 * 
						 * }else if(readfile.getParentFile().toString().equals("D:\\lpw\\Table")){
						 * System.out.println("parentname111=" + readfile.getParentFile());
						 * readfile(filepath + "\\" + filelist[i]); }else { del(readfile); }
						 */

						// System.out.println("parentname111=" + readfile.getParentFile());
						// readfile(filepath + "\\" + filelist[i]);
					}
				}
			}
		} catch (Exception e) {
			//(FileNotFoundException e) {
			System.out.println("readfile()   Exception:" + e.getMessage());
		}
		return true;
	}

	public static void writeFile() {
		try {
			File writeName = new File("output.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
			writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
			try (FileWriter writer = new FileWriter(writeName); BufferedWriter out = new BufferedWriter(writer)) {
				out.write("我会写入文件啦1\r\n"); // \r\n即为换行
				out.flush(); // 把缓存区内容压入文件
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void move(File old, String newfile) {
		old.renameTo(new File(newfile));
	}

	public static void del(File file) {
		if (file.exists()) {
			File[] files = file.listFiles();
			for (File file1 : files) {
				if (file1.isDirectory()) {
					del(file1);
				} else {
					file1.delete();
				}
			}
			file.delete();
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ModifyName.readfile("D:\\model\\sdm-net data\\Monitor");
		// ModifyName.del(new
		// File("D:\\lpw\\divide_with_face40000_111111111\\divide_with_face40000\\1015e71a0d21b127de03ab2a27ba7531\\models"));
	}
}

/*
 * if (!readfile.isDirectory()) { //System.out.println("path=" +
 * readfile.getPath()); //System.out.println("absolutepath=" +
 * readfile.getAbsolutePath()); //System.out.println("name=" +
 * readfile.getName()); //System.out.println("parentname=" +
 * readfile.getParentFile()); if(!readfile.getName().equals("readme.txt") &&
 * !readfile.getName().equals("back.obj") &&
 * !readfile.getName().equals("seat.obj") &&
 * !readfile.getName().equals("leg_ver_1.obj") &&
 * !readfile.getName().equals("leg_ver_2.obj") &&
 * !readfile.getName().equals("leg_ver_3.obj") &&
 * !readfile.getName().equals("leg_ver_4.obj") &&
 * !readfile.getName().equals("leg_ver_5.obj") &&
 * !readfile.getName().equals("leg_ver_6.obj") &&
 * !readfile.getName().equals("leg_ver_7.obj") &&
 * !readfile.getName().equals("leg_ver_8.obj") &&
 * !readfile.getName().equals("leg_ver_9.obj") &&
 * !readfile.getName().equals("leg_ver_10.obj") &&
 * !readfile.getName().equals("leg_ver_11.obj") &&
 * !readfile.getName().equals("leg_ver_12.obj") &&
 * !readfile.getName().equals("leg_ver_13.obj") &&
 * !readfile.getName().equals("leg_ver_14.obj") &&
 * !readfile.getName().equals("leg_ver_15.obj") &&
 * !readfile.getName().equals("leg_hor_1.obj") &&
 * !readfile.getName().equals("leg_hor_2.obj") &&
 * !readfile.getName().equals("leg_hor_3.obj") &&
 * !readfile.getName().equals("leg_hor_4.obj") &&
 * !readfile.getName().equals("leg_hor_5.obj") &&
 * !readfile.getName().equals("leg_hor_6.obj") &&
 * !readfile.getName().equals("leg_hor_7.obj") &&
 * !readfile.getName().equals("leg_hor_8.obj") &&
 * !readfile.getName().equals("leg_hor_9.obj") &&
 * !readfile.getName().equals("leg_hor_10.obj") &&
 * !readfile.getName().equals("leg_hor_11.obj") &&
 * !readfile.getName().equals("leg_hor_12.obj") &&
 * !readfile.getName().equals("leg_hor_13.obj") &&
 * !readfile.getName().equals("leg_hor_14.obj") &&
 * !readfile.getName().equals("leg_hor_15.obj") &&
 * !readfile.getName().equals("leg_hor_16.obj") &&
 * !readfile.getName().equals("leg_hor_17.obj") &&
 * !readfile.getName().equals("leg_hor_18.obj") &&
 * !readfile.getName().equals("hand_1.obj") &&
 * !readfile.getName().equals("hand_2.obj") &&
 * !readfile.getName().equals("model_normalized.obj")) { readfile.delete(); }
 */

/*
 * if(readfile.getName().contains("12")) { System.out.println("name=" +
 * readfile.getName()); } if(readfile.getName().contains("14")) {
 * System.out.println("name=" + readfile.getName()); }
 * if(readfile.getName().contains("8")) { System.out.println("name=" +
 * readfile.getName()); } if(readfile.getName().contains("13")) {
 * System.out.println("name=" + readfile.getName()); }
 * if(readfile.getName().contains("15")) { System.out.println("123456");
 * System.out.println("name=" + readfile.getName()); }
 * if(readfile.getName().contains("16")) { System.out.println("123456");
 * System.out.println("name=" + readfile.getName()); }
 */
