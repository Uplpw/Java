//简介：网格布局管理器例程


import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class J_GridLayout {
	public static void main(String[] args){
		JFrame app=new JFrame("网格布局管理器");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(520,120);
		Container c=app.getContentPane();
		c.setLayout(new GridLayout(2,3));
		String s;
		JButton b;
		for(int i=0;i<5;i++){
			s="按钮"+(i+1);
			b=new JButton(s);
			c.add(b);
		}
		app.setVisible(true);
		
		//网格布局管理器的创建
		/*
		 * public GridLayout(int row, int col, int hgap, int vgap)
		 * 
		 * 参数row和col指定网格的行数和列数，若不含参数则默认为1
		 * 参数hgap和vgap指定两个相邻组件的水平间隙和竖直间隙，不含参数默认为0
		 */
		
		//流布局管理器的创建
		/*
		 * public FlowLayout(int align, int hgap, int vgap)
		 * 
		 * 参数align指定对齐方式（左对齐，中对齐，右对齐），若不含参数则默认为中对齐
		 * 参数hgap和vgap指定两个相邻组件的水平间隙和竖直间隙，不含参数默认为5
		 */
	}
}
