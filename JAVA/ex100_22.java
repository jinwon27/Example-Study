/*문제 22

두 정수(a, b)를 입력받아
a가 b보다 크면 1,
a가 b와 같거나 b가 a보다 크다면 0

을 출력하는 프로그램을 작성해보자.

if문을 사용한다.*/
import java.util.Scanner;

public class ex100_22 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력 해주세요");
		int a = scan.nextInt();
		System.out.println("정수를 입력 해주세요");
		int b = scan.nextInt();
		if(b<a) {
			System.out.println("1");
		}else if( b >= a) { 
			System.out.println("0");
			
		}
		
		if(b<a) {
			System.out.println("1");
		}else if( b==a || b>a) { 
			System.out.println("0");
			
		}
	}
}

