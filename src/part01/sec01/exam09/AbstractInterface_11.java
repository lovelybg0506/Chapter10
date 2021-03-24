package part01.sec01.exam09;

interface PersonalNumberStorage2 { // interface는 class 명칭이 없어야한다.

	public abstract void addPersonalInfo(String name, String perNum);

	public abstract String searchName(String perName);
}

class PersonalNumInfo2 {
	String name;
	String number;

	PersonalNumInfo2(String name, String number) {
		this.name = name;
		this.number = number;
	}

	String getName() {

		return name;
	}

	String getNumber() {
		return number;
	}
}
								/* implements : 구현한다 (interface와 함께 쓰임)  */
class PersonalNumberStorageImpl2 implements PersonalNumberStorage2 {	
	PersonalNumInfo2[] perArr;
	int numOfPerInfo;

	public PersonalNumberStorageImpl2(int sz) {
		perArr = new PersonalNumInfo2[sz];
		numOfPerInfo = 0;
	}

	public void addPersonalInfo(String name, String perNum) {
		perArr[numOfPerInfo] = new PersonalNumInfo2(name, perNum);
		numOfPerInfo++;
	}

	public String searchName(String perNum) {
		for (int i = 0; i < numOfPerInfo; i++) {
			if (perNum.equals(perArr[i].getNumber()))
//				if (perNum.compareTo(perArr[i].getNumber())==0)
				return perArr[i].getName();
		}
//			return perNum;
		return null;
	}
}

public class AbstractInterface_11 {

	public static void main(String[] args) {
		PersonalNumberStorage2 storage = new PersonalNumberStorageImpl2(100);
		storage.addPersonalInfo("홍길동", "950000-1122333");
		storage.addPersonalInfo("홍길자", "970000-1122333");

		System.out.println(storage.searchName("950000-1122333"));
		System.out.println(storage.searchName("970000-1122333"));

	}

}
