import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2675 {
	// ���� : ���ڿ� �ݺ�
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		int a = Integer.parseInt(br.readLine());
		for (int i = 0; i < a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			String[] s = st.nextToken().split("");
			for (String j : s) {
				for (int k = 0; k < n; k++)
					sb.append(j);
			}

			sb.append("\n");
		}
		System.out.println(sb);
	}
}
