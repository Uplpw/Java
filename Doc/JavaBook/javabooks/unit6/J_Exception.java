//��飺�쳣��������


public class J_Exception {
	public static void mb_throwException(){
		System.out.println("�������׳�ArithmeticException���͵��쳣");
		throw new ArithmeticException();
	}
	
	public static void mb_catchArrayException(){
		try{
			mb_throwException();
			System.out.println("��try�����еĶ������");
		}
		catch(ArrayIndexOutOfBoundsException e){//������쳣�������һ�£�������catch���
			System.err.println("����mb_catchArrayException�����쳣");
		}
		finally{
			System.out.println("����mb_catchArrayException��finally����");
		}
		System.out.println("����mb_catchArrayException���н���");
	}
	
	public static void main(String[] args){
		try{
			mb_catchArrayException();
		}
		catch(ArithmeticException e){
			System.err.println("����main�����쳣");
		}
		finally{
			System.out.println("����main��finally����");
		}
		System.out.println("�쳣�������");
	}
}
