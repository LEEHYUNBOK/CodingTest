import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10872 {
	// 문제 : 팩토리얼
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기
		int input = Integer.parseInt(br.readLine());
		sb.append(pactorial(input));
		System.out.println(sb);
	}

	public static int pactorial(int i) {
		if (i == 0)
			return 1;
		return i * pactorial(i - 1);
	}

}
