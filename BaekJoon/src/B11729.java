import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class B11729 {
	// ���� : �ϳ��� ž �̵� ����
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
	static StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�

	static LinkedList[] list = new LinkedList[3];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int inputs = Integer.parseInt(br.readLine());
		for (int i = 0; i < 3; i++) {
			if (list[i] == null) {
				list[i] = new LinkedList<Integer>();
			}
		}
		for (int i = 1; i < inputs + 1; i++) {
			list[0].add(i);
		}
		sb.append(list[0]);
//		hanoi(inputs, 0);
		System.out.println(sb);
	}

	public static void hanoi(int index, int count) {

//		hanoi()
	}
}
