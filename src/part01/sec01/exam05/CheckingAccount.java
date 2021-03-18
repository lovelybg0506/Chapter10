package part01.sec01.exam05;

public class CheckingAccount extends Account{
	String cardNo;
	
	CheckingAccount(String accountNo,String ownerName,int balance, String cardNo){
//		super(); // 부모 생성자 호출, 반드시 먼저 호출되어야한다.
//		this.accountNo=accountNo;
//		this.ownerName=ownerName;
//		this.balance=balance;
		
		super(accountNo,ownerName,balance);
		this.cardNo=cardNo;
	}
	
	int pay(String cardNo,int amount)throws Exception{
		if(!cardNo.equals(this.cardNo) || (balance<amount))
			throw new Exception("지불이 불가능 합니다.");
		
		return withdraw(amount);
	}
}
