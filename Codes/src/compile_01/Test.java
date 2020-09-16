package compile_01;

public class Test {
	public static void main(String[] args) {
		FileProcess fileProcess=new FileProcess();
		fileProcess.fileProcess("D:\\大三下-电子版作业\\my_compile\\lib_01\\file_02.txt");
		Grammer grammer=new Grammer();
		grammer.setGrammer(fileProcess.getStringVn(), fileProcess.getStringVt(), 
								fileProcess.getStringP(), fileProcess.getStringS());
		grammer.getGrammer();
	}
}
