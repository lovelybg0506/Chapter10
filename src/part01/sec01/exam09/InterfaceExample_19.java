package part01.sec01.exam09;

interface Lendable1 { // 인터페이스

	void checkOut(String borrower, String date); // 추상메소드
	void checkIn(); // 추상메소드
}

class CDInfo1 {
	String registerNo; // 관련번호
	String title; // 타이틀
	
	CDInfo1(String registerNo, String title){
		this.registerNo=registerNo;
		this.title=title;
	}
}

/* 구현한다 */
class SeparateVolume1 implements Lendable1 {

	String requestNo; // 청구번호
	String bookTitle; // 제목
	String writer; // 저자
	String borrower; // 대출인
	String checkOutDate; // 대출일
	byte state; // 대출상태

	SeparateVolume1(String requestNo, String bookTitle, String writer) {
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

class AppCDInfo1 extends CDInfo1 implements Lendable1 {
	String borrower;
	String checkOutDate;
	byte state;
	
	AppCDInfo1(String registerNo, String title){
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


public class InterfaceExample_19 {

	public static void main(String[] args) {
		Lendable1 arr[] = new Lendable1[3];	//객체생성은 안되지만 공간은 생성된다
		arr[0]=new SeparateVolume1("883 o","푸코의 전자","에코");
		arr[1]=new SeparateVolume1("609.2","서양미술사","곰브리치");
		arr[2]=new AppCDInfo1("02-17","XML을 위한 자바 프로그래밍");

		checkOutAll(arr[0],"강병규","2021-03-24");
		
	}

	public static void checkOutAll(Lendable1 arr[], String borrower, String date) {
		
		
	}
	
}
