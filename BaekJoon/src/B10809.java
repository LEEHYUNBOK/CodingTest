import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10809 {
	// ���� : ���ĺ� ã��
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

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
