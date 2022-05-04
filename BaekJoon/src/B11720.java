import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11720 {
	// 문제 : 숫자의 합
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		int a = Integer.parseInt(br.readLine());
		String re = br.readLine();
		int sum = 0;
		String[] result = re.split("");
		for (String i : result)
			sum += Integer.parseInt(i);
		sb.append(sum);
		System.out.println(sb);
	}
}
