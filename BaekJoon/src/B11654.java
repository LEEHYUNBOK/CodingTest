import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11654 {
	// 문제 : 아스키 코드
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		String a = br.readLine();
		sb.append(a.getBytes("US-ASCII")[0]);
		System.out.println(sb);
	}
}
