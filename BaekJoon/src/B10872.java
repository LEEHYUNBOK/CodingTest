import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10872 {
	// ���� : ���丮��
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�
		int input = Integer.parseInt(br.readLine());
		sb.append(pactorial(input));
		System.out.println(sb);
	}

	public static int pactorial(int i) {
		if (i == 0)
			return 1;
		return i * pactorial(i - 1);
	}

}
