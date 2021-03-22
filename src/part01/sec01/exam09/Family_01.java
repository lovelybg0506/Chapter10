package part01.sec01.exam09;

class Father{
	
	public void play() {
		System.out.println("Father : swimming");
	}
	
	public void study() {
		System.out.println("Father : java programming");
	}
}

//===============================================================

class Johnharu extends Father{
	
	public void study() {
		System.out.println("Johnharu : C# Programming");
	}
}

//================================================================

class Gracedew extends Father{
	
	public void play() {
		System.out.println("Gracedew : BaseBall");
	}
}

//=================================================================

class Moon extends Father{
	
	public void play() {
		System.out.println("Moon : BasketBall");
	}
	
	public void study() {
		System.out.println("Moon : Visual Basic,Visual C++");
	}
}
//=================================================================
public class Family_01 {

	public static void main(String[] args) {
		Father DAD = new Father();
		DAD.play();
		DAD.study();
		
		System.out.println("=======================================");
		
		DAD=new Johnharu();	// 다형성에서 부모 타입에 대입되면 무조건 부모 위주로 처리한다.
							// 단, 오버라이딩이 되었다면 자식것으로 처리된다.
		DAD.play();
		DAD.study();
		
		System.out.println("=======================================");
		
		DAD=new Gracedew();
		
		DAD.play();
		DAD.study();
		
		System.out.println("=======================================");
		
		DAD=new Moon();
		
		DAD.play();
		DAD.study();
	}

}
