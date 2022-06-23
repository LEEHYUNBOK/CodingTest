
public class P12900 {
	// 문제 : 2 x n 타일링
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(4));
		System.out.println();
		System.out.println(solution(7));
	}

	public static long solution(int n) {
		if (n <= 2)
			return n;
		long[] dp = new long[n + 1];
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= n; i++)
			dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;

		return dp[n];
	}
}
