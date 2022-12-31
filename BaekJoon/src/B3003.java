import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B3003 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 할당된 버퍼에 값 넣어주기

		String bfs = br.readLine(); // 문자열 (공백 미포함)

		int[] chess = { 1, 1, 2, 2, 2, 8 };
		String[] myChess = bfs.split(" ");
		int i = 0;
		for (int c : chess)
			bw.write((c - Integer.parseInt(myChess[i++])) + " ");

		bw.flush(); // BufferedWriter에 남아있는 데이터 모두 출력
		bw.close(); // 스트림을 닫음
	}

}
