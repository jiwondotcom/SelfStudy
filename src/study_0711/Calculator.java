package study_0711;

import java.util.Scanner;

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

	//	원의 둘레
	static float circleAround (float r) {
		return (float)Math.PI * 2 * r;
	}
	
	//	원의 넓이
	static float circleArea (float r) {
		return (float)Math.PI * r * r;
	}
	
	static int getIntInput(Scanner sc) {
		return sc.nextInt();
	}
	
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력하세요 : ");
		int a = getIntInput(sc);
		System.out.print("두번째 숫자를 입력하세요 : ");
		int b = getIntInput(sc);
		System.out.println("=========================");
		
		System.out.println(">> 덧셈 : " + cal.plus(a, b));
		System.out.println(">> 뺄셈 : " + cal.minus(a, b));
		System.out.println(">> 곱셈 : " + cal.multiply(a, b));
		System.out.println(">> 나눗셈 : " + cal.divide(a, b));
		System.out.println("=========================");

		System.out.print("반지름을 입력하세요 : ");
		float r = getIntInput(sc);
		System.out.println(">> 원의 둘레 : " + circleAround(r));
		System.out.println(">> 원의 넓이 : " + circleArea(r));
		System.out.println("=========================");
	
	}
}
