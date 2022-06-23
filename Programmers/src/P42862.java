public class P42862 {
	// ���� : GymSuit
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k = { 2, 4, 6, 8, 11 };
		int[] i = { 1, 3, 5, 7, 9, 11 };
		System.out.println(solution(11, k, i));
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		boolean[] extra = new boolean[n + 1];
		boolean[] exist = new boolean[n + 1];

		int answer = n - lost.length;

		// ������ �ִ� �л��� extra�� true�� ����.
		for (int i : reserve)
			extra[i] = true;

		// ü������ �Ҿ� ���� �л��� exist�� true�� ����.
		for (int i : lost) {
			exist[i] = true;
			// ���࿡ �Ҿ���� �л��� ������ ü������ ������
			if (extra[i] == true) {
				System.out.println("���� �־���");
				exist[i] = false;
				extra[i] = false;
				answer += 1;
			}
		}
		// ���� ���� �л� ��������
		for (int i = 0; i < extra.length; i++) {
			// -1 ��ȣ �л��� ������ ������ ������
			if (exist[i] == true) {
				if (extra[i - 1] == true) {
					System.out.println((i - 1) + "�� �ֽ��ϴ�.");
					extra[i - 1] = false;
					exist[i] = false;
					answer += 1;
				}
				// +1 ��ȣ �л��� ������ ������ ������
				else if (i + 1 <= n && extra[i + 1] == true) {
					System.out.println((i + 1) + "�� �ֽ��ϴ�.");
					extra[i + 1] = false;
					exist[i] = false;
					answer += 1;
				} else {
					System.out.println("�Ѵ� ����");
					continue;
				}
			}
		}
		return answer;
	}
}
