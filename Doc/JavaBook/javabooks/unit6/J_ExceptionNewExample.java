//���: �Զ����쳣����


class J_ExceptionNew extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//ע��
	private static int m_number=0;
	
	public J_ExceptionNew(){
		m_number++;
	}
	
	public String toString(){
		return ("���쳣����"+m_number+"��");
	}
}

public class J_ExceptionNewExample {
	public static void main(String args[]){
		try{
			throw new J_ExceptionNew();
		}
		catch(J_ExceptionNew e){
			System.err.println(e);
			//ͨ����J_ExceptionNew�ı���e���ó�Ա���� toString()������쳣���ִ���
		}
	}
}
