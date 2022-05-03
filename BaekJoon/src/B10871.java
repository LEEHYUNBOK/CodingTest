import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10871 {
	// 문제 : X보다 작은 수
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		StringTokenizer st = new StringTokenizer(br.readLine()); // Ex) "1 2"이라고 입력하면 공백을 기준으로 1,2 형태로 저장됨 (defalt가 "
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		String a = br.readLine();
		String[] array = a.split(" ");
		for (String t : array) {
			if (x > Integer.parseInt(t))
				sb.append(t + " ");
		}
		System.out.println(sb);
	}
}
