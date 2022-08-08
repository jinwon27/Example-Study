/*세 정수 a, b, c가 입력되었을 때,
짝수만 출력해보자.

입력
세 정수 a, b, c 가 입력된다.
(0 ~ 2147483647 범위의 정수들이 입력되며, 적어도 1개는 짝수이다.)

출력
짝수만 순서대로 출력한다.*/

import java.util.Scanner;

public class ex100_28 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력");
		int a = sc.nextInt();
		System.out.print("숫자 입력");
		int b = sc.nextInt();
		System.out.print("숫자 입력");
		int c = sc.nextInt();
		
		if(a%2==0) {
			System.out.println(a);
		}
		if(b%2==0) {
			System.out.println(b);
		}
		if(c%2==0) {
			System.out.println(c);
		}		
	}
}
