import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B24416 {
	// ���� : �˰��� ���� - �Ǻ���ġ �� 1
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
	static StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int input = Integer.parseInt(br.readLine());

		sb.append(fib(input) + " " + fibonacci(input));
		System.out.println(sb);
	}

	public static int fib(int n) {
		if (n == 1 || n == 2)
			return 1; // �ڵ�1
		else
			return (fib(n - 1) + fib(n - 2));
	}

	public static int fibonacci(int n) {
		int[] f = new int[n + 1];
		f[1] = 1;
		f[2] = 1;
		int count = 0;
		for (int i = 3; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2]; // �ڵ�2
			count++;
		}
		return count;
	}
}
