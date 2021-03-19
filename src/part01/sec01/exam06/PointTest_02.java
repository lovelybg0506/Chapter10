package part01.sec01.exam06;

class Point2 { //extends Object { 자바는 모든 클래스에 상위상속자 Object가 생략 되어있다
	int x;
	int y;
	
	Point2(){
		
	}
	
	Point2(int x, int y){
		// java언어의 모든 클래스는 최고 조상인 Object클래스를 상속받는다
//		super();  // Object Class 기본 생성자
		this.x=x;
		this.y=y;
	}
	
}

class Point3D2 extends Point2{
	int z = 30;
	
	Point3D2(){
		this(100,200,300);
	}
		
	Point3D2(int x, int y, int z){
		super(x,y);
		this.z=z;
	}
}
	
public class PointTest_02 {

	public static void main(String[] args) {
		Point3D2 p3 = new Point3D2();
		
		
		System.out.println("p3.x="+p3.x);
		System.out.println("p3.y="+p3.y);
		System.out.println("p3.z="+p3.z);
		
	}
}
