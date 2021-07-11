package study_0711;

public class Student {

	private String name;
	private int KorScore;
	private int EngScore;
	private int MathScore;
	
	// 캡슐화
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

	
	public Student(String name, int korScore, int engScore, int mathScore) {
		this.name = name;
		this.KorScore = korScore;
		this.EngScore = engScore;
		this.MathScore = mathScore;
	}

	
	// 총점 구하는 메소드
	public int sumScores() {
		return KorScore + EngScore + MathScore;
	}
	
	// 평균 구하는 메소드
	public int avgScores() {
		return (KorScore + EngScore + MathScore) / 3;
	}
	 
	// 총점과 평균을 구해 결과를 반환하는 메소드
	public void stuExamInfo() {
		System.out.println("이름 : " + name);
		System.out.println("국어점수 : " + KorScore);
		System.out.println("영어점수 : " + EngScore);
		System.out.println("수학점수 : " + MathScore);
		System.out.println("총점 : " + sumScores() + "점");
		System.out.println("평균 : " + avgScores() + "점");
	}

	
	// Student 타입의 배열을 선언
	// 요소를 저장할 수 있는 배열 인스턴스 생성
	public static void main(String[] args) {
		
		Student[] stuArr = new Student[5];
		
 		stuArr[0] = new Student("김자바", 80, 70, 70);
 		stuArr[1] = new Student("이자바", 60, 100, 99);
 		stuArr[2] = new Student("신자바", 20, 80, 80);
 		stuArr[3] = new Student("최자바", 35, 60, 68);
 		stuArr[4] = new Student("박자바", 95, 50, 44);
 		
 		for(int i = 0; i < stuArr.length; i++) {
 			stuArr[i].stuExamInfo(); 
 			System.out.println("===========================");
 		}

 			
	}
	
	
	
}
