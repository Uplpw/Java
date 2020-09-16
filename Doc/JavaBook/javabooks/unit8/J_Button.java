//简介：命令式按钮、复选框和单选按钮例程


import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;    //单选按钮类
import javax.swing.ImageIcon;
import javax.swing.JButton;       //命令式按钮
import javax.swing.JCheckBox;    //复选框类
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class J_Button extends JFrame{
	public J_Button(){
		
		super("按钮例程");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		int i;
		//创建命令式按钮并添加到框架中
		ImageIcon[] ic={new ImageIcon("left.gif"), new ImageIcon("right.gif")};
		JButton[] b={new JButton("左", ic[0]), new JButton("中间"), 
										new JButton("右", ic[1])};
		for(i=0;i<b.length;i++)
			c.add(b[i]);
		
		//创建复选框并添加到框架中
		JCheckBox[] ck={new JCheckBox("左"), new JCheckBox("右")};
		for(i=0;i<ck.length;i++){
			c.add(ck[i]);
			ck[i].setSelected(true);  //设置选中状态
		}
		
		//创建单选按钮并添加到框架中
		//单选按钮的联动通过按钮组ButtonGroup实现
		JRadioButton[] r={new JRadioButton("左"), new JRadioButton("右")};
		ButtonGroup rg=new ButtonGroup();
		for(i=0;i<r.length;i++){
			c.add(r[i]);
			rg.add(r[i]);   //单选按钮联动的实现，将单选按钮添加到按钮组中
		}
		r[0].setSelected(true); //设置选中状态
		r[1].setSelected(true);
		
		
		//命令式按钮的创建
		/*
		 * public JButton()
		 * public JButton(Icon icon)
		 * public JButton(String text)
		 * public JButton(String text, Icon icon)
		 * 
		 * 参数icon指定命令式按钮的图标, 若没有则不含图标
		 * 参数text指定命令式按钮的文本信息, 若没有则不含文本信息
		 * 
		 */
		
		
		//复选框的创建
		/*
		 * public JCheckBox()
		 * public JCheckBox(Icon icon)
		 * public JCheckBox(Icon icon, boolean selected)
		 * public JCheckBox(String text)
		 * public JCheckBox(String text, boolean selected)
		 * public JCheckBox(String text, Icon icon)
		 * public JCheckBox(String text, Icon icon, boolean selected)
		 * 
		 * 参数icon指定复选框的图标, 若没有则不含图标
		 * 参数text指定复选框的文本信息, 若没有则不含文本信息
		 * 参数selected为true时指定复选框是否处于被选中状态,否则处于未选中状态
		 * 
		 */
		
		
		//单选按钮的创建
		/*
		 * public JRadioButton()
		 * public JRadioButton(Icon icon)
		 * public JRadioButton(Icon icon, boolean selected)
		 * public JRadioButton(String text)
		 * public JRadioButton(String text, boolean selected)
		 * public JRadioButton(String text, Icon icon)
		 * public JRadioButton(String text, Icon icon, boolean selected)
		 * 
		 * 参数icon\selected\text含义上同
		 */
	}
	
	public static void main(String[] args){
		
		J_Button app=new J_Button();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(200, 120);
		app.setVisible(true);
		
	}
}


