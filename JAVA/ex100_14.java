
/*문제 14

시간이 특정 형식에 맞추어 입력될 때 그대로 출력하는 프로그램을 작성 해보자.

입력

시(hour)와 분(minute)이 구분되어 입력된다.

시와 분은 두 개의 정수로 입력받는다.

출력

입력받은 시간을 "시:분"으로 출력한다.*/
import java.util.Scanner;
public class ex100_14 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시 입력>");
		int h = scan.nextInt();
		System.out.print("분 입력>");
		int m = scan.nextInt();
		
		System.out.println(h+" : "+m);
	}
}
