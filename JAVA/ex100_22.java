/*���� 22

�� ����(a, b)�� �Է¹޾�
a�� b���� ũ�� 1,
a�� b�� ���ų� b�� a���� ũ�ٸ� 0

�� ����ϴ� ���α׷��� �ۼ��غ���.

if���� ����Ѵ�.*/
import java.util.Scanner;

public class ex100_22 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է� ���ּ���");
		int a = scan.nextInt();
		System.out.println("������ �Է� ���ּ���");
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

