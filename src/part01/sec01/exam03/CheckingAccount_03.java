package part01.sec01.exam03;

public class CheckingAccount_03 extends Account_02 {
	String cardNo;
	
	int pay(String cardNo,int amount)throws Exception{
		if(!cardNo.equals(this.cardNo) || (balance<amount))
			throw new Exception("지불이 불가능 합니다.");
		
		return withdraw(amount);
	}
}
