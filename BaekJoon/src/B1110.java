import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1110 {
	// 문제 : 더하기 사이클
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		int n = Integer.parseInt(br.readLine());
		int result = n;
		int count = 0;
		while (true) {
			int a = result / 10;
			int b = result % 10;
			result = (result % 10) * 10 + ((a + b) % 10);
			count++;
			if (result == n)
				break;
		}
		sb.append(count);
		System.out.println(sb);
	}
}
