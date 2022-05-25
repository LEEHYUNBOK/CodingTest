import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2292 {
	// 문제 : 벌집
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		int input = Integer.parseInt(br.readLine());
		int count = 0;
		int first = 2;
		int last = 7;
		while (true) {
			if (input >= first && input <= last)
				break;
			count++;
			first = (6 * count) + first;
			last = (6 * (count + 1) + last);
			System.out.println("2 = " + first + " " + last);
		}

		if (input == 1)
			count = 1;
		else
			count += 2;
		sb.append(count);
		System.out.println(sb);
	}
}
