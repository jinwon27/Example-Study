/*���� 25
�� ����(a, b)�� �Է¹޾� 
a�� b�� ���� �ٸ��� 1,
a�� b�� ������ 0
�� ����ϴ� ���α׷��� �ۼ��غ���.

�Է�
�� ���� a, b�� �Էµȴ�.
(-2147483648 ~ 2147483647)
���
a�� b�� �ٸ� ��� 1, �׷��� ���� ��� 0�� ����Ѵ�.*/

import java.util.Scanner;

public class ex100_25 {
	public static void main(String[] args) {
		
		// ������ Ȱ�빮��.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�");
		int a = scan.nextInt();
		System.out.print("���� �Է�");
		int b = scan.nextInt();
		if(a!=b) {
			System.out.println("1");
		}else {
			System.out.println("0");		
		}
	}
}
