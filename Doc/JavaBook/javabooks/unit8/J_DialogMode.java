//��飺��׼�Ի�������

import javax.swing.JOptionPane;    //�Ի���ģʽ��


public class J_DialogMode {
	public static void main(String[] args){
		
		JOptionPane.showMessageDialog(null, "����!");    //��Ϣ�Ի���
		
		
		JOptionPane.showConfirmDialog(null,"�����ں���");   //ȷ�϶Ի���
		
		JOptionPane.showInputDialog(null, "�����ں���"); //�ı�������Ի���
		
		String[] s={"��","����"};
		JOptionPane.showInputDialog(null, "�����ں���?",
							"����", JOptionPane.QUESTION_MESSAGE, null,s,s[0]);
		//ѡ������Ի���
		
		
		/*���ֶԻ����ʹ�÷���*/
		
		//��Ϣ�Ի���
		/*
		 public static void showMessageDialog(Compoent parentCompoent, 
		 			Object message);
		 public static void showMessageDialog(Compoent parentCompoent, 
		 			Object message, String title, int messageType); 													
		 public static void showMessageDialog(Compoent parentCompoent, 
		 			Object message, String title, int messageType, Icon icon); 					
		 	
		 ����parentCompoentָ���Ի����ĸ�����, ����messageָ����Ҫ��ʾ����Ϣ
		 ����titleָ���Ի���ı���, ������title, ��Ĭ�ϱ���Ϊ ����Ϣ��
		 ����messageTypeָ����Ϣ�Ի�����ʾ����Ϣ����, ��������Ĭ����Ϣ��Ϣ����
		 						������Ϣ����(JOptionPane.ERROR_MESSAGE)
		 						��Ϣ��Ϣ����(JOptionPane.INFORMATION_MESSAGE)
		 						������Ϣ����(JOptionPane.WARNING_MESSAGE)
		 						������Ϣ����(JOptionPane.QUESTION_MESSAGE)
		 						����Ϣ����(JOptionPane.PLAIN_MESSAGE)
		 ����iconָ������Ϣ�Ի����ͼ��
		 */
		
		//ȷ�϶Ի���
		/*
		 public static void showMessageDialog(Compoent parentCompoent, 
				 Object message);
	     public static void showMessageDialog(Compoent parentCompoent, 
				 Object message, String title, int optionType); 	
				 		
		 public static void showMessageDialog(Compoent parentCompoent, 
				 Object message, String title, int optionType, int messageType);
				 		 													
		 public static void showMessageDialog(Compoent parentCompoent, 
		  Object message, String title, int optionType,int messageType, Icon icon); 					
				 	
		  ����parentCompoentָ���Ի����ĸ�����, ����messageָ����ʾ����ʾ��Ϣ
		  ����titleָ���Ի���ı���, ������title, ��Ĭ�ϱ���Ϊ ��ѡ��һ��ѡ�
		  
		  ����optionType�Ի���ѡ���ģʽ,������, ��Ĭ��JOptionPane.YES_NO_OPTION
		  	   optionType=JOptionPane.YES_NO_OPTION, ֻ�������ǡ��͡��񡱰�ť
		  	   optionType=JOptionPane.YES_NO_CANCEL_OPTION, �������ǡ�,����,"ȡ��"��ť
		  	   
		  ����messageType�����icon��ͬ
		 ��û�в���messageType, ��ȷ�϶Ի����Ĭ����Ϣ������������Ϣ����
		 
		 ����ȷ�϶Ի���ĳ�Ա�����᷵������-1(�رնԻ���), 0(����"��"), 1(����"��")
		 	, 2(����"ȡ��")
		  
	   */
		
		//�ı�����Ի��򣨿��������ַ�����
		/*
		 public static String showInputDialog(Compoent parentCompoent, 
				 Object message)
		 public static String showInputDialog(Compoent parentCompoent, 
				 Object message, Object initialSelectionValue)
		 public static String showInputDialog(Compoent parentCompoent, 
				 Object message, String title, int messageType)
				 
		  ����parentCompoent, message, title(����Ĭ������), 
		  					messageType(����Ĭ��������Ϣ����)������ͬ��
		  ����initialSelectionValueָ���ı�������ʾ�ĳ�ʼ�ַ���
		  
		  ��Ա�����з���ֵ, ����"ȷ��"����������ַ���, ����"ȡ��"����null
		  
		 */
		
		//ѡ������Ի���
		/*
		 public static Object showInputDialog(Component parentCompoent,
		 		Object message, String title, int messageType, Icon icon
		 		Object[] selectionValues, Object initialSelectionVlaue)
		 
		   ����parentCompoent, message, title, messageType, icon��������Ϣ�Ի���ͬ
		   ����selectionValuesָ����ѡ���ַ�������, 
		   ����initialSelectionVlaueָ������Ͽ�����ʾ�ĳ�ʼ���ַ���ѡ��
		*/
		//JOptionPane.YES_NO_CANCEL_OPTION
	}
}
