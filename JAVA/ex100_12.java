import java.util.Scanner;

/*문제 12

하나의 단어를 입력받아 그대로 출력해보자.

입력

한 단어가 입력된다.
(단, 단어의 길이는 50글자 이하이다.)

출력

입력받은 단어를 그대로 출력한다.

입력 예시 

Informatics

출력 예시

Informatics
*/
public class ex100_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		System.out.println(word);
	}
	
}
