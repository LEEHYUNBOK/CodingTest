import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B24416 {
	// 문제 : 알고리즘 수업 - 피보나치 수 1
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
	static StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int input = Integer.parseInt(br.readLine());

		sb.append(fib(input) + " " + fibonacci(input));
		System.out.println(sb);
	}

	public static int fib(int n) {
		if (n == 1 || n == 2)
			return 1; // 코드1
		else
			return (fib(n - 1) + fib(n - 2));
	}

	public static int fibonacci(int n) {
		int[] f = new int[n + 1];
		f[1] = 1;
		f[2] = 1;
		int count = 0;
		for (int i = 3; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2]; // 코드2
			count++;
		}
		return count;
	}
}
