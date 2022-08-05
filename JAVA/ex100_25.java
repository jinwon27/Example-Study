/*문제 25
두 정수(a, b)를 입력받아 
a와 b가 서로 다르면 1,
a와 b가 같으면 0
을 출력하는 프로그램을 작성해보자.

입력
두 정수 a, b가 입력된다.
(-2147483648 ~ 2147483647)
출력
a와 b가 다른 경우 1, 그렇지 않은 경우 0을 출력한다.*/

import java.util.Scanner;

public class ex100_25 {
	public static void main(String[] args) {
		
		// 연산자 활용문제.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력");
		int a = scan.nextInt();
		System.out.print("정수 입력");
		int b = scan.nextInt();
		if(a!=b) {
			System.out.println("1");
		}else {
			System.out.println("0");		
		}
	}
}
