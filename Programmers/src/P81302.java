public class P81302 {
	// 문제 : 거리두기 확인하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] places = { { "POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP" },
				{ "POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP" }, { "PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX" },
				{ "OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO" }, { "PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP" } };
		int[] a = solution(places);
	}

	public static int[] solution(String[][] places) {
		int[] answer = new int[places.length];
		for (int placesRow = 0; placesRow < places.length; placesRow++) {
			// 이것이 거리두기를 착실히 시행하고 있는지 확인
			int answerNum = 1;

			// 각 places의 대기실
			String[][] place = new String[5][5];

			// 지정된 대기실

			// P의 갯수
			int pPointCount = 0;
			// p의 위치
			int[][] pPoint = new int[25][2];
			for (int row = 0; row < 5; row++) {
				place[row] = places[placesRow][row].split("");
				for (int column = 0; column < 5; column++) {
					if (place[row][column].equals("P")) {
						pPoint[pPointCount][0] = row;
						pPoint[pPointCount++][1] = column;
					}
					System.out.print(place[row][column] + " ");
				}
				System.out.println();
			}
			System.out.println();

			// 강의장에 아무도 없으면
			if (pPointCount == 0 || pPointCount == 1) {
				System.out.println("아무것도 없습니다.");
				answer[placesRow] = answerNum;
				System.out.println("answerNum = " + answer[placesRow]);
				System.out.println();
				continue;
			}
//			for (int row = 0; row < pPointCount; row++) {
//				for (int column = 0; column < 2; column++) {
//					System.out.print(pPoint[row][column] + " ");
//				}
//				System.out.println();
//			}

			for (int stand = 0; stand < pPointCount; stand++) {
				for (int compare = stand + 1; compare < pPointCount; compare++) {

					// stand와 compare의 사이에 있는 것
					// row는 항상 음수가 나온다
					// 이유 : 위에서 아래로 차례대로 검사하기 때문이다.
					int row = pPoint[stand][0] - pPoint[compare][0];

					// column은 compare이 stand의 왼쪽에 있으면 양수
					// compare이 stand의 오른쪽에 있으면 음수
					int column = pPoint[stand][1] - pPoint[compare][1];
					int manhattan = Math.abs(row) + Math.abs(column);

					// 멘허트 길이가 2 이상
					if (manhattan > 2)
						continue;

					// 멘허트 길이가 1 이면
					else if (manhattan == 1) {
						System.out.println(compare + "은" + stand + "과 한칸거리입니다.");
						answerNum = 0;
						break;
					}
					// 멘허트 길이가 2이면
					// 단 . 이것은 row를 순서대로 검사하는 것이기 때문에
					// row 위에 있는 것은 신경 안써도 됨
					else {
						// 만약 사이에 있는 것에 0 이 있드면
						// 같은 row, 왼쪽에 있는 것이면

						if (row == 0 && column > 0) {
							if (place[pPoint[stand][0]][pPoint[stand][1] - 1].equals("O")) {
								System.out.println(compare + "은" + stand + "의 왼쪽에 있습니다 ");
								answerNum = 0;
								break;
							}
						}
						// 왼쪽 아래에 있는 것이면
						else if (row == -1 && column > 0) {
							if (place[pPoint[stand][0]][pPoint[stand][1] - 1].equals("O")
									|| place[pPoint[stand][0] + 1][pPoint[stand][1]].equals("O")) {
								System.out.println(compare + "은" + stand + "의 왼쪽 아래에 있습니다 ");
								answerNum = 0;
								break;
							}
						}
						// 같은 row, 오른쪽에 있는 것이면
						else if (row == 0 && column < 0) {
							if (place[pPoint[stand][0]][pPoint[stand][1] + 1].equals("O")) {
								System.out.println(compare + "은" + stand + "의 오른쪽에 있습니다 ");
								answerNum = 0;
								break;
							}
						}
						// 오른쪽 아래에 있는 것이면
						else if (row == -1 && column < 0) {
							if (place[pPoint[stand][0]][pPoint[stand][1] + 1].equals("O")
									|| place[pPoint[stand][0] + 1][pPoint[stand][1]].equals("O")) {
								System.out.println(compare + "은" + stand + "의 오른쪽 아래에 있습니다 ");
								answerNum = 0;
								break;
							}
						}
						// 그냥 아래에 있는 거면
						else if (column == 0 && row == -2) {
							if (place[pPoint[stand][0] + 1][pPoint[stand][1]].equals("O")) {
								System.out.println(compare + "은" + stand + "의 아래에 있습니다 ");
								answerNum = 0;
								break;
							}
						}
						if (answerNum == 0)
							break;
					}
//				pPoint[stand][1];
					if (answerNum == 0)
						break;
				}
				if (answerNum == 0)
					break;
//				System.out.println(stand + "는 깨끗합니다");
//			System.out.println();
			}
			answer[placesRow] = answerNum;
			System.out.println("answerNum = " + answer[placesRow]);
			System.out.println();
			// answer[t] = asnwerNum;
		}
		return answer;
	}

}
