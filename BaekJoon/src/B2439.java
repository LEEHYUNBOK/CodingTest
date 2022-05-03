import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2439 {
	// 문제 : 별 찍기 - 2
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		int n = Integer.parseInt(br.readLine()); // I

		for (int i = 1; i <= n; sb.append(" ".repeat(n - i) + "*".repeat(i++) + "\n"))
			;
		System.out.println(sb);
	}
}
