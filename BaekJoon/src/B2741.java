import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2741 {
	// ���� : N ���
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		int n = Integer.parseInt(bf.readLine()); // I

		for (int i = 1; i <= n; i++) {
			sb.append(i + "\n");
		}
		System.out.println(sb);
	}
}
