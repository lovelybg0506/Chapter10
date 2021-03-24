package part01.sec01.exam09;

interface A2{
	void aaa(); // public abstract를 생략했지만 기본형태라서 bbb와 같음
	public abstract void bbb();
}

class B2 implements A2{
	
	public void aaa() { // 자식클래스에서는 오버라이딩 할때 public을 생략하면안됨
		System.out.println("aaa method");
	}
	
	public void bbb() {
		System.out.println("bbb method");
	}
	
}

public class Round14_Ex02_17 {

	public static void main(String[] args) {
		B2 bp = new B2();
			bp.aaa();
			bp.bbb();
		
	}

}
