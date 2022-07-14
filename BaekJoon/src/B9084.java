import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9084 {
	// 문제 : 동전
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
	static StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int input = Integer.parseInt(br.readLine());
		for (int i = 0; i < input; i++) {
			int number = Integer.parseInt(br.readLine());
			String coins = br.readLine();
			String[] k = coins.split(" ");
			int[] coin = new int[k.length];
			for (int compare = 0; compare < k.length; compare++)
				coin[compare] = Integer.parseInt(k[compare]);
			int amount = Integer.parseInt(br.readLine());
			sb.append(coinCount(coin, amount) + "\n");
		}
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
