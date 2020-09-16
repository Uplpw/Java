import java.awt.*;
import java.awt.event.*;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import java.awt.GridLayout;

//创建Data类，定义操作数和操作符
class Data{
  public double op1;
  public double op2;
  public int op=-1;
}

//创建Service类，定义并实现各种操作
class Service{
	
	//操作数用String字符串进行保存，更新
	public String option1="0";
	public String option2="0";
	
	//创建Data类实例对象data
    Data data=new Data();
    
    //定义方法inputNumber()，实现接收两个操作数，并返回
    public String inputNumber(String op,String number)
    {
    	String tmp;
         if(data.op==-1)
         {
        	 option1 = op+number;
        	 tmp=option1;
         }
         
         else{
        	 option2=op+number;
        	 tmp=option2;
         }
         return tmp;
    }//方法inputNumber()结束

    //定义方法clickAdd()，实现(x+y)运算
    public void clickAdd()
    {
         data.op=1;
    }//方法clickAdd()结束，

    //定义方法clickSub()，实现(x-y)运算
    public void clickSub()
    {
         data.op=2;
    }//方法clickSub()结束

    //定义方法clickMul()，实现(x*y)运算
    public void clickMul()
    {
         data.op=3;
    }//方法clickMul()结束

    //定义方法clickDiv()，实现(x/y)运算
    public void clickDiv()
    {
         data.op=4;
    }//方法clickDiv()结束

    //定义方法clickLog()，实现(log10(x))运算
    public void clickLog()
    {
         data.op=5;
    }//方法clickLog()结束

    //定义方法clickXy()，实现(x^y)运算
    public void clickXy()
    {
         data.op=6;
    }//方法clickXy()结束

    //定义方法clickSqrt()，实现(sqrt(x))运算
    public void clickSqrt()
    {
         data.op=7;
    }//方法clickSqrt()结束

    //定义方法clickRecip()，实现(1/x)运算
    public void clickRecip()
    {
         data.op=8;
    }//方法clickRecip()结束
    
    //定义方法clickSin()，实现(sin(x))运算
    public void clickSin()
    {
    	data.op=9;
    }//方法clickSin()结束
    
    //定义方法clickCos()，实现(cos(x))运算
    public void clickCos()
    {
    	data.op=10;
    }//方法clickCos()结束
    
    //定义方法 clickPoint()，实现小数点的输入
    public String clickPoint()
    {
    	String str;
    	
    	if(data.op==-1)     //第一个操作数有小数点
    	{
    		if(option1=="-")    //当第一个操作数有负号时
    			option1=option1+"0.";
    		else               //当第一个操作数没有负号时
    			option1=option1+".";
    		str=option1;
    	}
    	else{                   //第二个操作数有小数点
    		if(option2=="-")     //当第二个操作数有负号时
    			option2=option2+"0.";
    		else               //当第二个操作数没有负号时
    			option2=option2+".";
    		str=option2;
    	}
    	return str;          //返回输入小数点后的字符串
    }//方法clickPoint()结束
    
    //定义方法clickSign()，输入操作数的正负号
    public String clickSign()
    {
    	String str;
    	
    	if(data.op==-1){     //第一个操作数有负号
    		option1="-";
    		str=option1;
    	}
    	else{
    		option2="-";      //第二个操作数有负号
        	str=option2;
    	}
    	return str;
    }//方法clickSign()结束
    
    //定义方法clickDe()，实现删除操作
    public String clickDe()
    {
    	String str;
    	
 	   if(data.op==-1){          //删除第一个操作数的最后一位
 		  option1=option1.substring(0, option1.length()-1);
		   str=option1;
 	   }
 	   else{                   //删除第二个操作数的最后一位
 		  option2=option2.substring(0, option2.length()-1);
		   str=option2;
 	   }
 	   return str;           //返回删除后的字符串
    }//方法clickDe()结束
    
    //定义方法ce()，实现清除操作
    public void ce()
    {
    	data.op=-1;
    	option1="0";
    	option2="0";
    }//方法ce()结束

    //定义方法equal()，实现各种运算的输出
    public String equal()
    {
    	//将String型的操作数转换为double型
    	data.op1=Double.parseDouble(option1);  
    	data.op2=Double.parseDouble(option2);
    	
    	//当没有运算符就点击等号
    	if(data.op==-1)
    		data.op=1;
    	
    	option2="0";     //确定第二个操作数可以直接点".";
    	
    	//判断操作符的类型
        switch(data.op)
        {   
           case 1 :   
        	   String str1=new Double(data.op1+data.op2).toString();
        	   //将两个double型操作数进行加法运算后再转换为String型
        	   option1=str1;  //将运算后的结果赋值第一个操作数
        	   data.op=-1;    //可以对结果进行删除操作
        	   return str1;  //返回运算后的结果
           case 2 :   
        	   String str2=new Double(data.op1-data.op2).toString(); 
        	   option1=str2;
        	   data.op=-1;
        	   return str2;
	       case 3 :   
	    	   String str3=new Double(data.op1*data.op2).toString();
	    	   option1=str3;
	    	   data.op=-1;
	    	   return str3;
           case 4 :   
        	   String str4=new Double(data.op1/data.op2).toString(); 
        	   option1=str4;
        	   data.op=-1;
        	   return str4;
           case 5 :   
        	   String str5=new Double(Math.log10(data.op1)).toString();
        	   option1=str5;
        	   data.op=-1;
        	   return str5;
           case 6 :   
        	   String str6=new Double(Math.pow(data.op1, data.op2)).toString(); 
        	   option1=str6;
        	   data.op=-1;
           	   return str6;
           case 7 :   
        	   String str7=new Double(Math.sqrt(data.op1)).toString();
        	   option1=str7;
        	   data.op=-1;
        	   return str7;
           case 8 :   
        	   String str8=new Double(1/data.op1).toString();
        	   option1=str8;
        	   data.op=-1;
        	   return str8; 
           case 9 :   
        	   String str9=new Double(Math.sin(data.op1)).toString();
        	   option1=str9;
        	   data.op=-1;
        	   return str9;
           case 10 :   
        	   String str10=new Double(Math.cos(data.op1)).toString();
        	   option1=str10;
        	   data.op=-1;
        	   return str10;
           default: return null; 
       }

    }
}
public class calculator{
	public static void main(String args[]){
		
		JFrame f=new JFrame("Calculator");   //创建顶层容器
		java.awt.Container c=f.getContentPane();   //获取顶层容器的内容窗格
		c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));   
		//创建盒式布局，组件按列排列
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(320, 210);
		
		//创建Panel
		Panel[] p=new Panel[2];
		for(int i=0;i<2;i++){
			p[i]=new Panel();
			p[i].setBackground(Color.gray);
			//p[i].setVisible(true);
		}
		
		//第一个Panel中的设置
		//p[0].setLocation(0,50);
		p[0].setPreferredSize(new Dimension(240,50));
		p[0].setLayout(new FlowLayout());
		final TextField textField = new TextField(30);
		p[0].add(textField);
		f.add(p[0]);
		
		//创建按钮组件
		Button number0Button = new Button("0");
		Button number1Button = new Button("1");
		Button number2Button = new Button("2");
		Button number3Button = new Button("3");
		Button number4Button = new Button("4");
		Button number5Button = new Button("5");
		Button number6Button = new Button("6");
		Button number7Button = new Button("7");
		Button number8Button = new Button("8");
        Button number9Button = new Button("9");
                
		Button addButton = new Button("+");
		Button subButton = new Button("-");
		Button mulButton = new Button("*");
 		Button divButton = new Button("/");
		Button logButton = new Button("log");
		Button xyButton = new Button("x^y");
		Button sqrtButton = new Button("√");
 		Button recipButton = new Button("1/x");
 		Button sinButton = new Button("sin");
		Button cosButton = new Button("cos");
		Button signButton = new Button("+/-");
		Button pointButton = new Button(".");
		Button equalButton = new Button("=");
		Button ceButton = new Button("CE");
		Button deButton = new Button("DE");
		
		//第二个Panel的设置
		//p[1].setLocation(100,150);
		p[1].setPreferredSize(new Dimension(120,120));
		GridLayout gl1=new GridLayout(5,5);
		p[1].setLayout(gl1);
		
		//添加按钮组件
		p[1].add(sinButton);
		p[1].add(cosButton);
		p[1].add(ceButton);
		p[1].add(deButton);
		p[1].add(addButton);
		
		p[1].add(logButton);
		p[1].add(number7Button);
		p[1].add(number8Button);
		p[1].add(number9Button);
		p[1].add(subButton);
		
		p[1].add(xyButton);
		p[1].add(number4Button);
		p[1].add(number5Button);
		p[1].add(number6Button);
		p[1].add(mulButton);

		p[1].add(sqrtButton);
		p[1].add(number1Button);
		p[1].add(number2Button);
		p[1].add(number3Button);
		p[1].add(divButton);
		
		p[1].add(recipButton);	
		p[1].add(signButton);
		p[1].add(number0Button);
		p[1].add(pointButton);
		p[1].add(equalButton);
		f.add(p[1]);
		f.setVisible(true);
		
		//创建类Service类的实例对象service
		final Service service=new Service();
		
		//按钮组件的动作事件的处理
		number0Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textField.setText(
						service.inputNumber(
								textField.getText(),e.getActionCommand())); 
				}
			}); 

        number1Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	textField.setText(
            			service.inputNumber(
            					textField.getText(),e.getActionCommand()));
            	}
            }); 

        number2Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
            	textField.setText(
                		service.inputNumber(
                				textField.getText(),e.getActionCommand())); 
            	}
            }); 
        
        number3Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				textField.setText(
						service.inputNumber(
								textField.getText(),e.getActionCommand())); 
				}
			}); 

        number4Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	textField.setText(
            			service.inputNumber(
            					textField.getText(),e.getActionCommand()));
            	}
            }); 

        number5Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
            	textField.setText(
                		service.inputNumber(
                				textField.getText(),e.getActionCommand())); 
            	}
            }); 
        
        number6Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				textField.setText(
						service.inputNumber(
								textField.getText(),e.getActionCommand())); 
				}
			}); 

        number7Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	textField.setText(
            			service.inputNumber(
            					textField.getText(),e.getActionCommand()));
            	}
            }); 

        number8Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
            	textField.setText(
                		service.inputNumber(
                				textField.getText(),e.getActionCommand())); 
            	}
            }); 
        
        number9Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				textField.setText(
						service.inputNumber(
								textField.getText(),e.getActionCommand())); 
				}
			}); 
        
        addButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
            	textField.setText("");
                service.clickAdd(); 
                }
            });
        
        subButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
            	textField.setText("");
                service.clickSub(); 
                }
            }); 
        
        mulButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
            	textField.setText("");
                service.clickMul(); 
                }
            }); 
        
        divButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
            	textField.setText("");
            	service.clickDiv();
            	}
            });
        
        logButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
            	textField.setText("");
            	service.clickLog();
            	}
            });
        
        xyButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
            	textField.setText("");
            	service.clickXy();
            	}
            });
        
        sqrtButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
            	textField.setText("");
            	service.clickSqrt();
            	}
            });
        
        recipButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
            	textField.setText("");
            	service.clickRecip();
            	}
            });
        
        sinButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
            	textField.setText("");
            	service.clickSin();
            	}
            });
        
        cosButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
            	textField.setText("");
            	service.clickCos();
            	}
            });
        
        pointButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
            	textField.setText(service.clickPoint());
            	}
            });
        
        signButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
            	textField.setText(service.clickSign());
            	}
            });
        
        deButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
            	textField.setText(service.clickDe());
            	}
            });
        
        
        equalButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	textField.setText(service.equal()); 
            	}
            }); 
        
        ceButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	textField.setText(null); 
            	service.ce();
            	}
            }); 
        
		f.setVisible(true) ;
	}
}
