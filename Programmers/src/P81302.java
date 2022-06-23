public class P81302 {
	// ���� : �Ÿ��α� Ȯ���ϱ�
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
			// �̰��� �Ÿ��α⸦ ������ �����ϰ� �ִ��� Ȯ��
			int answerNum = 1;

			// �� places�� ����
			String[][] place = new String[5][5];

			// ������ ����

			// P�� ����
			int pPointCount = 0;
			// p�� ��ġ
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

			// �����忡 �ƹ��� ������
			if (pPointCount == 0 || pPointCount == 1) {
				System.out.println("�ƹ��͵� �����ϴ�.");
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

					// stand�� compare�� ���̿� �ִ� ��
					// row�� �׻� ������ ���´�
					// ���� : ������ �Ʒ��� ���ʴ�� �˻��ϱ� �����̴�.
					int row = pPoint[stand][0] - pPoint[compare][0];

					// column�� compare�� stand�� ���ʿ� ������ ���
					// compare�� stand�� �����ʿ� ������ ����
					int column = pPoint[stand][1] - pPoint[compare][1];
					int manhattan = Math.abs(row) + Math.abs(column);

					// ����Ʈ ���̰� 2 �̻�
					if (manhattan > 2)
						continue;

					// ����Ʈ ���̰� 1 �̸�
					else if (manhattan == 1) {
						System.out.println(compare + "��" + stand + "�� ��ĭ�Ÿ��Դϴ�.");
						answerNum = 0;
						break;
					}
					// ����Ʈ ���̰� 2�̸�
					// �� . �̰��� row�� ������� �˻��ϴ� ���̱� ������
					// row ���� �ִ� ���� �Ű� �Ƚᵵ ��
					else {
						// ���� ���̿� �ִ� �Ϳ� 0 �� �ֵ��
						// ���� row, ���ʿ� �ִ� ���̸�

						if (row == 0 && column > 0) {
							if (place[pPoint[stand][0]][pPoint[stand][1] - 1].equals("O")) {
								System.out.println(compare + "��" + stand + "�� ���ʿ� �ֽ��ϴ� ");
								answerNum = 0;
								break;
							}
						}
						// ���� �Ʒ��� �ִ� ���̸�
						else if (row == -1 && column > 0) {
							if (place[pPoint[stand][0]][pPoint[stand][1] - 1].equals("O")
									|| place[pPoint[stand][0] + 1][pPoint[stand][1]].equals("O")) {
								System.out.println(compare + "��" + stand + "�� ���� �Ʒ��� �ֽ��ϴ� ");
								answerNum = 0;
								break;
							}
						}
						// ���� row, �����ʿ� �ִ� ���̸�
						else if (row == 0 && column < 0) {
							if (place[pPoint[stand][0]][pPoint[stand][1] + 1].equals("O")) {
								System.out.println(compare + "��" + stand + "�� �����ʿ� �ֽ��ϴ� ");
								answerNum = 0;
								break;
							}
						}
						// ������ �Ʒ��� �ִ� ���̸�
						else if (row == -1 && column < 0) {
							if (place[pPoint[stand][0]][pPoint[stand][1] + 1].equals("O")
									|| place[pPoint[stand][0] + 1][pPoint[stand][1]].equals("O")) {
								System.out.println(compare + "��" + stand + "�� ������ �Ʒ��� �ֽ��ϴ� ");
								answerNum = 0;
								break;
							}
						}
						// �׳� �Ʒ��� �ִ� �Ÿ�
						else if (column == 0 && row == -2) {
							if (place[pPoint[stand][0] + 1][pPoint[stand][1]].equals("O")) {
								System.out.println(compare + "��" + stand + "�� �Ʒ��� �ֽ��ϴ� ");
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
//				System.out.println(stand + "�� �����մϴ�");
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
