package part01.sec01.exam06;

class Parent{
	int x=10;
	
}

class Child extends Parent{
	
	void method() {
		System.out.println("x= "+x);
		System.out.println("this.x= "+this.x);
		System.out.println("super.x= "+super.x);
	}
}


public class SuperTest_03 {

	public static void main(String[] args) {
		Child X = new Child();
		
		X.method();
		
	}

}
