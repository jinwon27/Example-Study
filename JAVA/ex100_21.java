/*���� 21

���� �� ��(a, b)�� �Է¹޾� (0 <= a, b <= 10)
a�� 2b�� ���ϴ� ���α׷��� �ۼ��غ���.

k = a * 2b; �� ����.*/

import java.util.Scanner;

public class ex100_21 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� �Է�>");
		int a = scan.nextInt();
		if(0<=a) {
			System.out.print("10���� ���� ���� �Է� : ");
			int b = scan.nextInt();
			if(b<=10) {
				double multi = a*Math.pow(2, b);
				System.out.println(multi);
			}else {
				System.out.println("�ٽ� �Է��� �ּ���.");
			}
				}
			else {
			System.out.println("�ٽ� �Է��� �ּ���.");
		}
	}
}

