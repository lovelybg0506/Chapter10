package part01.sec01.exam02;

class Car { // Car라는 공통된 부분.
	String color;
	int speed;

	void upSpeed(int value) {
		speed = speed + value;
	}

	void downSpeed(int value) {
		speed = speed - value;
	}

}

class Sedan extends Car {
	int seatNum;

	int getSeatNum() {

		return seatNum;

	}
}

class Truck extends Car {
	int capacity;

	int getCapacity() {
		
		return capacity;
	}
}

public class Ex10_01 {

	public static void main(String[] args) {
		Sedan sedan1 = new Sedan();
		Truck truck1 = new Truck();
		
		sedan1.upSpeed(300);
		truck1.upSpeed(100);
		
		sedan1.seatNum=5;
		truck1.capacity=50;
		
		
		System.out.println(sedan1.speed);
		System.out.println(truck1.speed);
		
		System.out.println(sedan1.getSeatNum());
		System.out.println(truck1.getCapacity());
		
		
	}

}
