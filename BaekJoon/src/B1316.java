import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1316 {
	// 문제 : 그룹 단어 체커
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		int input = Integer.parseInt(br.readLine());
		int result = input;

		for (int i = 0; i < input; i++) {
			String s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				if (s.indexOf(s.charAt(j), j + 1) != j + 1 && s.indexOf(s.charAt(j), j + 1) != -1) {
					result--;
					break;
				}
			}
		}
		sb.append(result);

		System.out.println(sb);
	}
}
