import java.awt.*;
import java.awt.event.*;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import java.awt.GridLayout;

//����Data�࣬����������Ͳ�����
class Data{
  public double op1;
  public double op2;
  public int op=-1;
}

//����Service�࣬���岢ʵ�ָ��ֲ���
class Service{
	
	//��������String�ַ������б��棬����
	public String option1="0";
	public String option2="0";
	
	//����Data��ʵ������data
    Data data=new Data();
    
    //���巽��inputNumber()��ʵ�ֽ���������������������
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
    }//����inputNumber()����

    //���巽��clickAdd()��ʵ��(x+y)����
    public void clickAdd()
    {
         data.op=1;
    }//����clickAdd()������

    //���巽��clickSub()��ʵ��(x-y)����
    public void clickSub()
    {
         data.op=2;
    }//����clickSub()����

    //���巽��clickMul()��ʵ��(x*y)����
    public void clickMul()
    {
         data.op=3;
    }//����clickMul()����

    //���巽��clickDiv()��ʵ��(x/y)����
    public void clickDiv()
    {
         data.op=4;
    }//����clickDiv()����

    //���巽��clickLog()��ʵ��(log10(x))����
    public void clickLog()
    {
         data.op=5;
    }//����clickLog()����

    //���巽��clickXy()��ʵ��(x^y)����
    public void clickXy()
    {
         data.op=6;
    }//����clickXy()����

    //���巽��clickSqrt()��ʵ��(sqrt(x))����
    public void clickSqrt()
    {
         data.op=7;
    }//����clickSqrt()����

    //���巽��clickRecip()��ʵ��(1/x)����
    public void clickRecip()
    {
         data.op=8;
    }//����clickRecip()����
    
    //���巽��clickSin()��ʵ��(sin(x))����
    public void clickSin()
    {
    	data.op=9;
    }//����clickSin()����
    
    //���巽��clickCos()��ʵ��(cos(x))����
    public void clickCos()
    {
    	data.op=10;
    }//����clickCos()����
    
    //���巽�� clickPoint()��ʵ��С���������
    public String clickPoint()
    {
    	String str;
    	
    	if(data.op==-1)     //��һ����������С����
    	{
    		if(option1=="-")    //����һ���������и���ʱ
    			option1=option1+"0.";
    		else               //����һ��������û�и���ʱ
    			option1=option1+".";
    		str=option1;
    	}
    	else{                   //�ڶ�����������С����
    		if(option2=="-")     //���ڶ����������и���ʱ
    			option2=option2+"0.";
    		else               //���ڶ���������û�и���ʱ
    			option2=option2+".";
    		str=option2;
    	}
    	return str;          //��������С�������ַ���
    }//����clickPoint()����
    
    //���巽��clickSign()�������������������
    public String clickSign()
    {
    	String str;
    	
    	if(data.op==-1){     //��һ���������и���
    		option1="-";
    		str=option1;
    	}
    	else{
    		option2="-";      //�ڶ����������и���
        	str=option2;
    	}
    	return str;
    }//����clickSign()����
    
    //���巽��clickDe()��ʵ��ɾ������
    public String clickDe()
    {
    	String str;
    	
 	   if(data.op==-1){          //ɾ����һ�������������һλ
 		  option1=option1.substring(0, option1.length()-1);
		   str=option1;
 	   }
 	   else{                   //ɾ���ڶ��������������һλ
 		  option2=option2.substring(0, option2.length()-1);
		   str=option2;
 	   }
 	   return str;           //����ɾ������ַ���
    }//����clickDe()����
    
    //���巽��ce()��ʵ���������
    public void ce()
    {
    	data.op=-1;
    	option1="0";
    	option2="0";
    }//����ce()����

    //���巽��equal()��ʵ�ָ�����������
    public String equal()
    {
    	//��String�͵Ĳ�����ת��Ϊdouble��
    	data.op1=Double.parseDouble(option1);  
    	data.op2=Double.parseDouble(option2);
    	
    	//��û��������͵���Ⱥ�
    	if(data.op==-1)
    		data.op=1;
    	
    	option2="0";     //ȷ���ڶ�������������ֱ�ӵ�".";
    	
    	//�жϲ�����������
        switch(data.op)
        {   
           case 1 :   
        	   String str1=new Double(data.op1+data.op2).toString();
        	   //������double�Ͳ��������мӷ��������ת��ΪString��
        	   option1=str1;  //�������Ľ����ֵ��һ��������
        	   data.op=-1;    //���ԶԽ������ɾ������
        	   return str1;  //���������Ľ��
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
		
		JFrame f=new JFrame("Calculator");   //������������
		java.awt.Container c=f.getContentPane();   //��ȡ�������������ݴ���
		c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));   
		//������ʽ���֣������������
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(320, 210);
		
		//����Panel
		Panel[] p=new Panel[2];
		for(int i=0;i<2;i++){
			p[i]=new Panel();
			p[i].setBackground(Color.gray);
			//p[i].setVisible(true);
		}
		
		//��һ��Panel�е�����
		//p[0].setLocation(0,50);
		p[0].setPreferredSize(new Dimension(240,50));
		p[0].setLayout(new FlowLayout());
		final TextField textField = new TextField(30);
		p[0].add(textField);
		f.add(p[0]);
		
		//������ť���
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
		Button sqrtButton = new Button("��");
 		Button recipButton = new Button("1/x");
 		Button sinButton = new Button("sin");
		Button cosButton = new Button("cos");
		Button signButton = new Button("+/-");
		Button pointButton = new Button(".");
		Button equalButton = new Button("=");
		Button ceButton = new Button("CE");
		Button deButton = new Button("DE");
		
		//�ڶ���Panel������
		//p[1].setLocation(100,150);
		p[1].setPreferredSize(new Dimension(120,120));
		GridLayout gl1=new GridLayout(5,5);
		p[1].setLayout(gl1);
		
		//��Ӱ�ť���
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
		
		//������Service���ʵ������service
		final Service service=new Service();
		
		//��ť����Ķ����¼��Ĵ���
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
