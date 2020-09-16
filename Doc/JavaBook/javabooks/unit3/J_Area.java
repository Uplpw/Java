//简介: 形状接口例程（面向对象思想，多态）

interface J_Shape{
	public abstract double mb_getarea();  //计算并返回形状的面积
}//接口J_Shape结束

class J_Circle implements J_Shape{
	public double m_x,m_y;         //圆心坐标
	public double m_r;           //圆半径
	
	public J_Circle(double r){
		m_x=0;
		m_y=0;
		m_r=r;
	}//构造方法J_Circle结束
	
	public J_Circle(double x,double y,double r){
		m_x=x;
		m_y=y;
		m_r=r;
	}//构造方法J_Circle结束
	
	//计算并返回圆面积
	public double mb_getarea(){
		return (Math.PI*m_r*m_r);
	}
}

class J_Rectangle implements J_Shape{
	public double m_minX,m_minY;          //第一个角点坐标
	public double m_maxX,m_maxY;          //第二个角点坐标
	
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
	}//J_Rectangle构造方法结束
	
	public double mb_getarea(){
		return ((m_maxY-m_minY)*(m_maxX-m_minX));
	}//方法mb_getarea结束
}
public class J_Area {
	public static void main(String[] args){
		J_Shape a=new J_Circle(5);        //a指向J_Shape类对象
		System.out.println("半径为5的圆面积是"+a.mb_getarea());
		
		a=new J_Rectangle(0,0,3,4);        //a重新指向J_Rectangle类对象
		System.out.println("给定矩形的面积是"+a.mb_getarea());
	}
}
