import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11718 {
	// 문제 : 그대로 출력하기
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기
		String input = "";
		while ((input = br.readLine()) != null) {
			System.out.println(input);
		}

	}
}
