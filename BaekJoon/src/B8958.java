import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B8958 {
	// 문제 : OX퀴즈
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			String t = br.readLine();
			String[] result = t.split("");
			int n = 0;
			int sum = 0;
			for (String j : result) {
				if (j.equals("O")) {
					n += 1;
					sum += n;
				} else
					n = 0;
			}
			sb.append(sum + "\n");
		}
		System.out.println(sb);
	}
}
