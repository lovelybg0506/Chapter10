package part01.sec01.exam08;

public abstract class MessageSender {	// 상속
	String title;
	String senderName;
	
	MessageSender(String title,String senderName){
		this.title = title;
		this.senderName = senderName;
	}
	
	
	abstract void sendMessage(String recipient); // 세미콜론(;)을 붙여서 선언만 가능.
// 내용이없음// 자식 클래스에서 추상 메소드를 필히 완성 해라.
	
	
	void sendMessage2(String recipient) {
		
	}
//	추상 메소드는 선언만 하고, 내용이 없는 메소드이다.
//	추상 메소드가 선언되어 있는 클래스는 반드시 추상 클래스가 되어야 한다. (class앞에 abstract가 안붙어있으면 에러)
//  추상 클래스는 일반 메소드도 가질 수 있다.

}