
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BufferWriterBufferReader {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언

		String bfs = br.readLine(); // 문자열 (공백 미포함)
		int bfn = Integer.parseInt(br.readLine()); // 문자열로 입력 받은 것을 숫자로 변환하여 저장 (공백 미포함)

		// 공백을 기준으로 입력 받을 수 있게 해주는 모듈
		StringTokenizer st = new StringTokenizer(br.readLine()); // Ex) "1 2"이라고 입력하면 공백을 기준으로 1,2 형태로 저장됨 (defalt가 "
																	// "이다)
		int stx = Integer.parseInt(st.nextToken()); // st.nextToken()을 출력한다면 st 안에 있는 순서대로 출력
		int sty = Integer.parseInt(st.nextToken()); // st.nextToken()을 출력한다면 st 안에 있는 순서대로 출력

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 할당된 버퍼에 값 넣어주기

		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		// StringBuilder에 대한 출력문 저장
		sb.append(bfs + " " + bfn + "\n");

		// bufferedWriter에 대한 출력문 저장
		bw.write(stx + " = " + sty);

		System.out.print(sb);// StringBuilder에 있는 데이터 모두 출력

		System.out.println("============================");

		bw.flush(); // BufferedWriter에 남아있는 데이터 모두 출력
		bw.close(); // 스트림을 닫음
	}
}
