
public class BankAccount{
	String accountnumber;
	String accountname;
	double accountmoney;
	public BankAccount(String accountnumber,String accountname){
		this.accountnumber=accountnumber;
		this.accountname=accountname;
	}
	public String showaccount(){
		return "�˻�ID:"+this.accountnumber+", �˻�����:"+this.accountname+", �˻����:"+this.accountmoney;
	}
	public String addmoney(double money){
		this.accountmoney=this.accountmoney+money;
		return "���ɹ���\n"+"�����:"+this.accountmoney;
	}
	public String getmoney(double money){
		if(this.accountmoney<money) 
			return "���㣬���Ϊ:"+this.accountmoney;
		else{
			this.accountmoney=this.accountmoney-money;
			return "ȡ��ɹ���\n"+"�����:"+this.accountmoney;
		}
	}
}