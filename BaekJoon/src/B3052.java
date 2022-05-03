import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3052 {
	// 문제 : 나머지
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		int[] count = new int[42];
		int t = 0;
		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(br.readLine());
			if (count[a % 42] == 0)
				t++;
			count[a % 42]++;
		}
		sb.append(t + "\n");
		System.out.println(sb);
	}
}
