package part01.sec01.exam06;

/* final */class Speaker{	// final class Speaker : 상속 금지
	private /* final */	 int volumeRate;	// 필드에 final 붙으면 값을 바꿀수 없음
	
	/* final */	public void showCurrentState() { // final public void showCurrentState : override가 안됨
		System.out.println("볼륨크기: "+volumeRate); // overriding 금지
	}
	
	public void setVolume(int vol) {
		volumeRate = vol;
	}
}

class BaseEnSpeaker extends Speaker{
	private int baseRate;
	
	public void showCurrentState() { // overriding : 자식의 동일메소드명이 우선.
		super.showCurrentState();//
		System.out.println("베이스 크기: "+baseRate);
	}
	
	public void setBaseRate(int base) {
		baseRate=base;
	}
}

public class Overriding_08 {

	public static void main(String[] args) {
		BaseEnSpeaker bs = new BaseEnSpeaker();
		bs.setVolume(10);
		bs.setBaseRate(20);
		bs.showCurrentState();
		

	}

}
