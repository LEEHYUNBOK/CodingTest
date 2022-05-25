import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1193 {
	// ���� : �м�ã��
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		int a = Integer.parseInt(br.readLine());
		int fraction = 0;
		int sum = 0;

		for (int i = 1; i <= a; i++) {
			sum += i;
			if (sum - i + 1 <= a && a <= sum) {
				fraction = i;
				break;
			}
		}

		if (fraction % 2 == 0) {
			for (int i = fraction; i > 0; i--) {
				if (a == sum) {
					sb.append(i + "/" + (fraction - i + 1));
					break;
				}
				sum--;
			}
		}

		else {
			for (int i = fraction; i > 0; i--) {
				if (a == sum) {
					sb.append((fraction - i + 1) + "/" + i);
					break;
				}
				sum--;
			}
		}
		System.out.println(sb);
	}
}
