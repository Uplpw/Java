//��飺������java.lang.Runtime��Ӧ������


public class J_RuntimeExample {
	public static void main(String args[]){
		Runtime r=Runtime.getRuntime();   //���Ψһ���������ֵ
		System.out.println("������������"+r.availableProcessors());
		try{
			r.exec("cmd /c start dir");
			r.exec("notepad");
		}
		catch(Exception e){
			System.err.println("�����������쳣��");
			e.printStackTrace();
		}
		System.out.println("���õ�����ڴ�Ϊ"+r.maxMemory());
		System.out.println("���ڵ����ڴ�Ϊ"+r.totalMemory());
		System.out.println("���ڿ����ڴ�Ϊ"+r.freeMemory());
		r.gc();
		System.out.println("���ڿ����ڴ�Ϊ"+r.freeMemory());
	}
}
