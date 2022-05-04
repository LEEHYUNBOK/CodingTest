import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10809 {
	// 문제 : 알파벳 찾기
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		String a = br.readLine();
		int[] r = new int[26];
		for (int i = 0; i < r.length; i++) {
			r[i] = -1;
		}
		for (int i = 0; i < a.length(); i++) {
			char t = a.charAt(i);
			if (r[(int) (t - 'a')] == -1) {
				r[(int) (t - 'a')] = i;
			}
		}
		for (int i : r)
			sb.append(i + " ");
		System.out.println(sb);
	}
}
