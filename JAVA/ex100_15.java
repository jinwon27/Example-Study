/*���� 15

��, ��, ���� �Է¹޾� ���Ŀ� �°� ����ϴ� ���α׷��� �ۼ��غ���.

�Է�

��, ��, ���� ���еǾ� �Էµȴ�.

���

�Է¹��� ��, ��, ���� ����Ѵ�. ��, �ڸ����� yyyy.mm.dd���·� ����Ѵ�.*/

import java.util.*;
public class ex100_15 {
	public static void main(String[] args) {
		
		// d : ������ ���·� ����̴�.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("��� �Դϱ�?");
		int year = scan.nextInt();
		System.out.print("��� �Դϱ�?");
		int mon = scan.nextInt();
		System.out.print("���� �Դϱ�?");
		int day = scan.nextInt();
		
		System.out.printf("%d", year);
		System.out.printf(".");		
		System.out.printf("%d", mon);
		System.out.printf(".");
		System.out.printf("%d", day);
		
	}
}
