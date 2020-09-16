//简介：职工和老师之间的继承

class J_Employee{
	public int m_workyear;          //工作的年限
	
	public J_Employee(){
		m_workyear=1;
	}//J_Employee构造方法结束
}

class Teacher extends J_Employee{
	public int m_classhour;       //授课课时
	
	public Teacher(){
		m_classhour=99;
	}//J_Teacher构造方法结束
	
	public void printInfo(){            
		System.out.println("该职工的工作年限为"+m_workyear);
		System.out.println("该职工的工作时长为"+m_classhour);
	}
}
public class J_Teacher{
	public static void main(String[] args){
		Teacher teacher1=new Teacher();
		teacher1.printInfo();
	}
}
