import java.util.LinkedList;

public class test1 {
	// ¹®Á¦ : GPS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2 }, { 1, 3 }, { 2, 3 }, { 2, 4 }, { 3, 4 }, { 3, 5 }, { 4, 6 }, { 5, 6 }, { 5, 7 },
				{ 6, 7 } };
		int[] b = { 1, 1, 1, 1, 1, 1, 7 };
		System.out.println(solution(7, 10, a, 7, b));

		int[][] a1 = { { 1, 2 }, { 1, 3 }, { 2, 3 }, { 2, 4 }, { 3, 4 }, { 3, 5 }, { 4, 6 }, { 5, 6 }, { 5, 7 },
				{ 6, 7 } };
		int[] b1 = { 1, 2, 4, 6, 5, 7 };

//		System.out.println(solution(7, 10, a1, 6, b1));

		int[][] a2 = { { 1, 2 }, { 1, 3 }, { 2, 3 }, { 2, 4 }, { 4, 5 } };
		int[] b2 = { 1, 2, 3, 3, 4, 5 };

//		System.out.println(solution(5, 5, a2, 6, b2));
	}

	public static int solution(int n, int m, int[][] edge_list, int k, int[] gps_log) {
		int answer = 0;
		boolean[][] map = new boolean[n + 1][n + 1];
		for (int i = 1; i < map.length; i++) {
			map[i][i] = true;
		}
		for (int i = 0; i < edge_list.length; i++) {
			map[edge_list[i][0]][edge_list[i][1]] = true;
			map[edge_list[i][1]][edge_list[i][0]] = true;
		}

		LinkedList<Integer> gps = new LinkedList<Integer>();

		gps.add(gps_log[0]);
		boolean back = false;
		for (int i = 1; i < gps_log.length; i++) {
			System.out.println("i = " + i);
			for (int index = 0; index < gps.size(); index++) {
				System.out.print(gps.get(index) + " ");
			}
			System.out.println();

			if (map[gps_log[i - 1]][gps_log[i]] == true && back == false) {
				gps.add(gps_log[i]);
				continue;
			} else {
				boolean t = false;
				for (int check = 1; check < map.length; check++) {
					if (map[gps_log[i - 1]][check] == true && map[check][gps_log[i + 1]] == true) {
						System.out.println("check = " + check);
						gps_log[i] = check;
						answer++;
						gps.add(check);
						t = true;
						back = false;
						break;
					}
				}
				if (t == false) {
					back = true;
					gps.removeLast();
					i -= 2;
				}
			}
		}

		for (int index = 0; index < gps.size(); index++) {
			System.out.print(gps.get(index) + " ");
		}
		System.out.println();
		return answer;
	}
}
