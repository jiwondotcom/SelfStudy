package bookcase.page;

import bookcase.*;
import bookcase.object.*;
import bookcase.show.*;
import bookcase.util.*;

public class ReturnBookPage implements Show {
	
	private Member member;
	private int menuButton = 0;
	
	public ReturnBookPage(Member member) {
		this.member = member;
	}

	public void BookReturnStart() {
		ReturnBook returnbooks = new ReturnBook(member);
		while (menuButton != 2) {
			try {
				showBookReturnMenu();
				menuButton = ScannerUtil.getInputIntegerS(">> 원하시는 메뉴를 선택해주세요 : ");
				switch (menuButton) {
				case 1: // 도서 반납
					returnbooks.returnBook();
					break;
				case 2: // 도서 종료
					System.out.println("[!] 이전 단계로 돌아갑니다.");
					System.out.println();
					break;
				default: // 이전 단계
					System.out.println("error : 잘못된 입력입니다.");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("error : 숫자로 입력해주세요.");
			}
		}
	}
}