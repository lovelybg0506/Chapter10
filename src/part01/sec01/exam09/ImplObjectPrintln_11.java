package part01.sec01.exam09;

class ClassPrinter{

	public static void print(Object obj) {	// 다형성 ^^모든 클래스의 부모는 Object
		// static >> 별도(메모리의 별도의 다른공간에 static끼리 생성됨)
		System.out.println(obj.toString());//^^ ClassPrinter클래스에서는 toString은 라이브러리 메소드
	
	}
}

class Point {
	private int xPos,yPos;
	
	Point(int x,int y){
		xPos=x;
		yPos=y;
	}
	
	public String toString() { //^^ Point클래스의 내가 만든 posInfo를 리턴하는 toString 메소드
		String posInfo = "[x : "+xPos+",y: "+yPos+"]";
		
		return posInfo;
	}
}
public class ImplObjectPrintln_11 {

	public static void main(String[] args) {
		Point pos1 = new Point(1,2);
		Point pos2 = new Point(5,9);

		ClassPrinter.print(pos1);
		ClassPrinter.print(pos2);
		
	}

}
