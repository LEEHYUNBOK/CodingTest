import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2941 {
	// 문제 : 크로아티아 알파벳
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		String input = br.readLine();
		input = input.replaceAll("c=", "*");
		input = input.replaceAll("c-", "*");
		input = input.replaceAll("dz=", "*");
		input = input.replaceAll("z=", "*");
		input = input.replaceAll("d-", "*");
		input = input.replaceAll("lj", "*");
		input = input.replaceAll("nj", "*");
		input = input.replaceAll("s=", "*");
		sb.append(input.length());

		System.out.println(sb);
	}

}
