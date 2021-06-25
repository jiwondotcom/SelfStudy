package study_0625;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;


public class MemberHandler {

	Scanner sc = new Scanner(System.in);
	private static Connection con = JDBCconnecting.connecting();
	
	private ArrayList<Member> members = new ArrayList<Member>();
	private MemberCRUD memberCrud = MemberCRUD.getInstance();
	
	
	
	public void isEmpty(String input) { // 공란 여부 체크
		boolean emptyChk = true;
		while (emptyChk) {
			if (input.equals("")) {
				System.out.println("공란입니다.");
				input = sc.nextLine();
				continue;
			} else {
				break;
			}
		}
	}
	
	
	public void JoinMember() { // 회원가입 method
		members = MemberCRUD.getMemberList(con);
		
		
		// 아이디
		System.out.print("ID : ");
		String ID = sc.nextLine();
		
		isEmpty(ID); // 공란체크
		
		// 아이디 중복체크
		boolean overlapChk = true;
		if (members.size() > 0) {
			while (overlapChk) {
				for (int i = 0; i < members.size(); i++) {
					if(members.get(i).equals(ID)) {
						System.out.println("이미 존재하는 아이디입니다.");
						System.out.print("설정하실 ID를 입력해주세요 : ");
						ID = sc.nextLine();
						
						isEmpty(ID); // 공란 재체크
						
						continue;
					}
				} overlapChk = false;
			}
		}
		
		
	
	// 비밀번호
	boolean twicePwChk = true;
	String password = null;
	
	while (twicePwChk) {
		System.out.print("PW : ");
		password = sc.nextLine();
		isEmpty(password); // 공란체크
		System.out.println("한번 더 입력해주세요.");
		String rePassword = sc.nextLine();
		if (!password.equals(rePassword)) {
			System.out.println("다시 확인해주세요.");
			System.out.println("PW : ");
		} else {
			twicePwChk = false;
		} // 두개가 다르면 if문, 같으면 그대로 아래로 빠져나간다.
	}
		
	// 이름
	System.out.print("이름 : ");
	String name = sc.nextLine();
	isEmpty(name); // 공란체크
	

	
	
	// 나이
	System.out.print("나이 : ");
	String age1 = sc.nextLine();
	isEmpty(age1); // 공란체크
	int age = Integer.parseInt(age1);
	// 문자열 값으로 입력받은 나이를 int타입의 변수 age에 저장
	
	
	// 전화번호
	System.out.print("전화번호 : ");
	String phoneNum = sc.nextLine();
	isEmpty(phoneNum); // 공란체크
	
	
	// 이메일
	System.out.print("이메일 : ");
	String inputemail = sc.nextLine();
	if(inputemail.equals("")) {
		// 이메일은 not null값이 아니므로, 입력은 선택사항이다.
		// 공란입력시 null 값 출력
		inputemail = null;
	} else {
		String email = inputemail;
	}
	
	memberCrud.insertMember(con, new Member(0, ID, password, name, age, phoneNum, email));
	
	
	
	
	
	
	
	}
	
}
