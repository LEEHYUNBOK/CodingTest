import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5597 {
	// ���� : ���� �� ���� ��..?
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�
		boolean[] array = new boolean[30];
		for (int i = 0; i < 28; i++) {
			int size = Integer.parseInt(br.readLine());
			array[size - 1] = true;
		}
		for (int i = 0; i < 30; i++) {
			if (array[i] == false)
				sb.append((i + 1) + "\n");
		}
		System.out.println(sb);
	}
}
