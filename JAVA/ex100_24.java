/*문제 24
두 정수(a, b)를 입력받아,
b가 a보다 크거나 같으면 1, b가 a보다 작으면 0을 출력하는 프로그램을 작성해보자.

입력
두 정수 a, b가 입력된다.
(-2147483648 ~ 2147483647)
출력
b가 a보다 크거나 같은 경우 1, 그렇지 않은 경우 0을 출력한다.*/

import java.util.Scanner;

public class ex100_24 {
	public static void main(String[] args) {
		
		// 연산자 활용문제.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력.");
		int a = scan.nextInt();
		System.out.print("정수를 입력.");
		int b = scan.nextInt();
		if (b>=a) {
			System.out.println("1");
		}else {
			System.out.println("0");
			
		}
	}
}
