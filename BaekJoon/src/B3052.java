import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3052 {
	// ���� : ������
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		int[] count = new int[42];
		int t = 0;
		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(br.readLine());
			if (count[a % 42] == 0)
				t++;
			count[a % 42]++;
		}
		sb.append(t + "\n");
		System.out.println(sb);
	}
}
