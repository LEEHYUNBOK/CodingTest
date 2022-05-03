import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2562 {
	// 문제 : 최댓값
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		String result = Integer.toString(a * b * c);
		int[] count = new int[10];
		String[] re = result.split("");
		for (String i : re) {
			count[Integer.parseInt(i)]++;
		}
		for (int i : count)
			sb.append(i + "\n");
		System.out.println(sb);
	}
}
