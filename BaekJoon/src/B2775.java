import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2775 {
	// ���� : �γ�ȸ���� ���׾�
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		int[][] apartment = new int[15][15];

		int input = Integer.parseInt(br.readLine());
		for (int i = 0; i < input; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			if (apartment[k][n] == 0) {
//				sb.append("����");
				for (int num1 = 1; num1 <= n; num1++) {
//					sb.append(num1 + "ȣ@@@@\n");
					for (int num2 = 0; num2 <= k; num2++) {

						if (num2 == 0)
							apartment[num2][num1] = num1;
						else {
							apartment[num2][num1] = apartment[num2][num1 - 1] + apartment[num2 - 1][num1];
						}
//						sb.append(num2 + "�� = " + apartment[num2][num1] + "\n");
					}
				}
			}
			sb.append(apartment[k][n] + "\n");
		}
		System.out.println(sb);
	}
}
