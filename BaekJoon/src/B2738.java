import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2738 {
	// 문제 : 행렬 덧셈
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기
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
