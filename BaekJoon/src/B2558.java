import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2558 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언

		// TODO Auto-generated method stub
		int bfn1 = Integer.parseInt(br.readLine()); // 문자열로 입력 받은 것을 숫자로 변환하여 저장 (공백 미포함)
		int bfn2 = Integer.parseInt(br.readLine()); // 문자열로 입력 받은 것을 숫자로 변환하여 저장 (공백 미포함)
		System.out.println(bfn1 + bfn2);
	}

}
