package part01.sec01.exam09;

class A5{
	int x = 100;
	
	public void aaa() {
		
	}
}

class B5 extends A5{
	int y = 200;

	public void aaa() {
		System.out.println("y="+y);
	}
}

public class Round13_Ex09_02 {

	public static void main(String[] args) {
		A5 ap = new B5();
		System.out.println("x="+ap.x);
//		System.out.println("y="+ap.y); // 부모위주로 처리해야 하므로 에러.
		ap.aaa();
		
		
		B5 ap1 = new B5();
		System.out.println("x="+ap1.x);		
		System.out.println("y="+ap1.y);		
		
	}

}
