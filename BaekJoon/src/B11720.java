import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11720 {
	// ���� : ������ ��
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		int a = Integer.parseInt(br.readLine());
		String re = br.readLine();
		int sum = 0;
		String[] result = re.split("");
		for (String i : result)
			sum += Integer.parseInt(i);
		sb.append(sum);
		System.out.println(sb);
	}
}
