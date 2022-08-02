import java.util.Scanner;

/*두 개의 문자를 입력받은 후 순서를 바꿔 출력해보자.

입력

두 개의 문자가 차례대로 입력된다.

출력

입력한 두 문자의 순서를 바꿔 출력한다.*/
public class ex100_11 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력해 주세요.");
		String a = scan.next();
		System.out.println("문자를 입력해 주세요.");
		String b = scan.next();
		System.out.println(b+" "+a);

	}
}
