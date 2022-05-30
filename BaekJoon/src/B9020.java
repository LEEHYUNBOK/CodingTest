import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9020 {
	// 문제 : 골드바흐의 추측
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		int input = Integer.parseInt(br.readLine());
		boolean[] array = new boolean[10000];
		array[0] = true;
		array[1] = true;

		// 에라토스테네스의 체 알고리즘
		for (int i = 2; i <= Math.sqrt(array.length); i++) {
			if (array[i] == true)
				continue;
			for (int j = i * i; j < (array.length); j += i) {
				array[j] = true;
			}
		}
		// ===================
		for (int t = 0; t < input; t++) {
			int result = Integer.parseInt(br.readLine());
			int first = 0;
			int last = 0;
			int sub = 0;
			for (int i = 2; i <= result / 2; i++) {
				if (array[i] == false && array[result - i] == false) {
					if (sub >= (result - (i * 2)) || sub == 0) {
						first = i;
						last = result - i;
					}
				}
			}
			sb.append(first + " " + last + "\n");
		}
		System.out.println(sb);
	}
}
