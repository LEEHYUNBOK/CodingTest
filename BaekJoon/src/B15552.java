import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15552 {
	// ���� : ��
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder bw = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�
		// ���� �����ϰ� ���ִ� ��
		StringTokenizer st = null;

		int n = Integer.parseInt(bf.readLine()); // I

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(bf.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			bw.append(x + y + "\n");
		}
//		bw.flush(); // �����ִ� �����͸� ��� ��½�Ŵ
//		bw.close(); // ��Ʈ���� ����
		System.out.println(bw);
	}
}
