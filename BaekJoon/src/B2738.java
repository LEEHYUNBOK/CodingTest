import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2738 {
	// ���� : ��� ����
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�
		StringTokenizer st = new StringTokenizer(br.readLine());
		int stx = Integer.parseInt(st.nextToken());
		int sty = Integer.parseInt(st.nextToken());
		int[][] array = new int[stx][sty];
		for (int i = 0; i < array.length; i++) {
			String arrayIn = br.readLine();
			String[] test = arrayIn.split(" ");
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = Integer.parseInt(test[j]);
			}
		}
		for (int i = 0; i < array.length; i++) {
			String arrayIn = br.readLine();
			String[] test = arrayIn.split(" ");
			for (int j = 0; j < array[i].length; j++) {
				sb.append((array[i][j] + Integer.parseInt(test[j])) + " ");
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}
