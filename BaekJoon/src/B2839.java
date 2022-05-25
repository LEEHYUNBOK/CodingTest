import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839 {
	// 문제 : 설탕 배달
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		int input = Integer.parseInt(br.readLine());
		int result = -1;
		for (int i = input / 5; i > 0; i--) {
			if ((input - 5 * i) % 3 == 0) {
				result = i + (input - 5 * i) / 3;
				break;
			}
		}
		if (input % 3 == 0 && result == -1)
			result = input / 3;
		sb.append(result);
		System.out.println(sb);
	}
}
