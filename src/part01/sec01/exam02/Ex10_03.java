package part01.sec01.exam02;

class Car3{
	
	Car3(){									// 부모것이 먼저 만들어질때는 기본생성자만 만들어진다.
		System.out.println("슈퍼 클래스 생성자 호출");
	}
	
	Car3(String str){
		System.out.println("슈퍼 클래스 생성자 호출==> "+str);
	}
	
}

class Sedan3 extends Car3{
	
	Sedan3(String str){
		System.out.println("서브 클래스 생성자 호출==> "+str);
	}
}

public class Ex10_03 {

	public static void main(String[] args) {
		Sedan3 sedan3 = new Sedan3("여기요~~");	// 부모것이 먼저 만들어질때는 기본생성자만 만들어진다.

	}

}
