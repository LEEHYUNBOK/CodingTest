import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {
	// 문제 : A번 - 가희와 방어율 무시
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		StringTokenizer st = new StringTokenizer(br.readLine());
		int defense = Integer.parseInt(st.nextToken());
		int defenseIgnore = Integer.parseInt(st.nextToken());
		if ((defense - ((double) defense * defenseIgnore / 100)) >= 100)
			sb.append(0);
		else
			sb.append(1);

		System.out.println(sb);
	}
}
