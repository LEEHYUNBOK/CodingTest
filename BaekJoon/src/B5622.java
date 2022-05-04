import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5622 {
	// 문제 : 다이얼
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		String input = br.readLine();
		String[] s = input.split("");
		int sum = 0;
		for (String i : s) {
			switch (i) {
			case "A":
			case "B":
			case "C":
				sum += 3;
				break;

			case "D":
			case "E":
			case "F":
				sum += 4;
				break;

			case "G":
			case "H":
			case "I":
				sum += 5;
				break;

			case "J":
			case "K":
			case "L":
				sum += 6;
				break;

			case "M":
			case "N":
			case "O":
				sum += 7;
				break;

			case "P":
			case "Q":
			case "R":
			case "S":
				sum += 8;
				break;

			case "T":
			case "U":
			case "V":
				sum += 9;
				break;

			case "W":
			case "X":
			case "Y":
			case "Z":
				sum += 10;
				break;
			}
		}
		sb.append(sum);
		System.out.println(sb);
	}
}
