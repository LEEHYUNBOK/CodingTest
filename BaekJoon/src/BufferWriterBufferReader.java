
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferWriterBufferReader {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // ����
		String s = bf.readLine(); // String
		int i = Integer.parseInt(bf.readLine()); // I
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // �Ҵ�� ���ۿ� �� �־��ֱ�
		String t = "abcdefg"; // ����� ���ڿ�
		bw.write(s + "\n" + t + "\n" + i); // ���ۿ� �ִ� �� ���� ���
		System.out.println("============================");
		bw.flush(); // �����ִ� �����͸� ��� ��½�Ŵ
		bw.close(); // ��Ʈ���� ����
	}
}
