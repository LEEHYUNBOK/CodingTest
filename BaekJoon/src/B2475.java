import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2475 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����

		String bfs = br.readLine(); // ���ڿ� (���� ������)

		String[] num = bfs.split(" ");
		int sum = 0;
		for (String c : num)
			sum += Integer.parseInt(c) * Integer.parseInt(c);

		System.out.println(sum % 10);

	}

}
