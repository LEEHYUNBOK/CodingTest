import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1712 {
	// ���� : ���ͺб���
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		String input = br.readLine();
		String[] t = input.split(" ");
		int count = 0;
		if ((Integer.parseInt(t[2]) - Integer.parseInt(t[1])) <= 0)
			count = -1;
		else
			count = (Integer.parseInt(t[0]) / (Integer.parseInt(t[2]) - Integer.parseInt(t[1]))) + 1;
		sb.append(count);
		System.out.println(sb);
	}

}