package part01.sec01.exam07;

import java.io.IOException;
import java.util.Scanner;

class Member2 {
	protected String name;
	protected String tel;

	Member2(String name, String tel) {
		this.name = name;
		this.tel = tel;

	}

	public String getName() {

		return name;

	}

	public String getTel() {
		return tel;

	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void disp() {
		System.out.println(name + "님의 전화번호는 : " + tel + "번 입니다.");
	}
}

class Member3 extends Member2 {
	private String addr;

	Member3(String name, String tel, String addr) {
		super(name, tel);
		this.addr = addr;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void disp() {
		System.out.println(name + "님의 전화번호는 " + tel + "이고, 주소는 " + addr + "입니다.");
	}
}

class MemberPro {
	private Member3 mb[];
	private int po;

	Scanner in = new Scanner(System.in);

	public MemberPro() {
		mb = new Member3[5]; // index
		po = 0;
	}

	public void input() {
		System.out.print("이름을 입력: ");
		String name = in.next();
		System.out.print("전화번호를 입력: ");
		String tel = in.next();
		System.out.print("주소를 입력: ");
		String addr = in.next();
		mb[po] = new Member3(name, tel, addr);
		po++; // 지역변수(메소드 안에서만), 전역변수(field)//5
	}

	public void view() {
		for (int i = 0; i < po; i++) {
			mb[i].disp();
			
		}
	}

	public void delete() {
		System.out.println("삭제할 회원의 이름: ");
		String name = in.next();
		for (int i = 0; i < po; i++) {
			if (name.equals(mb[i].getName())) {
				for (int j = i; j < po-1; j++) {	// 출력상으로는 삭제라고했지만 메모리상으로는 덮어씌우는것
					mb[j] = mb[j + 1];
				}
				po--;
				System.out.println(name + "회원님을 삭제하였습니다.");

				return;
			} // end if

		} // end for
		System.out.println(name + "님은 저희 회원님이 아닙니다.");
	}

	public void edit() {
		System.out.print("수정할 회원의 이름 입력: ");
		String name = in.next();
		for (int i = 0; i < po; i++) {
			if (name.equals(mb[i].getName())) {
				System.out.println("현재 " + name + "님의 전화번호는" + mb[i].getTel() + "번 입니다.");
				System.out.println("수정할 전화번호: ");
				String tel = in.next();
				mb[i].setTel(tel);
				System.out.println(name + "님의 전화번호가" + mb[i].getTel() + "(으)로수정 됐습니다.");

				return;
			}
		}
	}

	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

}

public class Exam_12 {

	public static void main(String[] args) throws IOException {
		MemberPro pro = new MemberPro();
		
		while(true) {
			System.out.println("( 1.입력 | 2.출력 | 3.삭제 | 4.수정 | 5.종료 ) ");
			int select = System.in.read()-48;
			System.in.skip(2);
			
			switch(select) {
			case 1:
				pro.input();
				break;
			case 2:
				pro.view();
				break;
			case 3:
				pro.delete();
				break;
			case 4:
				pro.edit();
				break;
			case 5:
				pro.exit();
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
