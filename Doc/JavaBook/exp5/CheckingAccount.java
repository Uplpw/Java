public class CheckingAccount extends BankAccount{
	
	public CheckingAccount(String accountnumber, String accountname) {
		super(accountnumber, accountname);
	}
	//继承父类的构造函数
		
	public String check(double moneys){
		if(moneys > 1e5)
			return "金额溢出,存钱失败";
		else{
			accountmoney=accountmoney+moneys;
			return "存钱成功，现在余额："+accountmoney;
		}
	}
	//添加溢出保护
}