
public class Test2 {
	// 문제 : 2 x n 타일링
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 4 }, { 3, 2 }, { 4, 1 } };
		int[][] b = { { 3, 3 }, { 3, 3 } };
		int[][] arr1 = solution(a, b);
		for (int i = 0; i < arr1.length - 1; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
		}
		System.out.println();
//		System.out.println(solution(7));
	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr2[0].length];
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[0].length; j++) {
				int sum = 0;
				for (int row = 0; row < arr2.length; row++) {
					sum += arr1[i][row] * arr2[row][j];
				}
				answer[i][j] = sum;
			}
		}

		return answer;
	}
}
