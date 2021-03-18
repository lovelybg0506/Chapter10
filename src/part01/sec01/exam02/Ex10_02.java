package part01.sec01.exam02;

class Car2 {
	
	Car2(){
		System.out.println("슈퍼 클래스 생성자 호출");
	}
}

class Sedan2 extends Car2{
	
	Sedan2(){
		System.out.println("서브 클래스 생성자 호출");
	}
	
}


public class Ex10_02 {

	public static void main(String[] args) {
		Sedan2 sedan2 = new Sedan2();	// 부모 생성자가 먼저 자동으로 만들어져서 출력하면 Car2의 출력문 부터 나옴
		Car2 car2 = new Car2();
		
	}

}
