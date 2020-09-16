public class Tellers{
	public static void main(String[] args){
		CheckingAccount person=new CheckingAccount("1111","lpw");
		System.out.println(person.showaccount());
		System.out.println(person.addmoney(1000));
		System.out.println(person.getmoney(1999));
		System.out.println(person.getmoney(500));
		System.out.println(person.check(500));
		System.out.println(person.check(50000));
	}
}