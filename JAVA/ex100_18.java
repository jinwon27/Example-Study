/*���� 18 (���̵� ��)

������ �� ���� �Է¹޾� �ƽ�Ű�ڵ� 10���������� ����ϴ� ���α׷��� �ۼ��غ���.

String Ŭ������ charAt(index i) �޼ҵ带 ����Ͽ� char�� ���� �� ���� char�� �Է��� �� �ִ�. )

��)  String str = scanner.nextLine();

     char c = str.charAt(0); //�ε��� 0(ù��°) ���ڸ� ������.*/
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
// �ƽ�Ű �ڵ�ǥ(ASCII Table) �����ϱ� 
// ��ó : https://stepbystep1.tistory.com/10