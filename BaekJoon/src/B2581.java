import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2581 {
	// ���� : �Ҽ�
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�
		int first = Integer.parseInt(br.readLine());
		int last = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = 0;
		for (int i = first; i <= last; i++) {
			if (i == 1 && i == 2)
				continue;
			for (int j = 2; j < 10000; j++) {
				if (i % j == 0) {
					if (i == j) {
						if (min == 0)
							min = i;
						sum += i;
					}
					break;
				}
			}
		}
		if (sum == 0)
			sb.append(-1);
		else
			sb.append(sum + "\n" + min);
		System.out.println(sb);
	}
}
