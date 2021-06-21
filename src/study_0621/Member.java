package study_0621;


//Member 클래스에는 아래 요구사항에 맞는 변수와 메소드를 정의하고, main()메소드 에 해당 메소드를 호출해서 결과를 확인해보세요. 
//단 인스턴스의 생성은 생성자를 이용해서 초기화하는 코드를 작성해 봅시다. 
//생성자 -> 초기화 메소드, 인스턴스를 생성할때 단 한번, 인스턴스 변수를 초기화한다.

public class Member {

	//① 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소
	//데이터를 저장 -> 변수를 이용해서 메모리에 저장
	
	// 접근 제어 지시자 private을 쓰는 이유
	// : 클래스 내부의 멤버들만 참조가 가능
	// -> 정보 은닉, 변수의 데이터 보호의 목적
	private String name;
	final String phoneNum;
	private String major;
	private int grade;
	private String email;
	private int birthDay; // YYMMDD 형식
	private String address;
	
	// 생성자의 요구사항 -> 생성자의 오버로딩
	// 오버로딩 -> 이름이 같은 메소드 정의
		// 생성자의 이름 (매개변수) { 초기화 코드... }
		// 생성자의 이름 -> 클래스의 이름 (초기화의 목적)
		// 생성자는 반드시 하나 이상 있어야 한다.
		// 객체와 인스턴스가 갖는 속성을 위해 사용한다.
	
	
	// 모든 정보를 저장하도록 하는 생성자,
	Member(String name,
			String phoneNum,
			String major,
			int grade,
			String email,
			int birthDay,
			String address) {
	this.name = name;
	this.phoneNum = phoneNum;
	this.major = major;
	this.grade = grade;
	this.email = email;
	this.birthDay = birthDay;
	this.address = address;
	}
	
	
	// 생일과 주소는 저장하지 않을 수 있는 생성자
	Member(String name,
			String phoneNum,
			String major,
			int grade,
			String email) {
	this(name, phoneNum, major, grade, email, 0, null);
	}
	
	
	
	//② 위에서 정의한 정보를 출력하는 메소드 정의
	// 기능 -> 메소드, 반환에 대한 내용 X, 반환타입이 없는 void 활용
	void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("연락처 : " + phoneNum);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("이메일 : " + email);
	
	if (this.birthDay == 0) {
		System.out.println("생일 : 입력된 생일 데이터가 없습니다.");
	} else {
		System.out.println("생일 : " + birthDay);
	}
	
	if (this.address != null) {
		System.out.println("주소 : " + address);
	} else {
		System.out.println("주소 : 입력된 주소 데이터가 없습니다.");
	}
	
} // showInfo 메소드의 끝
	
	
	//④ main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고
	// 출력 메소드를 통해 저장된 데이터 출력	

	
	public static void main(String[] args) {

		Member mem1 = new Member("짱구",
								"010-1111-1111",
								"PHOTO",
								5,
								"abc@abc.com",
								151011,
								"BUCHOEN");

		
		Member mem2 = new Member("지원",
								"010-2222-2222",
								"ART",
								3,
								"bcd@bcd.com");
			
		mem1.showInfo();
		System.out.println();
		mem2.showInfo();
	
	}

}
