import java.util.ArrayList;
import java.util.Arrays;

public class P77485 {
	// 문제 : 행렬 테두리 회전하기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] queries = { { 2, 2, 5, 4 }, { 3, 3, 6, 6 }, { 5, 1, 6, 3 } };
		System.out.println(Arrays.toString(solution(6, 6, queries)));

		int[][] queries1 = { { 1, 1, 2, 2 }, { 1, 2, 2, 3 }, { 2, 1, 3, 2 }, { 2, 2, 3, 3 } };

//		int[][] queries1 = { { 1, 1, 3, 3 } };
		System.out.println(Arrays.toString(solution(3, 3, queries1)));

		int[][] queries2 = { { 1, 1, 100, 97 } };
		System.out.println(Arrays.toString(solution(100, 97, queries2)));
	}

	public static int[] solution(int rows, int columns, int[][] queries) {

		int[][] numpad = new int[rows + 1][columns + 1];

		for (int i = 1; i < rows + 1; i++) {
			for (int j = 1; j < columns + 1; j++)
				numpad[i][j] = (i - 1) * columns + j;
		}

		ArrayList<Integer> answer = new ArrayList<Integer>();

		for (int[] query : queries) {
			int row = query[0];
			int column = query[1];

			int startValue = numpad[query[0]][query[1]];
			int min = startValue;
			int change = 1;
			ArrayList<Integer> nums = new ArrayList<Integer>();
			while (true) {
				if (min > numpad[row][column])
					min = numpad[row][column];
				nums.add(numpad[row][column]);
//				System.out.print(numpad[row][column] + " ");
				if ((row == query[0] && column == query[3]) || (row == query[2] && column == query[3])
						|| (row == query[2] && column == query[1]))
					change++;

				if (change == 1)
					column++;
				else if (change == 2)
					row++;
				else if (change == 3)
					column--;
				else if (change == 4)
					row--;
				if (row == query[0] && column == query[1])
					break;
			}
			nums.add(0, nums.remove(nums.size() - 1));

//			for (int num : nums)
//				System.out.print(num + " ");

			change = 1;
			while (true) {
				numpad[row][column] = nums.remove(0);

				if ((row == query[0] && column == query[3]) || (row == query[2] && column == query[3])
						|| (row == query[2] && column == query[1]))
					change++;

				if (change == 1)
					column++;
				else if (change == 2)
					row++;
				else if (change == 3)
					column--;
				else if (change == 4)
					row--;
				if (row == query[0] && column == query[1])
					break;
			}

			answer.add(min);
		}
//		참조 : https://velog.io/@jwkim/java-arraylist-array-type-conversion
		int[] k = answer.stream().mapToInt(Integer::intValue).toArray();
		return k;
	}

}
