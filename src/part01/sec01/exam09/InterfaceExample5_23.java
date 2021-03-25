package part01.sec01.exam09;

interface Resizable {

	void resize(int width, int height);
}

interface Colorable {

	void setForeground(String color);

	void setBackground(String color);
}

interface Changeable extends Resizable, Colorable { // interface는 다중상속 가능.

	void setFont(String font);

}

class Lable implements Changeable {
	String text;
	int width, height;
	String foreground, background;
	String font;

	Lable(String text, int width, int height, String foreground, String background, String font) {
		this.text = text;
		this.width = width;
		this.height = height;
		this.foreground = foreground;
		this.background = background;
		this.font = font;
	}

	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void setForeground(String color) {
		this.foreground = color;
	}

	public void setBackground(String color) {
		this.background = color;
	}

	public void setFont(String font) {
		this.font = font;
	}
}

public class InterfaceExample5_23 {

	public static void main(String[] args) {
		Lable obj = new Lable("안녕하세요",100,30,"yellow","green","굴림체");
		
		printLable(obj);
		obj.resize(200, 70);
		obj.setForeground("black");
		obj.setBackground("white");
		obj.setFont("궁서체");
		printLable(obj);
		
	}

	public static void printLable(Lable obj) {
		System.out.printf("%s:%d * %d 배경색(%s) 전경색(%s) 폰트(%s)%n",obj.text,obj.width,obj.height,obj.background,obj.foreground,obj.font);
	}
	
}
