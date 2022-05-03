import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1065 {
	// 문제 : 한수
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		int a = Integer.parseInt(br.readLine());

		int count = 0;
		if (a < 99)
			count = a;
		else {
			count = 99;
			for (int i = 100; i <= a; i++) {
				int units = i % 10;
				int tens = (i % 100) / 10;
				int hundreds = (i % 1000) / 100;
				int thousands = (i / 1000);
				if (units - tens == tens - hundreds) {
					if (thousands > 0) {
						if (units - tens == tens - hundreds && tens - hundreds == hundreds - thousands)
							count++;
					} else
						count++;
				}
			}
		}
		sb.append(count);
		System.out.println(sb);
	}

}
