package study_0711;

import java.util.Scanner;

public class Member {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println(">> 당신의 이름은 " + name + "입니다.");
	
		int age = 5;
		double height = 171.2;
		boolean hasBook = false;;
		
		System.out.println("이름은 " + name + "이며, 나이는 " + age + "살 입니다."
						+ "키는 " + height + "cm이며, JAVA책 보유 여부는 " + hasBook + "입니다.");
		
	}

}
