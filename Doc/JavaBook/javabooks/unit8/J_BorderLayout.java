//简介：边界布局管理器例程

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class J_BorderLayout {
	public static void main(String args[]){
		JFrame app=new JFrame("边界布局管理器");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(360,200);
		Container c=app.getContentPane();
		
		c.setLayout(new BorderLayout(10,10));
		//本句可省略，因为JFrame默认边界布局管理器
		
		c.add(new JButton("东"), BorderLayout.EAST);
		c.add(new JButton("西"), BorderLayout.WEST);
		c.add(new JButton("南"), BorderLayout.SOUTH);
		c.add(new JButton("北"), BorderLayout.NORTH);
		
		//向边界布局器管理中心位置添加面板
		JPanel p=new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		for(int i=0;i<5;i++){
			JButton bb=new JButton("***");
			p.add(bb);
		}
		
		c.add(p, BorderLayout.CENTER);
		app.setVisible(true);
		
		//布局管理器的创建
		/*
		 * public BorderLayout(int hgap, int vgap)
		 * 参数hgap和vgap指定两个相邻组件的水平间隙和竖直间隙，若不含则默认为0
		 */
	}
}
