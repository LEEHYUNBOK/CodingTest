import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1546 {
	// ���� : ���
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		int a = Integer.parseInt(br.readLine());
		String t = br.readLine();
		String[] result = t.split(" ");
		float n = Integer.parseInt(result[0]);
		for (String i : result) {
			if (n < Integer.parseInt(i))
				n = Integer.parseInt(i);
		}
		float sum = 0;
		for (int i = 0; i < a; i++) {
			sum += Integer.parseInt(result[i]) / n * 100;
		}

		sb.append(sum / a);
		System.out.println(sb);
	}
}
