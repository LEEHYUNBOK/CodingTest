import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B3003 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // �Ҵ�� ���ۿ� �� �־��ֱ�

		String bfs = br.readLine(); // ���ڿ� (���� ������)

		int[] chess = { 1, 1, 2, 2, 2, 8 };
		String[] myChess = bfs.split(" ");
		int i = 0;
		for (int c : chess)
			bw.write((c - Integer.parseInt(myChess[i++])) + " ");

		bw.flush(); // BufferedWriter�� �����ִ� ������ ��� ���
		bw.close(); // ��Ʈ���� ����
	}

}
