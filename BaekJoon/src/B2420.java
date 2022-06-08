import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2420 {
	// 문제 : 사파리월드
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		sb.append(Math.abs(a - b));
		System.out.println(sb);
	}
}
