package Quiz;

import java.util.Scanner;

public class ex100_6 {
	public static void main(String[] args) {
		/*
		 * 키보드로 입력한 정수값을 그대로 출력하는 프로그램을 작성해보자.
		 * 
		 * 입력
		 * 
		 * 정수값 한 개가 입력된다.
		 * 
		 * 출력
		 * 
		 * 입력된 정수를 그대로 출력한다.
		 * 
		 * 입력 예시
		 * 
		 * 15
		 * 
		 * 출력 예시
		 * 
		 * 15
		 */
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("값:"+num);
	}
}
