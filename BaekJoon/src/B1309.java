import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1309 {
	// ���� : ������
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
	static StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int input = Integer.parseInt(br.readLine());
		int[] zoo = new int[input + 1];

		zoo[0] = 1;
		zoo[1] = 3;
		for (int i = 2; i <= input; i++)
			zoo[i] = (zoo[i - 1] * 2 + zoo[i - 2]) % 9901;

		sb.append(zoo[input]);

		System.out.println(sb);
	}

}
