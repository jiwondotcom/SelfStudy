package study_0603;

public class ThreadNameExample {
	public static void main(String[] args) {
		
		
		Thread mainThread = Thread.currentThread(); // 이 코드를 실행하는 스레드 객체 얻기
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName()); // 스레드 이름 얻기
		
		ThreadA threadA = new ThreadA(); // threadA 생성
		System.out.println("작업 스레드 이름: " + threadA.getName()); // 스레드 이름 얻기
		threadA.start(); // threadA 시작
		
		ThreadB threadB = new ThreadB(); // threadB 생성
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start(); // threadB 시작

	}

}
