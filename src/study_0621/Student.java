package study_0621;


//1.국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고, 평균 점수를 출력하는 프로그램을 작성해봅시다.
//2.Student 클래스를 정의해봅시다.
//①학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다.
//②변수는 캡슐화를 합니다. getter/setter 메소드를 정의합니다.
//③총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.
//3.main()메소드에 아래 내용을 정의해봅시다.
//①Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
//②Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
//③배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다.

public class Student {

		private String name;
		private int KorScore;
		private int EngScore;
		private int MathScore;
	
		// 변수 캡슐화 (setter/getter)
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getKorScore() {
			return KorScore;
		}
		public void setKorScore(int korScore) {
			KorScore = korScore;
		}
		public int getEngScore() {
			return EngScore;
		}
		public void setEngScore(int engScore) {
			EngScore = engScore;
		}
		public int getMathScore() {
			return MathScore;
		}
		public void setMathScore(int mathScore) {
			MathScore = mathScore;
		}


		public Student(
						String name,
						int korScore,
						int engScore,
						int mathScore) {
			this.name = name;
			this.KorScore = korScore;
			this.EngScore = engScore;
			this.MathScore = mathScore;
		}
		
		// 총점
		public int sumScores() {
			return KorScore + EngScore + MathScore;
		}
		
		// 평균
		public int avgScores() { 
			return (KorScore + EngScore + MathScore) / 3 ;
		}
		
		
		public void ExamInfo() {
		System.out.println("이름 : " + name);
		System.out.println("국어 점수 : " + KorScore);
		System.out.println("영어 점수 : " + EngScore);
		System.out.println("수학 점수 : " + MathScore);
		System.out.println("총점 : " + sumScores());
		System.out.println("평균 : " + avgScores());
		System.out.println("========================");
		}
		
public static void main(String[] args) {
	Student[] stuArr = new Student[5];
			
		stuArr[0] = new Student("김자바", 80, 70, 30);
		stuArr[1] = new Student("이자바", 75, 40, 90);
		stuArr[2] = new Student("박자바", 90, 89, 52);
		stuArr[3] = new Student("송자바", 96, 100, 63);
		stuArr[4] = new Student("장자바", 100, 75, 77);
	
		for (int inx = 0; inx < stuArr.length; inx++) {
			stuArr[inx].ExamInfo();
}
	}

}
