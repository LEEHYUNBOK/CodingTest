import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10952 {
	// 문제 : A+B - 5
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine()); // Ex) "1 2"이라고 입력하면 공백을 기준으로 1,2 형태로 저장됨 (defalt가
																		// "
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if (x == 0 && y == 0)
				break;
			sb.append(x + y + "\n");

		}
		System.out.println(sb);
	}
}
