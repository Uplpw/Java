//简介：文本编辑例程


import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class J_Text {
	public static void main(String[] args){
		
		JFrame app=new JFrame("文本编辑框例程");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(320,180);
		Container c=app.getContentPane();
		c.setLayout(new FlowLayout());
		
		//构造文本编辑框数组
		JTextField[] t={
				new JTextField("正常文本:",8), new JTextField("显示", 15),
				new JTextField("密码文本:",8), new JPasswordField("显示", 15),
				new JTextField("正常文本:",8), new JTextField("kpl", 15),
				new JTextField("密码文本:",8), new JPasswordField("kpllpl", 15)
		}; 
		
		//设置文本是否可以编辑
		for(int i=0;i<t.length;i+=2)
			t[i].setEditable(false);
		
		//将文本编辑框加入容器
		for(int i=0;i<t.length;i++)
			c.add(t[i]);
		
		app.setVisible(true);
		
		//文本编辑框的创建
		/*
		 //文本编辑框的创建
		 public JTextField()  
		 public JTextField(String text)
		 public JTextField(int columns)
		 public JTextField(String text, int columns)
		 
		 //密码式文本编辑框的创建
		 public JPasswordField()
		 public JPasswordField(String text)
		 public JPasswordField(int columns)
		 public JPasswordField(String text, int columns)
		 
		 参数text指定在文本编辑框显示的初始文本信息
		 参数columns指定文本框的宽度
		 
		 //成员方法
		 public String getText()   获取文本信息
		 
		 public String setText(String s)   设置文本信息  s
		 */
	}
}
