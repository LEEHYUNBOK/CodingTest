import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B15596 {
	// ���� : ���� N���� ��
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		int a = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 0; i <= a; i++) {
			sum += i;
		}
		sb.append(sum);
		System.out.println(sb);
	}
}
