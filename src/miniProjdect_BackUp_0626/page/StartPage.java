package bookcase.page;

import bookcase.*;
import bookcase.object.*;
import bookcase.show.*;
import bookcase.util.*;

public class StartPage implements Show {
    public void startStart(){
        MemberHandler mh = new MemberHandler();
        int menuButton = 0;
        Member member;

        while (menuButton != 5) {
            try {
                showStartMenu();
                menuButton = ScannerUtil.getInputIntegerS(">> 원하시는 메뉴를 선택하세요 : ");

                switch (menuButton) {
                    case 1: //회원 로그인
                        member = mh.login();
                        if (member != null) {
                            new MemberPage(member).memberPageStart(); // 완료시 멤버페이지
                        }
                        break;
                    case 2: // 관리자 로그인
                        member = mh.managerlogin();
                        if (member != null) {
                            new ManagerPage().bookManagerStart();
                         // 관리자ID admin 로그인 할 경우에만 ManagerPage 입장
                        } break;
                        // ID : admin일 경우에만 관리자페이지 입장
                    case 3: // 회원가입
                        mh.joinMember();
                        break;
                    case 4: // 아이디찾기
                        mh.findingId();
                        break;
                    case 5: // 종료
                        System.out.println("[!] 책꽂이 서비스를 종료합니다");
                        break;
                } 
            }catch (NumberFormatException e){
                System.out.println("error : 숫자로 입력해주세요");
            }
        }
    }
}
