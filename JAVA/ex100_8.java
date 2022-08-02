package Quiz;

import java.util.Scanner;

public class ex100_8 {
	public static void main(String[] args) {
		/*
		 * 키보드로 입력한 문자를 그대로 출력하는 프로그램을 작성해보자.
		 * 
		 * 입력
		 * 
		 * 문자 한 개가 입력된다.
		 * 
		 * 출력
		 * 
		 * 입력된 문자를 그대로 출력한다.
		 * 
		 * 입력 예시
		 * 
		 * p
		 * 
		 * 출력 예시
		 * 
		 * p
		 */
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println("출력 값:"+str);
	}
}
