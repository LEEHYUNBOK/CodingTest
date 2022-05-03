import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15552 {
	// 문제 : 합
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder bw = new StringBuilder(); // 할당된 버퍼에 값 넣어주기
		// 띄어쓰기 가능하게 해주는 애
		StringTokenizer st = null;

		int n = Integer.parseInt(bf.readLine()); // I

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(bf.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			bw.append(x + y + "\n");
		}
//		bw.flush(); // 남아있는 데이터를 모두 출력시킴
//		bw.close(); // 스트림을 닫음
		System.out.println(bw);
	}
}
