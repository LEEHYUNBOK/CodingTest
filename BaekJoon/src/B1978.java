import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1978 {
	// ���� : �Ҽ� ã��
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�
		int input = Integer.parseInt(br.readLine());
		String st = br.readLine();
		String[] result = st.split(" ");
		int count = 0;
		for (int i = 0; i < input; i++) {
			if (Integer.parseInt(result[i]) == 1 && Integer.parseInt(result[i]) == 2)
				continue;
			for (int j = 2; j < 1000; j++) {
				if (Integer.parseInt(result[i]) % j == 0) {
					if (Integer.parseInt(result[i]) == j) {
						System.out.println(result[i] + " test");
						count++;
					}
					break;
				}
			}
		}
		sb.append(count);
		System.out.println(sb);
	}
}
