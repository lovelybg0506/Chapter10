package part01.sec01.exam09;

class TV {
	public void onTV() {
		System.out.println("영상 출력 중"); // 2
	}
}

interface Computer3 {
	public void dataReceive(); // 추상 메소드 ,abstract 생략
}

class ComputerImpl {

	public void dataReceive() {
		System.out.println("영상 데이터 수신 중"); // 1
	}
}

class IPTV extends TV implements Computer3 {
	ComputerImpl comp = new ComputerImpl();

	public void dataReceive() { // overriding
		comp.dataReceive();
	}
	
	public void powerOn() {
		dataReceive();
		onTV();
	}
}

public class MultiInheriAlternative_14 {

	public static void main(String[] args) {
		IPTV iptv = new IPTV();
		
		iptv.powerOn();
		
	}

}
