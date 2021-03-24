package part01.sec01.exam09;

interface A1{
	int w = 10; // 인터페이스에 선언된 필드는 즉, static final과 같다.
	static int x = 20;
	final int y = 30;
	public static final int z = 40;  // interface에서는 public static final 이 생략된 기본필드.
}

public class Round14_Ex01_16 {

	public static void main(String[] args) {
//		 A1 ap = new A1();  인터페이스는 객체생성 x
//		 A1.w = 100;
		
		System.out.println("w= "+A1.w);
		System.out.println("x= "+A1.x);
		System.out.println("y= "+A1.y);
		System.out.println("z= "+A1.z);
	}

}
