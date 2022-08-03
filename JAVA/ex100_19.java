/*10진 정수 한 개를 입력받아 아스키문자로 출력하는 프로그램을 작성해보자.
(단, 0 ~ 255 범위의 정수만 입력된다.)

입력

10진수 1개
(0 ~ 255 범위)

출력

입력된 10진수에 해당되는 아스키 문자 1개*/

import java.util.Scanner;

public class ex100_19 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		char c = (char) num;
		System.out.println(c);
	}
	
	// 아스키 코드표(ASCII Table) 참고하기 
	// 출처 : https://stepbystep1.tistory.com/10
}
