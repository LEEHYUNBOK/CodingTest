import java.util.Scanner;

public class B2525 {
	// 문제 : 오븐 시계
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int add = sc.nextInt();
		m = m + (add % 60);
		if (m >= 60) {
			m -= 60;
			h++;
		}
		h = h + (add / 60);
		if (h >= 24)
			h -= 24;
		System.out.println(h + " " + m);
	}

}
