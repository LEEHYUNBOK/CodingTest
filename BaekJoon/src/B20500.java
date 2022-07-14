import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B20500 {
	// 문제 : Ezreal 여눈부터 가네 ㅈㅈ (설명 참고 함, 못품)
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
	static StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long MOD = 1000000007L;
		int N = Integer.parseInt(br.readLine());

		if (N == 1)
			sb.append(0);
		else {
			long[][] dp = new long[3][N + 1];
			dp[0][2] = dp[1][2] = 1;

			for (int i = 3; i <= N; i++) {
				dp[0][i] = (dp[1][i - 1] + dp[2][i - 1]) % MOD;
				dp[1][i] = (dp[0][i - 1] + dp[2][i - 1]) % MOD;
				dp[2][i] = (dp[0][i - 1] + dp[1][i - 1]) % MOD;
			}
			sb.append(dp[0][N]);
		}
		System.out.println(sb);
	}
}
