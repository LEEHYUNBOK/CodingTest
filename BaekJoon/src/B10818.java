import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10818 {
	// ���� : �ּ�, �ִ�
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		int n = Integer.parseInt(br.readLine());
//		StringTokenizer st = new StringTokenizer(br.readLine());
		String t = br.readLine();
		String[] k = t.split(" ");
		int max = Integer.parseInt(k[0]);
		int min = Integer.parseInt(k[0]);
		for (String i : k) {
			if (Integer.parseInt(i) > max)
				max = Integer.parseInt(i);
			if (Integer.parseInt(i) < min)
				min = Integer.parseInt(i);
		}
		sb.append(min + " " + max);
		System.out.println(sb);
	}
}
