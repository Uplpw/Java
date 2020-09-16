//简介：标准对话框例程

import javax.swing.JOptionPane;    //对话框模式类


public class J_DialogMode {
	public static void main(String[] args){
		
		JOptionPane.showMessageDialog(null, "您好!");    //消息对话框
		
		
		JOptionPane.showConfirmDialog(null,"您现在好吗？");   //确认对话框
		
		JOptionPane.showInputDialog(null, "您现在好吗？"); //文本框输入对话框
		
		String[] s={"好","不好"};
		JOptionPane.showInputDialog(null, "您现在好吗?",
							"输入", JOptionPane.QUESTION_MESSAGE, null,s,s[0]);
		//选择输入对话框
		
		
		/*几种对话框的使用方法*/
		
		//消息对话框
		/*
		 public static void showMessageDialog(Compoent parentCompoent, 
		 			Object message);
		 public static void showMessageDialog(Compoent parentCompoent, 
		 			Object message, String title, int messageType); 													
		 public static void showMessageDialog(Compoent parentCompoent, 
		 			Object message, String title, int messageType, Icon icon); 					
		 	
		 参数parentCompoent指定对话窗的父窗口, 参数message指定需要显示的信息
		 参数title指定对话框的标题, 若不含title, 则默认标题为 “消息”
		 参数messageType指定消息对话框显示的消息类型, 若不含则默认信息消息类型
		 						错误消息类型(JOptionPane.ERROR_MESSAGE)
		 						信息消息类型(JOptionPane.INFORMATION_MESSAGE)
		 						警告消息类型(JOptionPane.WARNING_MESSAGE)
		 						疑问消息类型(JOptionPane.QUESTION_MESSAGE)
		 						简单消息类型(JOptionPane.PLAIN_MESSAGE)
		 参数icon指定在消息对话框的图标
		 */
		
		//确认对话框
		/*
		 public static void showMessageDialog(Compoent parentCompoent, 
				 Object message);
	     public static void showMessageDialog(Compoent parentCompoent, 
				 Object message, String title, int optionType); 	
				 		
		 public static void showMessageDialog(Compoent parentCompoent, 
				 Object message, String title, int optionType, int messageType);
				 		 													
		 public static void showMessageDialog(Compoent parentCompoent, 
		  Object message, String title, int optionType,int messageType, Icon icon); 					
				 	
		  参数parentCompoent指定对话窗的父窗口, 参数message指定显示的提示信息
		  参数title指定对话框的标题, 若不含title, 则默认标题为 “选择一个选项”
		  
		  参数optionType对话框选项的模式,若不含, 则默认JOptionPane.YES_NO_OPTION
		  	   optionType=JOptionPane.YES_NO_OPTION, 只包含“是”和“否”按钮
		  	   optionType=JOptionPane.YES_NO_CANCEL_OPTION, 包含“是”,“否”,"取消"按钮
		  	   
		  参数messageType与参数icon上同
		 若没有参数messageType, 则确认对话框的默认消息类型是疑问消息类型
		 
		 生成确认对话框的成员方法会返回整数-1(关闭对话框), 0(单击"是"), 1(单击"否")
		 	, 2(单击"取消")
		  
	   */
		
		//文本输入对话框（可以输入字符串）
		/*
		 public static String showInputDialog(Compoent parentCompoent, 
				 Object message)
		 public static String showInputDialog(Compoent parentCompoent, 
				 Object message, Object initialSelectionValue)
		 public static String showInputDialog(Compoent parentCompoent, 
				 Object message, String title, int messageType)
				 
		  参数parentCompoent, message, title(若无默认输入), 
		  					messageType(若无默认疑问消息类型)含义上同，
		  参数initialSelectionValue指定文本框中显示的初始字符串
		  
		  成员方法有返回值, 单击"确定"返回输入的字符串, 单击"取消"返回null
		  
		 */
		
		//选择输入对话框
		/*
		 public static Object showInputDialog(Component parentCompoent,
		 		Object message, String title, int messageType, Icon icon
		 		Object[] selectionValues, Object initialSelectionVlaue)
		 
		   参数parentCompoent, message, title, messageType, icon含义与消息对话框同
		   参数selectionValues指定候选的字符串数组, 
		   参数initialSelectionVlaue指定在组合框中显示的初始化字符串选项
		*/
		//JOptionPane.YES_NO_CANCEL_OPTION
	}
}
