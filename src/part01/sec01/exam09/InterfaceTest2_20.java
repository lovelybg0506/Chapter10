package part01.sec01.exam09;

class A {

	void autoplay(I i) {	// I i = new B(),
		i.play();
	}
}

interface I {
	
	public abstract void play();

}
//==================================================================
class B implements I {
	
	public void play() {
		System.out.println("play in B class");
	}
}

//===================================================================
class C implements I {
	
	public void play() {
		System.out.println("play in C class");
	}
}

//===================================================================
public class InterfaceTest2_20 {

	public static void main(String[] args) {
		A a = new A();
		
		a.autoplay(new B());
		a.autoplay(new C());

		B b = new B();
		C c = new C();
		a.autoplay(b);
		a.autoplay(c);
		
	}

}
