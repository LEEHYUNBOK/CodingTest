import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10870 {
	// ���� : 5�� ����
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�
		String inputs = br.readLine();
		String[] input = inputs.split("");
		int sum = 0;
		for (String i : input) {
			sum += Math.pow(Integer.parseInt(i), 5);
		}
		sb.append(sum);
		System.out.println(sb);
	}
}
