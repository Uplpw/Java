//���:  ˽�����Ա�ķ���

class J_month{
	private int m_month;  //˽�г�Ա
	
	public int mb_getmonth(){
		return m_month;
	}          //ͨ���÷�����ȡ  m_month ��ֵ
	public int mb_setmonth(int m){
		if(m<1) m_month=1;
		else if(m>12) 
			m_month=12;
		else m_month=m;
		return m_month;
	}         //ͨ���÷�������  m_month ��ֵ
}
class J_year{
	int m_year;
	
	public int mb_getyear(){
		return m_year;
	}          //ͨ���÷�����ȡ  m_month ��ֵ
	public int mb_setyear(int y){
		if(y<1) m_year=1;
		else if(y>12) 
			m_year=12;
		else m_year=y;
		return m_year;
	}         //ͨ���÷�������  m_month ��ֵ
}
public class J_package {
	public static void main(String[] args){
		J_month month_1=new J_month();
		J_year year_1=new J_year();          //��������

		//System.out.println(month_1.m_month);  ����ֱ�ӷ��� m_month
		System.out.println(year_1.m_year);    //����ֱ�ӷ���
		
		System.out.println(month_1.mb_getmonth());
		System.out.println(year_1.mb_getyear());     //��ȡ�Լ��ĳ�Աֵ
		
		System.out.println(month_1.mb_setmonth(100));
		System.out.println(year_1.mb_setyear(10));    //�����Լ��ĳ�Աֵ
		
		//System.out.println(month_1.mb_getyear());
		//System.out.println(year_1.mb_getmonth());     //��ȡ�Լ��ĳ�Աֵ
	}

}
