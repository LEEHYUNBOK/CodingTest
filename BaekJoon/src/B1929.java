import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1929 {
	// 문제 : 소수 구하기
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기
		String st = br.readLine();
		String[] result = st.split(" ");
		int first = Integer.parseInt(result[0]);
		int last = Integer.parseInt(result[1]);
		boolean[] array = new boolean[last + 1];
		array[0] = true;
		array[1] = true;

		// 에라토스테네스의 체 알고리즘
		for (int i = 2; i <= Math.sqrt(last + 1); i++) {
			if (array[i] == true)
				continue;
			for (int j = i * i; j < (last + 1); j += i) {
				array[j] = true;
			}
		}
		// ===================

		for (int j = first; j < last + 1; j++) {
			if (array[j] == false)
				sb.append(j + "\n");
		}
		System.out.println(sb);
	}
}
