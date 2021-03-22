package part01.sec01.exam08;

public class InheritanceExample_3 {
	// 다형성 이란? 하나의 변수에 여러 종류의 데이터를 대입할 수 있는것.
	public static void main(String[] args) {
		EmailSender obj1 = new EmailSender("생일을 축하합니다.","고객센터","admin@dukeeshop.co.kr","10% 할인 쿠폰이 발행되었습니다.");
		
		SMSSender obj2 = new SMSSender("생일을 축하 합니다.","고객센터","02-000-0000","10% 할인 쿠폰이 발행 되었습니다.");
		
//		obj1.sendMessage("hatman@yeyeye.com");
//		obj1.sendMessage("stickman@yeyeye.com");
//		obj2.sendMessage("010-0000-0000");
	
		send(obj1,"hatman@yeyeye.com");
		send(obj2,"stickman@hahaha.com");
	}
	/*
	public static void send(EmailSender obj,String recipient) {
		obj.sendMessage(recipient);
		
	}

	public static void send(SMSSender obj,String recipient) {
		obj.sendMessage(recipient);
	}*/
	
	public static void send(MessageSender obj,String recipient) {
		obj.sendMessage(recipient);
	}
	
		// 자바 가상 기계는 객체의 메소드를 호출할때 변수의 타입에 상관없이 객체가 속하는 클래스의 메소드를 호출한다.
		// 자바 컴파일러는 객체가 아니라 변수의 타입만 가지고 그 메소드가 있는지 없는지를 체크한다.	
}
