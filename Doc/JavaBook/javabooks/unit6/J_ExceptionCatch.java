//���: �쳣��������


public class J_ExceptionCatch {
	public static void main(String[] args){
		try{
			System.out.println("try����");
			throw new Exception();    //�׳��쳣��֮�����䲻�ٴ���
		}
		catch(Exception e){     //����try������׳����쳣����ִ��catch���
			System.out.println("catch����");
			e.printStackTrace();  //����쳣�����ͺ��쳣�����ķ������ö�ջ������Ϣ
		}
		finally{    //����ǿ���˳�����Ȼ����ִ��finally���
			System.out.println("finally����");
		}
	}
}
