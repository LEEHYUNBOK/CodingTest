import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2941 {
	// ���� : ũ�ξ�Ƽ�� ���ĺ�
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		String input = br.readLine();
		input = input.replaceAll("c=", "*");
		input = input.replaceAll("c-", "*");
		input = input.replaceAll("dz=", "*");
		input = input.replaceAll("z=", "*");
		input = input.replaceAll("d-", "*");
		input = input.replaceAll("lj", "*");
		input = input.replaceAll("nj", "*");
		input = input.replaceAll("s=", "*");
		sb.append(input.length());

		System.out.println(sb);
	}

}
