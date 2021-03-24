package part01.sec01.exam09;

interface Lendable { // 인터페이스

	void checkOut(String borrower, String date); // 추상메소드
	void checkIn(); // 추상메소드
}

class CDInfo {
	String registerNo; // 관련번호
	String title; // 타이틀
	
	CDInfo(String registerNo, String title){
		this.registerNo=registerNo;
		this.title=title;
	}
}

/* 구현한다 */
class SeparateVolume implements Lendable {

	String requestNo; // 청구번호
	String bookTitle; // 제목
	String writer; // 저자
	String borrower; // 대출인
	String checkOutDate; // 대출일
	byte state; // 대출상태

	SeparateVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}

	// Override 한 메소드는 public 붙여야한다.
	public void checkOut(String borrower, String date) {
		if(state != 0)
			return; // 종료
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state=1;
		
		System.out.println("*" + bookTitle + "이(가)대출 되었습니다.");
		System.out.println("대출인 : " + borrower);
		System.out.println("대출일 : " + date + "\n");
	}

	// Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state=0;
		
		System.out.println("*"+bookTitle+"이(가)반납 되었습니다.");
	}

}

class AppCDInfo extends CDInfo implements Lendable {
	String borrower;
	String checkOutDate;
	byte state;
	
	AppCDInfo(String registerNo, String title){
		super(registerNo,title);

	}
	
	public void checkOut(String borrower, String date) {
		if(state != 0)
			return; // 종료
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state=1;
		
		System.out.println("*" + title + " CD이(가)대출 되었습니다.");
		System.out.println("대출인 : " + borrower);
		System.out.println("대출일 : " + date + "\n");
	}

	// Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state=0;
		
		System.out.println("*"+title+" CD이(가)반납 되었습니다.");
	}
}

public class InterfaceExample_15 {

	public static void main(String[] args) {
		SeparateVolume obj1 = new SeparateVolume("863ㅂ774개","개미","베르베르");
		AppCDInfo obj2 = new AppCDInfo("2005-7001","Redhat Fedora");
	
		obj1.checkOut("김영숙","20210324");
		obj2.checkOut("박희경","20210324");
		obj1.checkIn();
		obj2.checkIn();
	}

}

// 인터페이스는 필드(선택), 추상메소드로 구성된 클래스이다.
// 인터페이스는 인터페이스로 부터만 상속, 다중상속도 가능하다.
// 메소드 선언시 abstract 키워드 생략 가능 ( 무조건 추상메소드이기 때문에)