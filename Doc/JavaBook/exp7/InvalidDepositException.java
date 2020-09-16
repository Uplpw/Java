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
		return "账户ID:"+this.accountnumber+", 账户姓名:"+this.accountname+", 账户余额:"+this.accountmoney;
	}
	public String withdraw(double money){
		if(money>=accountmoney)
			return "余额不足! 现余额: "+accountmoney;
		else
			return "取款成功! 现余额: "+accountmoney;
	}
	public String addmoney(double money){
		accountmoney=accountmoney+money;
		return "存款成功！"+"现余额:"+accountmoney;
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
				System.out.println("存款成功! 余额："+ba.accountmoney);
			}
		}
		catch(InvalidDepositException e){
			System.err.println("存款金额不能为负");
		}
	}
	
	public static void main(String[] args){
		InvalidDepositException ie=new InvalidDepositException();
		ie.mb_check();
	}
}
