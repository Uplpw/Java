//简介：滑动条和面板例程


import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
public class J_SliderAndPanel {
	public static void main(String[] args){
		JFrame app=new JFrame("滑动条和面板例程");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(300, 200);
		
		Container c=app.getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider s=new JSlider(JSlider.HORIZONTAL, 0, 30, 10);
		//设定滑动条的属性，水平方向，最小值，最大值，初始值
		JPanel p=new JPanel();
		p.setPreferredSize(new Dimension(100, 60));
		//创建面板，并设定面板的大小
		p.setBackground(Color.green);
		//p.add(new JButton("123"));
		
		c.add(s);
		c.add(p);
		app.setVisible(true);
	}
}
