package programmers_64061;

public class Programmers_64061 {
	public static void main(String[] args) {
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("======================");
		System.out.println();
		System.out.println("결과 = " + solution(board, moves));
	}

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;

		int num = 0;
		int[] bucket = new int[100];
		for (int i = 0; i < moves.length; i++) {
			System.out.println("moves = " + moves[i]);
			for (int b = 0; b < board[0].length; b++) {
				if (board[b][moves[i] - 1] != 0) {
					bucket[num] = board[b][moves[i] - 1];
					board[b][moves[i] - 1] = 0;
					if (num >= 1 && bucket[num] == bucket[num - 1]) {
						answer += 2;
						System.out.println("삭제");
						for (int k = 0; k <= num; k++) {
							System.out.print(bucket[k] + " ");
						}
						bucket[num] = 0;
						bucket[num - 1] = 0;
						num--;
					} else
						num++;
					System.out.println("num = " + num);
					break;
				}

			}
			System.out.print("bucket = ");
			for (int k = 0; k <= num; k++) {
				System.out.print(bucket[k] + " ");
			}
			System.out.println();
		}
		return answer;
	}
}
