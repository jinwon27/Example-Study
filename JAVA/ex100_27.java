/*�Էµ� �� ���� a, b �� ū ���� ����ϴ� ���α׷��� �ۼ��غ���.
(��, ���ǹ��� ������� �ʰ� 3�� ������ ? �� ����Ѵ�.)

�Է�
�� ������ �Էµȴ�.
(-2147483648 ~ 2147483647)

���
ū ���� 10������ ��µȴ�*/

import java.util.Scanner;

public class ex100_27 {	
		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���� �Է�");
			int a = sc.nextInt();
			System.out.print("���� �Է�");
			int b = sc.nextInt();
			
			int i = ( a > b ) ? a : b; //?������ (���׿�����)
			System.out.println(i);
			
			if( a > b ) {
				//true
				i = a;
			}else {
				//false
				i = b;
			}
			System.out.println(i);			
		}
}
