import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10952 {
	// ���� : A+B - 5
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine()); // Ex) "1 2"�̶�� �Է��ϸ� ������ �������� 1,2 ���·� ����� (defalt��
																		// "
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if (x == 0 && y == 0)
				break;
			sb.append(x + y + "\n");

		}
		System.out.println(sb);
	}
}
