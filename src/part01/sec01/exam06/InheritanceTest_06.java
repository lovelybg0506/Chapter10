package part01.sec01.exam06;

class B1{
	int x;
	
}

class B2 extends B1{
	String x;
	
}


public class InheritanceTest_06 {

	public static void main(String[] args) {
		B2 b2 = new B2();
		b2.x="자바 상속 공부중...";
//		b2.x=100;
		System.out.println("객체 b2에 들어있는 x값: "+b2.x);

		B1 b1 = new B1();
		b1.x =100;
		System.out.println("객체 b1에 들어있는 x값: "+b1.x);
		
		

	}

}
