import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10871 {
	// ���� : X���� ���� ��
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		StringTokenizer st = new StringTokenizer(br.readLine()); // Ex) "1 2"�̶�� �Է��ϸ� ������ �������� 1,2 ���·� ����� (defalt�� "
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		String a = br.readLine();
		String[] array = a.split(" ");
		for (String t : array) {
			if (x > Integer.parseInt(t))
				sb.append(t + " ");
		}
		System.out.println(sb);
	}
}
