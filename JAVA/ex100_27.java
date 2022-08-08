/*입력된 두 정수 a, b 중 큰 값을 출력하는 프로그램을 작성해보자.
(단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.)

입력
두 정수가 입력된다.
(-2147483648 ~ 2147483647)

출력
큰 값이 10진수로 출력된다*/

import java.util.Scanner;

public class ex100_27 {	
		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자 입력");
			int a = sc.nextInt();
			System.out.print("숫자 입력");
			int b = sc.nextInt();
			
			int i = ( a > b ) ? a : b; //?연산자 (삼항연산자)
			System.out.println(i);
			
			if( a > b ) {
				//true
				i = a;
			}else {
				//false
				i = b;
			}
			System.out.println(i);			
		}
}
