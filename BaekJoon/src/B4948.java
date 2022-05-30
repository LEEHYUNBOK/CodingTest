import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4948 {
	// ���� : �Ҽ� ���ϱ�
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		while (true) {
			int input = Integer.parseInt(br.readLine());
			if (input == 0)
				break;
			int count = 0;
			boolean[] array = new boolean[(input + 1) * 2];
			array[0] = true;
			array[1] = true;

			// �����佺�׳׽��� ü �˰���
			for (int i = 2; i <= Math.sqrt(array.length); i++) {
				if (array[i] == true)
					continue;
				for (int j = i * i; j < (array.length); j += i) {
					array[j] = true;
				}
			}
			// ===================
			for (int i = input + 1; i <= input * 2; i++) {

				if (array[i] == false)
					count++;
			}
			sb.append(count + "\n");
		}
		System.out.println(sb);
	}
}
