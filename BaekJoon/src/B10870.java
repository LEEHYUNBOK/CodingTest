import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10870 {
	// 문제 : 5의 수난
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기
		String inputs = br.readLine();
		String[] input = inputs.split("");
		int sum = 0;
		for (String i : input) {
			sum += Math.pow(Integer.parseInt(i), 5);
		}
		sb.append(sum);
		System.out.println(sb);
	}
}
