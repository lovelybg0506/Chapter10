package part01.sec01.exam03;


class A {
	int aa= 1;
}

class B extends A{
	int bb =2;
	
}

class C extends B{
	int cc= 3;
	
}

public class InheritanceTest_01 {

	public static void main(String[] args) {

		C objc = new C();
		
		
		System.out.println("objc객체의 객체 속성 변수 aa의 값은 "+objc.aa);
		System.out.println("objc객체의 객체 속성 변수 bb의 값은 "+objc.bb);
		System.out.println("objc객체의 객체 속성 변수 cc의 값은 "+objc.cc);

	}

}
