import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2743 {
	// ���� : �ܾ� ���� ���
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�
		String input = br.readLine();
		sb.append(input.length());
		System.out.println(sb);
	}
}
