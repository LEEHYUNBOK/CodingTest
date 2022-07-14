import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2293 {
	// 문제 : 동전 1
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
	static StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(br.readLine());
		int coins = Integer.parseInt(st.nextToken());
		int amount = Integer.parseInt(st.nextToken());
		int[] coin = new int[coins];
		for (int i = 0; i < coins; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		sb.append(coinCount(coin, amount));
		System.out.println(sb);
	}

	public static int coinCount(int[] coin, int amount) {
		int[] count = new int[amount + 1];
		for (int coinOne : coin) {
			for (int j = coinOne; j <= amount; j++) {
				if (j == coinOne) {
					count[j] += 1;
					continue;
				}
				count[j] += count[j - coinOne];
			}
		}

		return count[amount];
	}
}
