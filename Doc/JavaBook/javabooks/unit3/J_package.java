//简介:  私有类成员的访问

class J_month{
	private int m_month;  //私有成员
	
	public int mb_getmonth(){
		return m_month;
	}          //通过该方法获取  m_month 的值
	public int mb_setmonth(int m){
		if(m<1) m_month=1;
		else if(m>12) 
			m_month=12;
		else m_month=m;
		return m_month;
	}         //通过该方法设置  m_month 的值
}
class J_year{
	int m_year;
	
	public int mb_getyear(){
		return m_year;
	}          //通过该方法获取  m_month 的值
	public int mb_setyear(int y){
		if(y<1) m_year=1;
		else if(y>12) 
			m_year=12;
		else m_year=y;
		return m_year;
	}         //通过该方法设置  m_month 的值
}
public class J_package {
	public static void main(String[] args){
		J_month month_1=new J_month();
		J_year year_1=new J_year();          //创建对象

		//System.out.println(month_1.m_month);  不能直接访问 m_month
		System.out.println(year_1.m_year);    //可以直接访问
		
		System.out.println(month_1.mb_getmonth());
		System.out.println(year_1.mb_getyear());     //获取自己的成员值
		
		System.out.println(month_1.mb_setmonth(100));
		System.out.println(year_1.mb_setyear(10));    //设置自己的成员值
		
		//System.out.println(month_1.mb_getyear());
		//System.out.println(year_1.mb_getmonth());     //获取自己的成员值
	}

}
