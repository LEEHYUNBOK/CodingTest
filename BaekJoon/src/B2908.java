import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2908 {
	// ���� : ���
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		String input = br.readLine();
		String[] s = input.split(" ");
		String[] a = s[0].split("");
		String[] b = s[1].split("");
		int asum = 0;
		int bsum = 0;
		for (int i = a.length - 1; i >= 0; i--)
			asum += Integer.parseInt(a[i]) * (Math.pow(10, i));
		for (int i = b.length - 1; i >= 0; i--)
			bsum += Integer.parseInt(b[i]) * (Math.pow(10, i));

		sb.append(asum > bsum ? asum : bsum);
		System.out.println(sb);
	}
}
