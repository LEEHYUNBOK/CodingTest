import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2744 {
	// 문제 : 대소문자 바꾸기
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기
		String inputs = br.readLine();
		String[] input = inputs.split("");
		for (String i : input) {
			char t = i.charAt(0);
			if (65 <= t && t <= 90)
				sb.append(i.toLowerCase());
			else if (97 <= t && t <= 122)
				sb.append(i.toUpperCase());
		}
		System.out.println(sb);
	}
}
