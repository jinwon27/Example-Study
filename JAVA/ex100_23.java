/*문제 23
두 정수(a, b)를 입력받아 
a와 b가 같으면 1,
a가 b와 같지 않으면 0을 출력하는 프로그램을 작성해보자.
if문을 사용한다.
입력
두 정수 a, b가 입력된다.
(-2147483648 ~ 2147483647)
출력
a와 b의 값이 같은 경우 1, 그렇지 않은 경우 0을 출력한다.*/

import java.util.Scanner;

public class ex100_23 {
	public static void main(String[] args) {
		// == 비교 연산자 사용하기
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요.");
		int a = scan.nextInt();
		System.out.print("정수를 입력하세요.");
		int b = scan.nextInt();
		if(a==b) {
			System.out.println("1");
		}else {
			System.out.println("0");
			
		}
	}
}
