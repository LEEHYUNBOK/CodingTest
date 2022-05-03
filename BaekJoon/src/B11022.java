import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11022 {
	// 문제 : A+B - 8
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기
		StringTokenizer st = null; // 공백을 기준으로 입력 받을 수 있게 해주는 모듈

		int n = Integer.parseInt(br.readLine()); // I

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine()); // Ex) "1 2"이라고 입력하면 공백을 기준으로 1,2 형태로 저장됨 (defalt가 " "이다)
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			sb.append("Case #" + i + ": " + x + " + " + y + " = " + (x + y) + "\n");
		}
		System.out.println(sb);
	}
}
