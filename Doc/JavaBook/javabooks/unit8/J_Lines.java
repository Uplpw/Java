//简介：组合框、列表框、文本域和滚动窗格实例


import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class J_Lines extends JFrame{
	public J_Lines(){
		super("多行组件例程");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		String[] s={"选项1", "选项2", "选项3", "选项4"};
		JComboBox cb=new JComboBox(s);
		
		//cb.setEditable(true);
		//cb.setMaximumRowCount(3);
		//cb.setSelectedIndex(2);
		//cb.setSelectedItem("选项3");
		//System.out.println(cb.getSelectedIndex());
		//System.out.println(cb.getSelectedItem());
		
		JList t=new JList(s);
		JTextArea ta=new JTextArea("1\n2\n3\n4\n5", 3, 10);
		JScrollPane sta=new JScrollPane(ta);
		
		c.add(cb);
		c.add(t);
		c.add(sta);
		
		//组合框的创建及属性设定
		/*
		     public JComboBox(Object[] items)
		             参数items指定组合框的各个选项
		     
		     public void setEditable(boolean aFlag)
		            设置当前组合框是否可以自行输入一行文本信息 ，当参数aFlag为true时允许输入，
		     aFlag为false时不允许输入，默认不允许输入
		     
		     public void setMaximumRowCount(int count)
		             参数count指定组合框的下拉式列表中显示最大行数，若超过count则自动添加滚动条
		             
		     public void setSelectedIndex(int anIndex)
		             在程序中设置被选中的选项，即第(anIndex+1)项，
		             
		     public int setSelectedIndex()
		             返回组合框选中区域的对象在选项列表出现的第一个下标值
		             
		     public int setSelectedItem()
		             返回组合框选中区域的对象
 		 */
		
		//列表的创建和属性的设定
		/*
		  public JList(Object[] listData)
		     参数listData指定列表框的各个选项
		  
		  public JTextArea(String text, int rows, int columns)
		     参数text指定在文本域中显示的初始文本信息，rows和columns指定显示的行数和列数
		     通常给文本域加上滚动窗格(JScrollPane), 
		   
		  public JScrollPane(Component view)
		     实现滚动窗格的创建，view指定需要加上滚动条功能的组件，如文本域JTextArea
		 */
	}
	
	public static void main(String[] args){
		J_Lines app=new J_Lines();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(250, 200);
		app.setVisible(true);
	}
}
