import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2439 {
	// ���� : �� ��� - 2
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		int n = Integer.parseInt(br.readLine()); // I

		for (int i = 1; i <= n; sb.append(" ".repeat(n - i) + "*".repeat(i++) + "\n"))
			;
		System.out.println(sb);
	}
}
