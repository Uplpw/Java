//简介: 自定义异常例程


class J_ExceptionNew extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//注释
	private static int m_number=0;
	
	public J_ExceptionNew(){
		m_number++;
	}
	
	public String toString(){
		return ("新异常出现"+m_number+"次");
	}
}

public class J_ExceptionNewExample {
	public static void main(String args[]){
		try{
			throw new J_ExceptionNew();
		}
		catch(J_ExceptionNew e){
			System.err.println(e);
			//通过类J_ExceptionNew的变量e调用成员方法 toString()，获得异常出现次数
		}
	}
}
