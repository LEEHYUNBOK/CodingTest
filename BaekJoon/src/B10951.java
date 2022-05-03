import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10951 {
	// 문제 : A+B - 4
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		String st = "";

		while ((st = br.readLine()) != null) {
			String[] t = st.split(" ");
			System.out.println(Integer.parseInt(t[0]) + Integer.parseInt(t[1]));

		}
	}
}
