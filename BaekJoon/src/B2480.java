import java.util.Scanner;

public class B2480 {
	// ���� : �ֻ��� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		int d3 = sc.nextInt();
		int sum = 0;
		// 3�� �� ������
		if (d1 == d2 && d1 == d3)
			sum = 10000 + d1 * 1000;
		// d1 d2 ���� d3�� �ٸ��ų� d1 d3 ���� d2�� �ٸ���
		else if ((d1 == d2 && d1 != d3) || (d1 != d2 && d1 == d3))
			sum = 1000 + d1 * 100;
		// d2 d3 ���� d1�� �ٸ���
		else if (d1 != d2 && d2 == d3)
			sum = 1000 + d2 * 100;
		// �� �ٸ���
		else {
			if (d1 > d2 && d1 > d3)
				sum = d1 * 100;
			else if (d2 > d1 && d2 > d3)
				sum = d2 * 100;
			else
				sum = d3 * 100;
		}

		System.out.println(sum);
	}

}
