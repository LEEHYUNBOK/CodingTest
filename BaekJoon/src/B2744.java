import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2744 {
	// ���� : ��ҹ��� �ٲٱ�
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�
		String inputs = br.readLine();
		String[] input = inputs.split("");
		for (String i : input) {
			char t = i.charAt(0);
			if (65 <= t && t <= 90)
				sb.append(i.toLowerCase());
			else if (97 <= t && t <= 122)
				sb.append(i.toUpperCase());
		}
		System.out.println(sb);
	}
}
