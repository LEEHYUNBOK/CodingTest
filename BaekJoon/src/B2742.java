import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2742 {
	// 문제 : 기찍 N
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		int n = Integer.parseInt(bf.readLine()); // I

		for (int i = n; i >= 1; sb.append(i-- + "\n"))
			;
		System.out.println(sb);
	}
}
