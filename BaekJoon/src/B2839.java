import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839 {
	// ���� : ���� ���
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		int input = Integer.parseInt(br.readLine());
		int result = -1;
		for (int i = input / 5; i > 0; i--) {
			if ((input - 5 * i) % 3 == 0) {
				result = i + (input - 5 * i) / 3;
				break;
			}
		}
		if (input % 3 == 0 && result == -1)
			result = input / 3;
		sb.append(result);
		System.out.println(sb);
	}
}
