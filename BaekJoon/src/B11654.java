import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11654 {
	// ���� : �ƽ�Ű �ڵ�
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		String a = br.readLine();
		sb.append(a.getBytes("US-ASCII")[0]);
		System.out.println(sb);
	}
}
