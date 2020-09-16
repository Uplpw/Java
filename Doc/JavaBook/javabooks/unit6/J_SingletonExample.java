//简介：单体实现例程（单体：允许只有一个实例对象）


class J_Singleton {
	private static J_Singleton m_object=new J_Singleton();//创建实例对象
	
	private J_Singleton(){
	}
	//定义构造方法：不允许自行创建此类的实例对象
	
	public static J_Singleton mb_getObject(){
		return m_object;
	}
}

/*改写类J_Singleton
 * 
 * class J_Singleton {
	private static J_Singleton m_object;
	
	private J_Singleton(){
	}
	//定义构造方法：不允许自行创建此类的实例对象
	
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
		//a,b仅是实例对象的引用
		//换成 J_Singleton a=new J_Singleton();出现编译错误,不允许访问构造方法
		if(a==b)
			System.out.println("a和b指向同一个实例对象。");
		else
			System.out.println("a和b指向不同的实例对象。");
	}
}
