/*�� ���� a, b, c�� �ԷµǾ��� ��,
¦���� ����غ���.

�Է�
�� ���� a, b, c �� �Էµȴ�.
(0 ~ 2147483647 ������ �������� �ԷµǸ�, ��� 1���� ¦���̴�.)

���
¦���� ������� ����Ѵ�.*/

import java.util.Scanner;

public class ex100_28 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�");
		int a = sc.nextInt();
		System.out.print("���� �Է�");
		int b = sc.nextInt();
		System.out.print("���� �Է�");
		int c = sc.nextInt();
		
		if(a%2==0) {
			System.out.println(a);
		}
		if(b%2==0) {
			System.out.println(b);
		}
		if(c%2==0) {
			System.out.println(c);
		}		
	}
}
