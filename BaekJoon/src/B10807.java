import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10807 {
	// 문제 : 개수 세기
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기
		int size = Integer.parseInt(br.readLine());
		String arrayIn = br.readLine();
		String[] array = arrayIn.split(" ");
		int compare = Integer.parseInt(br.readLine());
		int sum = 0;
		for (String i : array) {
			if (Integer.parseInt(i) == compare)
				sum++;
		}
		sb.append(sum);
		System.out.println(sb);
	}
}
