import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {
	// ���� : A�� - ����� ����� ����
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		StringTokenizer st = new StringTokenizer(br.readLine());
		int defense = Integer.parseInt(st.nextToken());
		int defenseIgnore = Integer.parseInt(st.nextToken());
		if ((defense - ((double) defense * defenseIgnore / 100)) >= 100)
			sb.append(0);
		else
			sb.append(1);

		System.out.println(sb);
	}
}