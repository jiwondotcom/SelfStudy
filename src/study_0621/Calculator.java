package study_0621;

import java.util.Scanner;

//1. Calculator 클래스를 정의해봅시다.
//① 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의
//② 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메소드를 정의
//③ 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메소드를 정의
//④ 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의
//⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
//⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의
//원의 둘레 : 2 x π x r , 원의 넓이 : π x r x r
//⑦ main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.
//⑧ 콘솔에서 사용자에게 데이터를 받아 메소드를 호출할 때 사용자에게 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 main() 메소드
//에 추가해봅시다.


public class Calculator {

	int plus (int a, int b) {
		return a + b;
	}
	
	int minus (int a, int b) {
		return a - b;
	}
	
	int multiply (int a, int b) {
		return a * b;
	}
	
	int divide (int a, int b) {
		return a / b;
	}
	
	float circleAround(float r) {
		return (float)Math.PI * 2 * r;
	}
	
	float circleArea(float r) {
		return (float)Math.PI * r * r;
	}
	
	static int getIntInput(Scanner sc) {
		return sc.nextInt();
	}
	
	public static void main(String[] args) {

		Calculator cal = new Calculator();
		Scanner sc = new Scanner (System.in);

		System.out.println("첫번째 숫자를 입력하세요.");
		int a = getIntInput(sc);
		System.out.println("두번째 숫자를 입력하세요.");
		int b = getIntInput(sc);
		
		System.out.println("=========================");
		
		System.out.println(">> 덧셈 : " + cal.plus(a,b));
		System.out.println(">> 뺄셈 : " + cal.minus(a,b));
		System.out.println(">> 곱셈 : " + cal.multiply(a,b));
		System.out.println(">> 나눗셈 : " + cal.divide(a,b));
		
		System.out.println("=========================");
		
		System.out.println("1. 반지름을 입력하세요.");
		float r = sc.nextFloat();
		
		System.out.println("원의 둘레 : " + cal.circleAround(r));
		System.out.println("원의 넓이 : " + cal.circleArea(r));
		System.out.println();
		
		
	}

}
