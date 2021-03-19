package part01.sec01.exam08;

public class InheritanceExample_2 {

	public static void main(String[] args) {
		EmailSender obj1 = new EmailSender("생일을 축하합니다.","고객센터","admin@dukeeshop.co.kr","10% 할인 쿠폰이 발행되었습니다.");
		
		SMSSender obj2 = new SMSSender("생일을 축하 합니다.","고객센터","02-000-0000","10% 할인 쿠폰이 발행 되었습니다.");
		
		obj1.sendMessage("hatman@yeyeye.com");
		obj1.sendMessage("stickman@yeyeye.com");
		obj2.sendMessage("010-0000-0000");
	}

}
