//���: ��״�ӿ����̣��������˼�룬��̬��

interface J_Shape{
	public abstract double mb_getarea();  //���㲢������״�����
}//�ӿ�J_Shape����

class J_Circle implements J_Shape{
	public double m_x,m_y;         //Բ������
	public double m_r;           //Բ�뾶
	
	public J_Circle(double r){
		m_x=0;
		m_y=0;
		m_r=r;
	}//���췽��J_Circle����
	
	public J_Circle(double x,double y,double r){
		m_x=x;
		m_y=y;
		m_r=r;
	}//���췽��J_Circle����
	
	//���㲢����Բ���
	public double mb_getarea(){
		return (Math.PI*m_r*m_r);
	}
}

class J_Rectangle implements J_Shape{
	public double m_minX,m_minY;          //��һ���ǵ�����
	public double m_maxX,m_maxY;          //�ڶ����ǵ�����
	
	public J_Rectangle(double x1,double y1,double x2,double y2){
		if(x1<x2){
			m_minX=x1;
			m_maxX=x2;
		}
		else{
			m_minX=x2;
			m_maxX=x1;
		}
		if(y1<y2){
			m_minY=y1;
			m_maxY=y2;
		}
		else{
			m_minY=y2;
			m_maxY=y1;
		}
	}//J_Rectangle���췽������
	
	public double mb_getarea(){
		return ((m_maxY-m_minY)*(m_maxX-m_minX));
	}//����mb_getarea����
}
public class J_Area {
	public static void main(String[] args){
		J_Shape a=new J_Circle(5);        //aָ��J_Shape�����
		System.out.println("�뾶Ϊ5��Բ�����"+a.mb_getarea());
		
		a=new J_Rectangle(0,0,3,4);        //a����ָ��J_Rectangle�����
		System.out.println("�������ε������"+a.mb_getarea());
	}
}
