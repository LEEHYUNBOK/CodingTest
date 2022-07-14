import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class B11729 {
	// 문제 : 하노이 탑 이동 순서
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
	static StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

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
