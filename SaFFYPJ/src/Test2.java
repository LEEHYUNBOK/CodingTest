import java.util.Scanner;

public class Test2 {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for (int i = 0; i < testCase; i++) {

			int k = sc.nextInt();
			boolean[][] result = new boolean[k + 1][k + 1];
			for (int j = 0; j < k; j++) {
				String te = sc.next();
				String[] in = te.split(" ");
				for (String u : in) {
					result[j][Integer.parseInt(u)] = true;
				}
			}
		}
	}
}
