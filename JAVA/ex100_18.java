/*문제 18 (난이도 중)

영문자 한 개를 입력받아 아스키코드 10진수값으로 출력하는 프로그램을 작성해보자.

String 클래스의 charAt(index i) 메소드를 사용하여 char형 문자 한 개를 char에 입력할 수 있다. )

예)  String str = scanner.nextLine();

     char c = str.charAt(0); //인덱스 0(첫번째) 문자를 가져옴.*/
import java.util.Scanner;

public class ex100_18 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char as = str.charAt(0);
		int num = as;
		System.out.println(num);
	}
}
// 아스키 코드표(ASCII Table) 참고하기 
// 출처 : https://stepbystep1.tistory.com/10