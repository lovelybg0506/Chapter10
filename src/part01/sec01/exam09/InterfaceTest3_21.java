package part01.sec01.exam09;

interface I9 {
	public abstract void methodB();
}

class B9 implements I9 {

	public void methodB() {
		System.out.println("method in B class");
	}
}

class InstanceManager {

	public static I9 getInstance() {
		return new B9();
		
	}
}

class A9 {

	public void methodA() {
		I9 i = InstanceManager.getInstance();
		i.methodB();
	}
}

public class InterfaceTest3_21 {

	public static void main(String[] args) {
		A9 a = new A9();
		a.methodA();
		
	}

}
