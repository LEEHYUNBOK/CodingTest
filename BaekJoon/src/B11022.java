import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11022 {
	// ���� : A+B - 8
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�
		StringTokenizer st = null; // ������ �������� �Է� ���� �� �ְ� ���ִ� ���

		int n = Integer.parseInt(br.readLine()); // I

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine()); // Ex) "1 2"�̶�� �Է��ϸ� ������ �������� 1,2 ���·� ����� (defalt�� " "�̴�)
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			sb.append("Case #" + i + ": " + x + " + " + y + " = " + (x + y) + "\n");
		}
		System.out.println(sb);
	}
}
