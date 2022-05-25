import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2775 {
	// 문제 : 부녀회장이 될테야
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		int[][] apartment = new int[15][15];

		int input = Integer.parseInt(br.readLine());
		for (int i = 0; i < input; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			if (apartment[k][n] == 0) {
//				sb.append("시작");
				for (int num1 = 1; num1 <= n; num1++) {
//					sb.append(num1 + "호@@@@\n");
					for (int num2 = 0; num2 <= k; num2++) {

						if (num2 == 0)
							apartment[num2][num1] = num1;
						else {
							apartment[num2][num1] = apartment[num2][num1 - 1] + apartment[num2 - 1][num1];
						}
//						sb.append(num2 + "층 = " + apartment[num2][num1] + "\n");
					}
				}
			}
			sb.append(apartment[k][n] + "\n");
		}
		System.out.println(sb);
	}
}
