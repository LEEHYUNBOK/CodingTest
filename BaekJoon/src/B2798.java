import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2798 {
	// 문제 : 블랙잭
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
	static StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(br.readLine());
		int conut = Integer.parseInt(st.nextToken());
		int limit = Integer.parseInt(st.nextToken());
		String cards = br.readLine();
		String[] t = cards.split(" ");
		int[] card = new int[t.length];
		int num = 0;
		for (String k : t) {
			card[num++] = Integer.parseInt(k);
		}
		sb.append(blackjack(card, limit));
//		hanoi(inputs, 0);
		System.out.println(sb);
	}

	public static int blackjack(int[] card, int limit) {
		int sum = 0;
		for (int first = 0; first < card.length - 2; first++) {
			for (int second = first + 1; second < card.length - 1; second++) {
				for (int third = second + 1; third < card.length; third++) {
					int compare = card[first] + card[second] + card[third];
					if (limit == compare)
						return compare;
					if (limit >= compare && sum <= compare)
						sum = compare;
				}
			}
		}

		return sum;
	}
}
