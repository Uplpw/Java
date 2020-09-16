//简介：自定义对角线布局管理器例程

import java.awt.Container;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;

class J_DiagonalLayout implements LayoutManager{
	public void addLayoutComponent(String name, Component comp)
	{	
	}
	
	public void removeLayoutComponent(Component comp)
	{
	}
	
	public Dimension preferredLayoutSize(Container parent){
		Dimension d=null;
		Insets s=parent.getInsets();
		Dimension dp=new Dimension(s.left+s.right, s.top+s.bottom);
		Component c;
		int n=parent.getComponentCount();
		
		for(int i=0;i<n;i++){
			c=parent.getComponent(i);
			if(c.isVisible()){
				d=c.getPreferredSize();
				dp.width+=d.width;
				dp.height+=d.height;
			}
		}
		return dp;
	}
	
	public Dimension minimumLayoutSize(Container parent){
		Dimension d=null;
		Insets s=parent.getInsets();
		Dimension dp=new Dimension(0, 0);
		Component c;
		int n=parent.getComponentCount();
		
		for(int i=0;i<n;i++){
			c=parent.getComponent(i);
			if(d.width>dp.width)
				dp.width=d.width;
			if(d.height>dp.height)
				dp.height=d.height;
		}
		
		dp.width+=(s.left+s.right);
		dp.height+=(s.top+s.bottom);
		return dp;
	}
	
	public void layoutContainer(Container parent){
		int i;
		int n=parent.getComponentCount();
		Component c;
		Insets s=parent.getInsets();
		Dimension d;
		Dimension dp=parent.getSize();
		Dimension dr=preferredLayoutSize(parent);
		Dimension dc=new Dimension(s.left, s.right);
		Dimension dg=new Dimension(dp.width-dr.width, dp.height-dr.height);
		
		if(n>1){
			dg.width/=(n-1);
			dg.height/=(n-1);
		}
		
		for(i=0;i<n;i++){
			c=parent.getComponent(i);
			if(c.isVisible()){
				d=c.getPreferredSize();
				c.setBounds(dc.width, dc.height, d.width, d.height);
				dc.width+=(dg.width+d.width);
				dc.height+=(dg.height+d.height);
			}
		}
	}
}
public class J_DiagonalLayoutExample {
	public static void main(String[] args){
		JFrame app=new JFrame("自定义对角线布局管理器");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(300, 200);
		Container c=app.getContentPane();
		c.setLayout(new J_DiagonalLayout());
		
		String s;
		JButton b;
		for(int i=0;i<5;i++){
			s="按钮"+(i+1);
			b=new JButton(s);
			c.add(b);
		}
		app.setVisible(true);
	}
}
