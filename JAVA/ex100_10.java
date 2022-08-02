package Quiz;

import java.util.Scanner;

public class ex100_10 {
	public static void main(String[] args) {
		/*
		 * 정수(integer) 두 개를 입력받아 그대로 출력해보자.
		 * 
		 * 입력
		 * 
		 * 두 개의 정수가 차례대로 입력된다.
		 * 
		 * 출력
		 * 
		 * 입력받은 두 정수를 공백으로 구분하여 그대로 출력한다.
		 * 
		 * 입력 예시
		 * 
		 * 1
		 * 
		 * 2
		 * 
		 * 출력 예시
		 * 
		 * 1 2
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번쨰 숫자 입력:");
		int num = scan.nextInt();
		System.out.println("두번쨰 숫자 입력:");
		int num2 = scan.nextInt();
		
		System.out.println(num+" "+num2);
	}
}
