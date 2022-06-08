import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2743 {
	// 문제 : 단어 길이 재기
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기
		String input = br.readLine();
		sb.append(input.length());
		System.out.println(sb);
	}
}
