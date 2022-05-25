import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10250 {
	// 문제 : ACM 호텔
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		int input = Integer.parseInt(br.readLine());
		for (int i = 0; i < input; i++) {
			String a = br.readLine();
			String[] s = a.split(" ");
			int h = Integer.parseInt(s[0]);
			int w = Integer.parseInt(s[1]);
			int n = Integer.parseInt(s[2]);
			int result = 0;
			if ((n % h == 0))
				result = h * 100 + ((n / h));
			else
				result = (n % h) * 100 + ((n / h) + 1);
			sb.append(result + "\n");
		}
		System.out.println(sb);
	}
}
