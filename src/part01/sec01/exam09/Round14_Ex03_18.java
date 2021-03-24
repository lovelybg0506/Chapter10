package part01.sec01.exam09;

interface A3{
	int x= 100; // ==public static final
	
	class B3{  // 정적(static){별도의메모리} 중첩 클래스  (클래스안에 클래스)
		private int y;
		
		public B3() {
			this.y=200;
		}
		
		public void disp() {
			System.out.println("x= "+x);
			System.out.println("x= "+A3.x);
			System.out.println("y= "+y);
		}
	}
}

public class Round14_Ex03_18 {

	public static void main(String[] args) {
		A3.B3 bp = new A3.B3();
		
		bp.disp(); 		// 아 인터페이스 안에 일반 클래스가 들어갈 수 있는데 그것을 정적중첩클래스.
						// 인터페이스.클래스로 접근

	}

}
