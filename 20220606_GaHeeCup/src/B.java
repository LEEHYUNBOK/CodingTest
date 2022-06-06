import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
	// 문제 : B번 - 가희와 카오스 파풀라투스
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기
		String times = br.readLine();
		String[] time = times.split(":");
		int set = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
		String patterns = br.readLine();
		String[] pattern = patterns.split(" ");

		boolean[] patternCompare = new boolean[pattern.length];
		int size = Integer.parseInt(br.readLine());

		for (int i = 0; i < size; i++) {
			String inputs = br.readLine();
			String[] input = inputs.split(" ");
			if (Double.parseDouble(input[0]) >= 60)
				break;
			switch (input[1]) {
			case "^":
				if (0 < set && set < 120)
					patternCompare[0] = true;
				else if (120 < set && set < 240)
					patternCompare[1] = true;
				else if (240 < set && set < 360)
					patternCompare[2] = true;
				else if (360 < set && set < 480)
					patternCompare[3] = true;
				else if (480 < set && set < 600)
					patternCompare[4] = true;
				else
					patternCompare[5] = true;
				for (int j = 0; j < pattern.length; j++) {
					sb.append(patternCompare[j] + " ");
				}
				sb.append("\n");
				break;
			case "10MIN":
				set += 10;
				break;
			case "30MIN":
				set += 30;
				break;
			case "50MIN":
				set += 50;
				break;
			case "2HOUR":
				set += 120;
				break;
			case "4HOUR":
				set += 240;
				break;
			case "9HOUR":
				set += 540;
				break;
			default:
				break;
			}
			if (set >= 720)
				set = set - (set / 720) * 720;
			sb.append(set + "\n");
		}

		int sum = 0;
		for (int i = 0; i < pattern.length; i++) {
			if (patternCompare[i] == false)
				sum += Integer.parseInt(pattern[i]);
		}
		sb.append((sum >= 100) ? 100 : sum);
		System.out.println(sb);
	}
}
