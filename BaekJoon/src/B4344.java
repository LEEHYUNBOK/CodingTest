import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4344 {
	// ���� : ����� �Ѱ���
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int stx = Integer.parseInt(st.nextToken());
			int[] array = new int[stx];
			float sum = 0;
			for (int j = 0; j < stx; j++) {
				array[j] = Integer.parseInt(st.nextToken());
				sum += array[j];
			}
			sum = sum / stx;
			int count = 0;
			for (int s : array) {
				if (s > sum)
					count++;
			}
			sb.append(String.format("%.3f", (((float) count) / stx * 100)) + "%\n");
		}
		System.out.println(sb);
	}
}
