import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11653 {
	// ���� : ���μ�����
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�
		int input = Integer.parseInt(br.readLine());
		int k = 2;
		if (input != 1) {
			while (true) {
				if (input % k == 0) {
					sb.append(k + "\n");
					input = input / k;
					continue;
				}
				if (input <= k)
					break;
				k++;
			}
		}
		System.out.println(sb);
	}
}
