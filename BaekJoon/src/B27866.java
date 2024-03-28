import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B27866 {
    // 문제 : 문자와 문자열
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		String str = br.readLine(); // 문자열 (공백 미포함)
        int index = Integer.parseInt(br.readLine());
        sb.append(str.charAt(index-1));
		System.out.print(sb);// StringBuilder에 있는 데이터 모두 출력
	}
}
