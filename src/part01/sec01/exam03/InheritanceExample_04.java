package part01.sec01.exam03;

public class InheritanceExample_04 {

	public static void main(String[] args) {
		CheckingAccount_03 obj = new CheckingAccount_03();
		obj.accountNo="111-22-33333333";
		obj.ownerName="홍길동";
		obj.cardNo="5555-6666-7777-8888";
		obj.deposit(100000);
		
		try {
			int paidAmount=obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("지불액: "+ paidAmount);
			System.out.println("잔액: "+ obj.balance);
		}catch(Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}

	}

}
