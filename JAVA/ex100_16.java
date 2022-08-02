/*10진수를 입력받아 8진수로 출력하는 프로그램을 작성해보자.

입력

10진수가 1개 입력된다.
(단, 입력되는 정수는 int 범위이다.)

출력

입력 받은 10진수를 8진수로 바뀌어 출력한다.*/

import java.util.Scanner;

public class ex100_16 {
	public static void main(String[] args) {
		
		// %o 를 사용하면 8진수로 출력이 가능함!
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.printf("%o",num);
	}
}
