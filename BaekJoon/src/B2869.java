import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2869 {
	// 문제 : 달팽이는 올라가고 싶다
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		String input = br.readLine();
		String[] s = input.split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int v = Integer.parseInt(s[2]);
		int result = (v - b) / (a - b);
		if ((v - b) % (a - b) == 0)
			sb.append(result);
		else
			sb.append(result + 1);
		System.out.println(sb);
	}
}
