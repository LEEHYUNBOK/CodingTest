import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2475 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언

		String bfs = br.readLine(); // 문자열 (공백 미포함)

		String[] num = bfs.split(" ");
		int sum = 0;
		for (String c : num)
			sum += Integer.parseInt(c) * Integer.parseInt(c);

		System.out.println(sum % 10);

	}

}
