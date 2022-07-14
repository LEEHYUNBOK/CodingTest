import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2631 {
	// ���� : �ټ����
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
	static StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

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

			// 0 ~ i ���� ���ҵ� Ž��
			for (int j = 0; j < i; j++) {

				// j��° ���Ұ� i��° ���Һ��� �����鼭 i��° dp�� j��° dp+1 ������ �������
				if (child[j] < child[i] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1; // j��° ������ +1 ���� i��° dp�� �ȴ�.
					lineUp = Math.max(lineUp, dp[i]);
				}
			}
		}

		sb.append(input - lineUp);
		/**
		 * ���� ���� �� �� int count = 0; int start = 0; for (int i = 1; i < input; i++) { if
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
