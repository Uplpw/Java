import java.util.Scanner;
class BankAccount2{
	String accountnumber;
	String accountname;
	double accountmoney;
	public BankAccount2(String accountnumber,String accountname){
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
public class AccountOverdrawnException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Scanner sc=new Scanner(System.in);
	public void mb_check(){
		try{
			BankAccount2 ba=new BankAccount2("10001","kpl");
			ba.accountmoney=100;
			double money;
			System.out.println("please input money of withdraw��");
			money=sc.nextDouble();
			if(money>=ba.accountmoney)
				throw new AccountOverdrawnException();
			else{
				ba.accountmoney-=money;
				System.out.println("ȡ��ɹ�! �����: "+ba.accountmoney);
			}
		}
		catch(AccountOverdrawnException e){
			System.err.println("����!");
		}
	}
	public static void main(String[] args){
		AccountOverdrawnException ae=new AccountOverdrawnException();
		ae.mb_check();
	}
}
