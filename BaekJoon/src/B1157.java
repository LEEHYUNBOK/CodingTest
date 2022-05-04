import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1157 {
	// 문제 : 단어 공부
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		String a = br.readLine();
		a = a.toLowerCase();
		int[] num = new int[26];
		for (int i = 0; i < a.length(); i++) {
			char t = a.charAt(i);
			num[(int) (t - 'a')]++;
		}
		char result = 0;
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (count < num[i]) {
				count = num[i];
				result = (char) ('a' + i);
			}
		}
		for (int i = 0; i < num.length; i++) {
			if ((int) (result - 'a') != i) {
				if (count == num[i]) {
					result = '?';
				}
			}
		}
		sb.append(Character.toUpperCase(result));
		System.out.println(sb);
	}
}
