package part01.sec01.exam09;

interface Movable {

	public void moveTo(int x, int y);

	public void moveBy(int xOffset, int yOffset);

}

interface Transformable extends Movable { // interface끼리 상속하려면 extends

	public void resize(int width, int height);

}

class Rectangle implements Transformable {
	int x, y, width, height;

	Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void moveTo(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public void moveBy(int xOffset,int yOffset) {
		this.x+=xOffset;
		this.y+=yOffset;
	}
}

public class InterfaceTest4_22 {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle(100,200,10,10);
		
		printRectangle(obj);

		obj.moveTo(25,35);
		printRectangle(obj);
		
		obj.moveBy(-5,-5);
		printRectangle(obj);
		
		obj.resize(30,30);
		printRectangle(obj);
		
	}

	private static void printRectangle(Rectangle obj1){
		System.out.printf("사각형: 위치(%d,%d) 크기(%d*%d)%n",obj1.x,obj1.y,obj1.width,obj1.height);
	}
	
}
