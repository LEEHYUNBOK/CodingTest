import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1316 {
	// ���� : �׷� �ܾ� üĿ
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

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
