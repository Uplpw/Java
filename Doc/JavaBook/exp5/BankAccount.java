
public class BankAccount{
	String accountnumber;
	String accountname;
	double accountmoney;
	public BankAccount(String accountnumber,String accountname){
		this.accountnumber=accountnumber;
		this.accountname=accountname;
	}
	public String showaccount(){
		return "账户ID:"+this.accountnumber+", 账户姓名:"+this.accountname+", 账户余额:"+this.accountmoney;
	}
	public String addmoney(double money){
		this.accountmoney=this.accountmoney+money;
		return "存款成功！\n"+"现余额:"+this.accountmoney;
	}
	public String getmoney(double money){
		if(this.accountmoney<money) 
			return "余额不足，余额为:"+this.accountmoney;
		else{
			this.accountmoney=this.accountmoney-money;
			return "取款成功！\n"+"现余额:"+this.accountmoney;
		}
	}
}