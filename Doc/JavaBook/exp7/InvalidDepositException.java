import java.util.Scanner;
class BankAccount3{
	String accountnumber;
	String accountname;
	double accountmoney;
	public BankAccount3(String accountnumber,String accountname){
		this.accountnumber=accountnumber;
		this.accountname=accountname;
	}
	public String showaccount(){
		return "�˻�ID:"+this.accountnumber+", �˻�����:"+this.accountname+", �˻����:"+this.accountmoney;
	}
	public String withdraw(double money){
		if(money>=accountmoney)
			return "����! �����: "+accountmoney;
		else
			return "ȡ��ɹ�! �����: "+accountmoney;
	}
	public String addmoney(double money){
		accountmoney=accountmoney+money;
		return "���ɹ���"+"�����:"+accountmoney;
	}
}
public class InvalidDepositException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Scanner sc=new Scanner(System.in);
	public void mb_check(){
		try{
			BankAccount3 ba=new BankAccount3("10001","kpl");
			System.out.println("please input money: ");
			double money=sc.nextDouble();
			if(money<0)
				throw new InvalidDepositException();
			else{
				ba.accountmoney+=money;
				System.out.println("���ɹ�! ��"+ba.accountmoney);
			}
		}
		catch(InvalidDepositException e){
			System.err.println("������Ϊ��");
		}
	}
	
	public static void main(String[] args){
		InvalidDepositException ie=new InvalidDepositException();
		ie.mb_check();
	}
}
