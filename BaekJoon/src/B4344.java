import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4344 {
	// 문제 : 평균은 넘겠지
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

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
