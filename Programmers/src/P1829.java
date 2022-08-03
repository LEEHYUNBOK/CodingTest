import java.util.Arrays;

public class P1829 {
	// 문제 : 오픈채팅방

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] record = { { 1, 1, 1, 0 }, { 1, 2, 2, 0 }, { 1, 0, 0, 1 }, { 0, 0, 0, 1 }, { 0, 0, 0, 3 },
				{ 0, 0, 0, 3 } };
//			String[] t = solution(record);
		System.out.println(Arrays.toString(solution(6, 4, record)));
	}

	static int width;
	static int height;
	static boolean[][] visit;
	static int count;

	public static int[] solution(int m, int n, int[][] picture) {
		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;
		width = m;
		height = n;
		visit = new boolean[m][n];
		int[] answer = new int[2];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (visit[i][j] != true && picture[i][j] != 0) {
					count = 0;
					numberOfArea++;
					numberDFS(i, j, picture[i][j], picture);
					if (maxSizeOfOneArea <= count)
						maxSizeOfOneArea = count;
				}
			}
		}
		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
		return answer;
	}

	public static void numberDFS(int i, int j, int check, int[][] picture) {
		if (i < 0 || i >= width || j < 0 || j >= height || visit[i][j] == true || check != picture[i][j] || check == 0)
			return;
		count++;
		visit[i][j] = true;
		numberDFS(i + 0, j - 1, check, picture);
		numberDFS(i + 0, j + 1, check, picture);
		numberDFS(i - 1, j + 0, check, picture);
		numberDFS(i + 1, j + 0, check, picture);
	}
}
