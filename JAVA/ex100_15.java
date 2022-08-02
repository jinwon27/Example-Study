/*문제 15

년, 월, 일을 입력받아 형식에 맞게 출력하는 프로그램을 작성해보자.

입력

년, 월, 일이 구분되어 입력된다.

출력

입력받은 년, 월, 일을 출력한다. 단, 자릿수는 yyyy.mm.dd형태로 출력한다.*/

import java.util.*;
public class ex100_15 {
	public static void main(String[] args) {
		
		// d : 십진수 형태로 출력이다.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("몇년 입니까?");
		int year = scan.nextInt();
		System.out.print("몇월 입니까?");
		int mon = scan.nextInt();
		System.out.print("몇일 입니까?");
		int day = scan.nextInt();
		
		System.out.printf("%d", year);
		System.out.printf(".");		
		System.out.printf("%d", mon);
		System.out.printf(".");
		System.out.printf("%d", day);
		
	}
}
