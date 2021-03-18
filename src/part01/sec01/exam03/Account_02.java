package part01.sec01.exam03;

public class Account_02 {
	String accountNo;
	String ownerName;
	int balance;
	
	void deposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount)throws Exception{
		if(balance<amount) 
			throw new Exception("잔액이 부족합니다.");
			balance -= amount;
			
			return amount;
		
	}
}
