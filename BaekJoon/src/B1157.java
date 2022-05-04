import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1157 {
	// ���� : �ܾ� ����
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

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
