import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11021 {
	// ���� : A+B - 7
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�
		StringTokenizer st = null; // ������ �������� �Է� ���� �� �ְ� ���ִ� ���

		int n = Integer.parseInt(br.readLine()); // I

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine()); // Ex) "1 2"�̶�� �Է��ϸ� ������ �������� 1,2 ���·� ����� (defalt�� " "�̴�)

			sb.append(
					"Case #" + i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		System.out.println(sb);
	}
}
