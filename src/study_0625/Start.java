package study_0625;

import java.util.Scanner;

public class Start {
	public void startStart() {
		
		int menuButton = 0;
		Scanner sc = new Scanner(System.in);
		
		while (menuButton != 5) {
			try {
				menuButton = sc.nextInt();
				
				System.out.println("1. 회원로그인");
				System.out.println("2. 관리자 로그인");
				System.out.println("3. 회원가입");
				System.out.println("4. 아이디/비밀번호 찾기");
				System.out.println("5. 종료");
					
				switch (menuButton) {
					case 1: // 회원 로그인
						memberLogin();
						break;
					case 2: // 관리자 로그인
						managerLogin();
						break;
					case 3: // 회원가입
						joinMember();
						break;
					case 4: // ID/PW 찾기
						findingId();
						break;
					case 5: // 종료
						System.out.println("종료합니다.");
						break;
					}
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


		void memberLogin() {
			
			boolean chk = true;
			boolean chkID = true;
			
			System.out.println();
			System.out.println("=====회원로그인=====");
		}
	}

}
