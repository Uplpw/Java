//��飺����ʵ�����̣����壺����ֻ��һ��ʵ������


class J_Singleton {
	private static J_Singleton m_object=new J_Singleton();//����ʵ������
	
	private J_Singleton(){
	}
	//���幹�췽�������������д��������ʵ������
	
	public static J_Singleton mb_getObject(){
		return m_object;
	}
}

/*��д��J_Singleton
 * 
 * class J_Singleton {
	private static J_Singleton m_object;
	
	private J_Singleton(){
	}
	//���幹�췽�������������д��������ʵ������
	
	public static J_Singleton mb_getObject(){
		if(m_object==null)
			m_object=new J_Singleton();
		return m_object;
	}
}
*/

public class J_SingletonExample{
	public static void main(String[] args){
		J_Singleton a=J_Singleton.mb_getObject();
		J_Singleton b=J_Singleton.mb_getObject();
		//a,b����ʵ�����������
		//���� J_Singleton a=new J_Singleton();���ֱ������,��������ʹ��췽��
		if(a==b)
			System.out.println("a��bָ��ͬһ��ʵ������");
		else
			System.out.println("a��bָ��ͬ��ʵ������");
	}
}
