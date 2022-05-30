import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11653 {
	// 문제 : 소인수분해
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기
		int input = Integer.parseInt(br.readLine());
		int k = 2;
		if (input != 1) {
			while (true) {
				if (input % k == 0) {
					sb.append(k + "\n");
					input = input / k;
					continue;
				}
				if (input <= k)
					break;
				k++;
			}
		}
		System.out.println(sb);
	}
}
