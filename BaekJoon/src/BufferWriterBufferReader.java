
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BufferWriterBufferReader {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����

		String bfs = br.readLine(); // ���ڿ� (���� ������)
		int bfn = Integer.parseInt(br.readLine()); // ���ڿ��� �Է� ���� ���� ���ڷ� ��ȯ�Ͽ� ���� (���� ������)

		// ������ �������� �Է� ���� �� �ְ� ���ִ� ���
		StringTokenizer st = new StringTokenizer(br.readLine()); // Ex) "1 2"�̶�� �Է��ϸ� ������ �������� 1,2 ���·� ����� (defalt�� "
																	// "�̴�)
		int stx = Integer.parseInt(st.nextToken()); // st.nextToken()�� ����Ѵٸ� st �ȿ� �ִ� ������� ���
		int sty = Integer.parseInt(st.nextToken()); // st.nextToken()�� ����Ѵٸ� st �ȿ� �ִ� ������� ���

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // �Ҵ�� ���ۿ� �� �־��ֱ�

		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

		// StringBuilder�� ���� ��¹� ����
		sb.append(bfs + " " + bfn + "\n");

		// bufferedWriter�� ���� ��¹� ����
		bw.write(stx + " = " + sty);

		System.out.print(sb);// StringBuilder�� �ִ� ������ ��� ���

		System.out.println("============================");

		bw.flush(); // BufferedWriter�� �����ִ� ������ ��� ���
		bw.close(); // ��Ʈ���� ����
	}
}
