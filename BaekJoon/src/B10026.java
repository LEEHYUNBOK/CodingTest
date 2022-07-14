import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10026 {
	// 문제 : 적록색약
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
	static StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

	static int input = 0;

	static char[][] normal;
	static char[][] colorWeakness;

	static boolean[][] normalVisit;
	static boolean[][] colorWeaknessVisit;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		input = Integer.parseInt(br.readLine());

		colorWeakness = new char[input][input];
		normal = new char[input][input];

		for (int i = 0; i < input; i++) {

			String s = br.readLine();
			for (int j = 0; j < input; j++) {
				normal[i][j] = s.charAt(j);
				if (s.charAt(j) == 'G')
					colorWeakness[i][j] = 'R';
				else
					colorWeakness[i][j] = s.charAt(j);

			}
		}

		normalVisit = new boolean[input][input];
		colorWeaknessVisit = new boolean[input][input];

		int noramlCount = 0;
		int colorWeaknessCount = 0;

		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				if (normalVisit[i][j] != true) {
					noramlCount++;
					normalDFS(i, j, normal[i][j]);
				}

				if (colorWeaknessVisit[i][j] != true) {
					colorWeaknessCount++;
					colorWeaknessDFS(i, j, colorWeakness[i][j]);

				}
			}
		}
		sb.append(noramlCount + " " + colorWeaknessCount);
		System.out.println(sb);
	}

	public static void normalDFS(int i, int j, char check) {

		if (i < 0 || i >= input || j < 0 || j >= input || normalVisit[i][j] == true)
			return;
		if ((check == 'R' && normal[i][j] == 'R') || (check == 'G' && normal[i][j] == 'G')
				|| (check == 'B' && normal[i][j] == 'B')) {
			normalVisit[i][j] = true;
			normalDFS(i + 0, j - 1, check);
			normalDFS(i + 0, j + 1, check);
			normalDFS(i - 1, j + 0, check);
			normalDFS(i + 1, j + 0, check);
		}
	}

	public static void colorWeaknessDFS(int i, int j, char check) {

		if (i < 0 || i >= input || j < 0 || j >= input || colorWeaknessVisit[i][j] == true)
			return;
		if ((check == 'R' && colorWeakness[i][j] == 'R') || (check == 'B' && colorWeakness[i][j] == 'B')) {
			colorWeaknessVisit[i][j] = true;
			colorWeaknessDFS(i + 0, j - 1, check);
			colorWeaknessDFS(i + 0, j + 1, check);
			colorWeaknessDFS(i - 1, j + 0, check);
			colorWeaknessDFS(i + 1, j + 0, check);
		}
	}
}
