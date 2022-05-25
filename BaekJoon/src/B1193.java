import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1193 {
	// 문제 : 분수찾기
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		int a = Integer.parseInt(br.readLine());
		int fraction = 0;
		int sum = 0;

		for (int i = 1; i <= a; i++) {
			sum += i;
			if (sum - i + 1 <= a && a <= sum) {
				fraction = i;
				break;
			}
		}

		if (fraction % 2 == 0) {
			for (int i = fraction; i > 0; i--) {
				if (a == sum) {
					sb.append(i + "/" + (fraction - i + 1));
					break;
				}
				sum--;
			}
		}

		else {
			for (int i = fraction; i > 0; i--) {
				if (a == sum) {
					sb.append((fraction - i + 1) + "/" + i);
					break;
				}
				sum--;
			}
		}
		System.out.println(sb);
	}
}
