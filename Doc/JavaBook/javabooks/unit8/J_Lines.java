//��飺��Ͽ��б���ı���͹�������ʵ��


import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class J_Lines extends JFrame{
	public J_Lines(){
		super("�����������");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		String[] s={"ѡ��1", "ѡ��2", "ѡ��3", "ѡ��4"};
		JComboBox cb=new JComboBox(s);
		
		//cb.setEditable(true);
		//cb.setMaximumRowCount(3);
		//cb.setSelectedIndex(2);
		//cb.setSelectedItem("ѡ��3");
		//System.out.println(cb.getSelectedIndex());
		//System.out.println(cb.getSelectedItem());
		
		JList t=new JList(s);
		JTextArea ta=new JTextArea("1\n2\n3\n4\n5", 3, 10);
		JScrollPane sta=new JScrollPane(ta);
		
		c.add(cb);
		c.add(t);
		c.add(sta);
		
		//��Ͽ�Ĵ����������趨
		/*
		     public JComboBox(Object[] items)
		             ����itemsָ����Ͽ�ĸ���ѡ��
		     
		     public void setEditable(boolean aFlag)
		            ���õ�ǰ��Ͽ��Ƿ������������һ���ı���Ϣ ��������aFlagΪtrueʱ�������룬
		     aFlagΪfalseʱ���������룬Ĭ�ϲ���������
		     
		     public void setMaximumRowCount(int count)
		             ����countָ����Ͽ������ʽ�б�����ʾ���������������count���Զ���ӹ�����
		             
		     public void setSelectedIndex(int anIndex)
		             �ڳ��������ñ�ѡ�е�ѡ�����(anIndex+1)�
		             
		     public int setSelectedIndex()
		             ������Ͽ�ѡ������Ķ�����ѡ���б���ֵĵ�һ���±�ֵ
		             
		     public int setSelectedItem()
		             ������Ͽ�ѡ������Ķ���
 		 */
		
		//�б�Ĵ��������Ե��趨
		/*
		  public JList(Object[] listData)
		     ����listDataָ���б��ĸ���ѡ��
		  
		  public JTextArea(String text, int rows, int columns)
		     ����textָ�����ı�������ʾ�ĳ�ʼ�ı���Ϣ��rows��columnsָ����ʾ������������
		     ͨ�����ı�����Ϲ�������(JScrollPane), 
		   
		  public JScrollPane(Component view)
		     ʵ�ֹ�������Ĵ�����viewָ����Ҫ���Ϲ��������ܵ���������ı���JTextArea
		 */
	}
	
	public static void main(String[] args){
		J_Lines app=new J_Lines();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(250, 200);
		app.setVisible(true);
	}
}
