import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1152 {
	// ���� : �ܾ��� ����
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		String a = br.readLine().trim();
		String[] s = a.split(" ");
		int count = 0;
		for (String t : s) {
			if (t.equals(""))
				count++;
		}
		sb.append(s.length - count);
		System.out.println(sb);
	}
}
