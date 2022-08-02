/*문제 17

10진수를 입력받아 16진수(hexadecimal)로 출력하는 프로그램을 작성해보시오.

입력

10진수 1개가 입력된다.

출력

입력 받은 10진수를 16진수로 바꾸어 출력한다.

입력 예시 

255

출력 예시

ff
*/

import java.util.Scanner;

public class ex100_17 {
	public static void main(String[] args) {
		
		// %x 를 사용하면 16진수 형태로 출력이 가능하다. 참고하자
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.printf("%x",num);
	}
}
