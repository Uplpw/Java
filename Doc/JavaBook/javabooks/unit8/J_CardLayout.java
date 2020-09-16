//简介：卡片布局管理器例程

import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class J_CardLayout {
	public static void main(String[] args){
		JFrame app=new JFrame("卡片布局管理器");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(180, 100);
		Container c=app.getContentPane();
		CardLayout card=new CardLayout();
		c.setLayout(card);
		String s;
		JButton b;
		for(int i=0;i<5;i++){
			s="按钮"+(i+1);
			b=new JButton(s);
			c.add(b, s);
			//添加组件（第一个参数），第二个参数指定组件的名称
		}
		
		card.show(c, "按钮3");
		//直接翻转到指定的组件，第一个参数是容器，第二个参数是组件的名称
		
		card.next(c);
		//将当前组件放到所有组件后面，同时把下一个组件变成当前组件
		
		app.setVisible(true);
		
		//卡片布局管理器的创建
		/*
		 * public CardLayout(int hgap, int vgap)
		 * 参数hgap和vgap指定组件和容器边界之间的水平间隙和竖直间隙，默认值为0
		 * 
		 */
	}
}
