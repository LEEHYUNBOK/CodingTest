public class P1844 {
	// 문제 : 괄호 회전하기

	static int x;
	static int y;

	static int total;

	static boolean arrive;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maps = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 },
				{ 0, 0, 0, 0, 1 } };
		System.out.println(solution(maps));
		int[][] maps1 = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 1 } };
		System.out.println(solution(maps1));
	}

	public static int solution(int[][] maps) {
		total = 1;
		x = maps.length;
		y = maps[0].length;
		arrive = false;
		boolean[][] visit = new boolean[x][y];
		int answer = 0;
		dfs(0, 0, total, maps, visit);
		if (arrive == false)
			total = -1;
		return total;
	}

	public static void dfs(int i, int j, int sum, int[][] maps, boolean[][] visit) {

		if (i == x - 1 && j == y - 1) {
			if (total == 1 || total > sum)
				total = sum;
			arrive = true;
			return;
		}
		if (i < 0 || i >= x || j < 0 || j >= y || visit[i][j] == true || maps[i][j] == 0)
			return;
		if (maps[i][j] == 1) {
			visit[i][j] = true;
			dfs(i + 1, j + 0, sum + 1, maps, visit);
			dfs(i + 0, j - 1, sum + 1, maps, visit);
			dfs(i - 1, j + 0, sum + 1, maps, visit);
			dfs(i + 0, j + 1, sum + 1, maps, visit);
			visit[i][j] = false;
		}
	}
}
