package part01.sec01.exam05;

public class Account {
	String accountNo;
	String ownerName;
	int balance;
	
//	Account() {	// 컴파일러는 생성자가 하나라도 있으면 기본생성자는 만들지않음.
//				// <상속> 자식클래스는 부모클래스를 물려받기때문에 부모클래스가 먼저 만들어진다.
//				// 상속에서는 기본(default)생성자가 먼저 호출이 되어야함.
//	}
	
	Account(String accountNo, String ownerName,int balance){
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
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
