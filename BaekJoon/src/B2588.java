import java.util.Scanner;

public class B2588 {
	// ���� : ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a * (b % 10));
		System.out.println(a * ((b / 10) % 10));
		System.out.println(a * (((b / 10) / 10) % 10));
		System.out.println(a * b);
	}

}
