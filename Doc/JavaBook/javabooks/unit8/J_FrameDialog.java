//��飺�ڶԻ�������ӱ�ǩ������


import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class J_FrameDialog {
	public static void main(String[] args){
		JFrame app=new JFrame("���");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(300,200);
		app.setVisible(true);
		
		JDialog d=new JDialog(app,"�Ի���",false);
		Container c=d.getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		c.add(new JLabel("����!"));
		d.setSize(100,100);
		d.setVisible(true);
	}
}
