/*���� �� ���� �Է¹޾� �հ� ����� ����ϴ� ���α׷��� �ۼ��غ���.
(��, -2147483648 ~ 2147483647)

�Է�

���� �� ���� �Էµȴ�.
(��, -2147483648 ~ 2147483647)

���

�Է� ���� ���� �� ���� �հ� ����� ���� �ٲ� ����Ѵ�.
����� �Ҽ��� ���� ��° �ڸ����� �ݿø��Ͽ� ù° �ڸ����� ����Ѵ�.*/

// int / int = int
// float / int = float
// double / int = double

import java.util.Scanner;

public class ex100_20 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��ϱ�");
		int num1 = scan.nextInt();
		System.out.print("�ι�° ���� �Է��ϱ�");
		int num2 = scan.nextInt();
		System.out.print("����° ���� �Է��ϱ�");
		int num3 = scan.nextInt();
		int sum = num1+num2+num3;
		System.out.println("���� : "+sum);
		System.out.println("��� : "+(float)sum/3);
		
	}
}
