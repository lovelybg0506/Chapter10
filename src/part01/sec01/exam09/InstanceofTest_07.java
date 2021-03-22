package part01.sec01.exam09;

class Car{
	
}

class FireEngine extends Car{
	
}

public class InstanceofTest_07 {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		if(fe instanceof Car) {
			System.out.println("This is a Car instance.");
		}
		if(fe instanceof Object) {
			System.out.println("This is an Object instance.");
		}

	}

}

// 연산의 결과로 boolean값인 true, false 중 하나를 반환한다.
// 연산의 결과가 true라는 것은 검사의 타입으로 형변환이 가능하다는 것
// 상속관계를 바탕으로 형변환이 가능한지를 묻는 연산자
