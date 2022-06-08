import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5597 {
	// 문제 : 과제 안 내신 분..?
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기
		boolean[] array = new boolean[30];
		for (int i = 0; i < 28; i++) {
			int size = Integer.parseInt(br.readLine());
			array[size - 1] = true;
		}
		for (int i = 0; i < 30; i++) {
			if (array[i] == false)
				sb.append((i + 1) + "\n");
		}
		System.out.println(sb);
	}
}
