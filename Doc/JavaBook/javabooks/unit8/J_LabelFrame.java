//简介：在框架中添加标签


import java.awt.*;
import javax.swing.*;
public class J_LabelFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//创建Frame的子类J_LabelFrame
	public J_LabelFrame(){
		String[] s={"文本标签","文本在图标的左侧","文本在图标的下方"};
		//设置标签的文字内容
		
		ImageIcon[] ic={null, new ImageIcon("img.jpg"), new ImageIcon("img.jpg")};
		//设置标签的图标/照片
		
		int ih[]={0, JLabel.LEFT, JLabel.CENTER};
		int iv[]={0, JLabel.CENTER, JLabel.BOTTOM};
		//设置标签图标和文字内容的对应方式
		
		Container c=getContentPane();//获取容器的内容窗格，以便添加组件
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		//设置   容器/框架   的布局方式
		
		for(int i=0;i<3;i++){
			JLabel aLabel=new JLabel(s[i],ic[i],JLabel.LEFT);
			if(i>0){
				aLabel.setHorizontalTextPosition(ih[i]);//水平方向对齐方式
				aLabel.setVerticalTextPosition(iv[i]);//竖直方向对齐方式
			}
			aLabel.setToolTipText("第"+(i+1)+"个标签");
			
			c.add(aLabel);
			//将标签组件添加到   容器/框架   中
		}
		//调用标签方法对标签进行操作
	}
	
	public static void main(String[] args){
		J_LabelFrame app=new J_LabelFrame();
		//创建   容器/框架   对象实例
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置该   容器/框架   可以关闭
		
		app.setSize(360,150);//设置大小
		app.setVisible(true);//设置是否可见
	}
}
