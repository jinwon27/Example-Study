/*���� 23
�� ����(a, b)�� �Է¹޾� 
a�� b�� ������ 1,
a�� b�� ���� ������ 0�� ����ϴ� ���α׷��� �ۼ��غ���.
if���� ����Ѵ�.
�Է�
�� ���� a, b�� �Էµȴ�.
(-2147483648 ~ 2147483647)
���
a�� b�� ���� ���� ��� 1, �׷��� ���� ��� 0�� ����Ѵ�.*/

import java.util.Scanner;

public class ex100_23 {
	public static void main(String[] args) {
		// == �� ������ ����ϱ�
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���.");
		int a = scan.nextInt();
		System.out.print("������ �Է��ϼ���.");
		int b = scan.nextInt();
		if(a==b) {
			System.out.println("1");
		}else {
			System.out.println("0");
			
		}
	}
}
