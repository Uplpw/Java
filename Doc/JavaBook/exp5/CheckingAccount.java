public class CheckingAccount extends BankAccount{
	
	public CheckingAccount(String accountnumber, String accountname) {
		super(accountnumber, accountname);
	}
	//�̳и���Ĺ��캯��
		
	public String check(double moneys){
		if(moneys > 1e5)
			return "������,��Ǯʧ��";
		else{
			accountmoney=accountmoney+moneys;
			return "��Ǯ�ɹ���������"+accountmoney;
		}
	}
	//����������
}