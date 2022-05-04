import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1152 {
	// 문제 : 단어의 개수
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		String a = br.readLine().trim();
		String[] s = a.split(" ");
		int count = 0;
		for (String t : s) {
			if (t.equals(""))
				count++;
		}
		sb.append(s.length - count);
		System.out.println(sb);
	}
}
