import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9086 {
	// 문제 : 피보나치 수 5
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기
		int size = Integer.parseInt(br.readLine());
		int num1 = 0;
		int num2 = 1;
		if (size == 0)
			sb.append(num1);
		else {
			for (int i = 1; i < size; i++) {
				int num3 = num1 + num2;
				num1 = num2;
				num2 = num3;
			}
			sb.append(num2);
		}
		System.out.println(sb);
	}
}
