import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B17478 {
	// ���� : ����Լ��� ������?
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
	static StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int inputs = Integer.parseInt(br.readLine());
		sb.append("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n");
		recursion(inputs, "");
		System.out.println(sb);
	}

	public static void recursion(int index, String t) {
		sb.append(t + "\"����Լ��� ������?\"\n");
		if (index == 0) {
			sb.append(t + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n");
			sb.append(t + "��� �亯�Ͽ���.\n");
			return;
		}
		sb.append(t + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n");
		sb.append(t + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n");
		sb.append(t + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"\n");
		if (index != 0)
			recursion(index - 1, t + "____");
		sb.append(t + "��� �亯�Ͽ���.\n");
	}
}
