import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10250 {
	// ���� : ACM ȣ��
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		int input = Integer.parseInt(br.readLine());
		for (int i = 0; i < input; i++) {
			String a = br.readLine();
			String[] s = a.split(" ");
			int h = Integer.parseInt(s[0]);
			int w = Integer.parseInt(s[1]);
			int n = Integer.parseInt(s[2]);
			int result = 0;
			if ((n % h == 0))
				result = h * 100 + ((n / h));
			else
				result = (n % h) * 100 + ((n / h) + 1);
			sb.append(result + "\n");
		}
		System.out.println(sb);
	}
}
