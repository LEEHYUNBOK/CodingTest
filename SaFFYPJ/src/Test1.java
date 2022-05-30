import java.util.Scanner;

public class Test1 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for (int i = 0; i < testCase; i++) {
			int b = sc.nextInt();
			int[] result = new int[b];
			for (int j = 0; j < b; j++) {
				int t = sc.nextInt();
				result[j] = t;
			}
			int round = 0;
			boolean test = false;
			while (true) {
				for (int two = 0; two + 1 < b; two += 2) {
					if (result[two] > result[two + 1]) {
						int compare = result[two];
						result[two] = result[two + 1];
						result[two + 1] = compare;

						test = true;
					}
				}
				for (int three = 1; three + 1 < b; three += 2) {
					if (result[three] > result[three + 1]) {
						int compare = result[three];
						result[three] = result[three + 1];
						result[three + 1] = compare;
						test = true;
					}
				}
				if (test == false)
					break;
				test = false;
				round++;
			}
			System.out.println(round);
		}
	}
}
