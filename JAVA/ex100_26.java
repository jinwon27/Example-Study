/*문제 26
true(참) 또는 false(거짓) 이 입력되었을 때
반대로 출력하는 프로그램을 작성해보자.
scan.nextBoolean() 사용

입력
Boolean 값 1개가 입력된다.
출력
입력된 값이 true이면 false, false이면 true을 출력한다*/

import java.util.Scanner;

public class ex100_26 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean b = scan.nextBoolean();
		
		if(b==true) {
			System.out.println("false");
		}else {
			System.out.println("true");
		}
		
		System.out.println( !b );// !연산자 = NOT연산자(논리부정연산자)		
	}
}
