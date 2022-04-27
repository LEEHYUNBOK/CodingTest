import java.util.Scanner;

public class B2480 {
	// 문제 : 주사위 세개
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		int d3 = sc.nextInt();
		int sum = 0;
		// 3개 다 같을때
		if (d1 == d2 && d1 == d3)
			sum = 10000 + d1 * 1000;
		// d1 d2 같고 d3가 다르거나 d1 d3 같고 d2가 다를때
		else if ((d1 == d2 && d1 != d3) || (d1 != d2 && d1 == d3))
			sum = 1000 + d1 * 100;
		// d2 d3 같고 d1가 다를때
		else if (d1 != d2 && d2 == d3)
			sum = 1000 + d2 * 100;
		// 다 다를때
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
