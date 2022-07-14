import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2631 {
	// 문제 : 줄세우기
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
	static StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int input = Integer.parseInt(br.readLine());
		int[] child = new int[input];
		for (int i = 0; i < input; i++) {
			child[i] = Integer.parseInt(br.readLine());
		}

		int[] dp = new int[input];
		int lineUp = 0;
		for (int i = 0; i < input; i++) {
			dp[i] = 1;

			// 0 ~ i 이전 원소들 탐색
			for (int j = 0; j < i; j++) {

				// j번째 원소가 i번째 원소보다 작으면서 i번째 dp가 j번째 dp+1 값보다 작은경우
				if (child[j] < child[i] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1; // j번째 원소의 +1 값이 i번째 dp가 된다.
					lineUp = Math.max(lineUp, dp[i]);
				}
			}
		}

		sb.append(input - lineUp);
		/**
		 * 내가 직접 한 것 int count = 0; int start = 0; for (int i = 1; i < input; i++) { if
		 * (start < child[i] && start != 0) continue; int add = lineUp_me(child, i); if
		 * (count < add) { count = add; start = child[i]; } }
		 * 
		 * sb.append(input - count);
		 **/
		System.out.println(sb);
	}

	public static int lineUp_me(int[] child, int compare) {
		int count = 1;
		if (child[compare] == child.length - 1 || compare + 1 == child.length) {
			return 1;
		}

		for (int i = compare + 1; i < child.length; i++) {
			if (child[compare] < child[i]) {
				int add = 1 + lineUp_me(child, i);
				if (count < add)
					count = add;
			}
		}
		return count;
	}
}
