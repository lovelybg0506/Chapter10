package part01.sec01.exam01_01;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		
		System.out.println("===========참조하는객체가 달라짐=============");
		System.out.println(rc);
		rc = new Audio();
		System.out.println(rc);	// 참조하는 객체가 달라진다.
		System.out.println("======================================");
		
		rc = new Television();
		System.out.println(rc);
		rc.turnOn();
		rc.setMute(true);
		System.out.println("======================================");
		
		rc = new Audio();
		System.out.println(rc);
		rc.turnOn();
		rc.setMute(true);

		RemoteControl.changeBattery();	// static메소드에 접근할때는 그냥 (부모인터페이스.메소드)
	}
	

}
