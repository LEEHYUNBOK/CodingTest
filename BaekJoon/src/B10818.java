import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10818 {
	// 문제 : 최소, 최대
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		int n = Integer.parseInt(br.readLine());
//		StringTokenizer st = new StringTokenizer(br.readLine());
		String t = br.readLine();
		String[] k = t.split(" ");
		int max = Integer.parseInt(k[0]);
		int min = Integer.parseInt(k[0]);
		for (String i : k) {
			if (Integer.parseInt(i) > max)
				max = Integer.parseInt(i);
			if (Integer.parseInt(i) < min)
				min = Integer.parseInt(i);
		}
		sb.append(min + " " + max);
		System.out.println(sb);
	}
}
