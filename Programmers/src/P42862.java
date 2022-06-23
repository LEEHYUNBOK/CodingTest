public class P42862 {
	// 문제 : GymSuit
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

		// 여분이 있는 학생은 extra에 true가 들어간다.
		for (int i : reserve)
			extra[i] = true;

		// 체육복을 잃어 버린 학생은 exist에 true가 들어간다.
		for (int i : lost) {
			exist[i] = true;
			// 만약에 잃어버린 학생이 여분의 체육복이 있으면
			if (extra[i] == true) {
				System.out.println("여분 있었음");
				exist[i] = false;
				extra[i] = false;
				answer += 1;
			}
		}
		// 먼저 없는 학생 기준으로
		for (int i = 0; i < extra.length; i++) {
			// -1 번호 학생이 여분을 가지고 있으면
			if (exist[i] == true) {
				if (extra[i - 1] == true) {
					System.out.println((i - 1) + "이 있습니다.");
					extra[i - 1] = false;
					exist[i] = false;
					answer += 1;
				}
				// +1 번호 학생이 여분을 가지고 있으면
				else if (i + 1 <= n && extra[i + 1] == true) {
					System.out.println((i + 1) + "이 있습니다.");
					extra[i + 1] = false;
					exist[i] = false;
					answer += 1;
				} else {
					System.out.println("둘다 없음");
					continue;
				}
			}
		}
		return answer;
	}
}
