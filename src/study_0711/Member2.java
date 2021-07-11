package study_0711;

public class Member2 {
	
	private String name;
	private String phoneNum;
	private String major;
	private int grade;
	private String email;
	private String birthDay;
	private String address;
	 
	 
	// 모든 정보를 저장하도록 하는 생성자
	public Member2(String name, String phoneNum, String major, int grade, String email, String birthDay, String address) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthDay = birthDay;
		this.address = address;
	}

	// 생일과 주소는 저장하지 않을 수 있는 생성자를 정의
	public Member2(String name, String phoneNum, String major, int grade, String email) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.major = major;
		this.grade = grade;
		this.email = email;
	}

	// 출력 메소드
	void showInfo() {
		 System.out.println("이름 : " + this.name);
		 System.out.println("연락처 : " + this.phoneNum);
		 System.out.println("전공 : " + this.major);
		 System.out.println("학년 : " + this.grade);
		 System.out.println("이메일 : " + this.email);
	
		 if (this.birthDay == null) {
			 System.out.println("생일 : 입력된 데이터가 없습니다.");
		 } else {
			 System.out.println("생일 : " + birthDay);
		 }
		 
		 if(this.address != null) {
			 System.out.println("주소 : " + address);
		 } else {
			 System.out.println("주소 : 입력된 데이터가 없습니다.");
		 }
	
	}

	public static void main(String[] args) {
	

	Member2 m1 = new Member2("짱구", "010-1111-1111", "music", 3, "gg@gg.gg", "151011", "buchoen");
	m1.showInfo();
	System.out.println("============================");
	Member2 m2 = new Member2("짱아", "010-2222-2222", "art", 4, "aa@aa.aa");
	m2.showInfo();
			
}
	}
