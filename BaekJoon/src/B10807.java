import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10807 {
	// ���� : ���� ����
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�
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
