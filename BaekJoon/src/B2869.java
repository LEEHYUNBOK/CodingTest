import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2869 {
	// ���� : �����̴� �ö󰡰� �ʹ�
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		String input = br.readLine();
		String[] s = input.split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int v = Integer.parseInt(s[2]);
		int result = (v - b) / (a - b);
		if ((v - b) % (a - b) == 0)
			sb.append(result);
		else
			sb.append(result + 1);
		System.out.println(sb);
	}
}
