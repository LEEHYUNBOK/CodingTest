package programmers_70130;

public class programmers_70130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 5, 2, 2, 2, 2, 2};
		System.out.print("solution = ");
		System.out.println(solution(a));
		int[] b = { 5, 2, 3, 3, 5, 3 };
		System.out.print("solution = ");
		System.out.println(solution(b));
		int[] c = { 0, 3, 3, 0, 7, 2, 0, 2, 2, 0 };
		System.out.print("solution = ");
		System.out.println(solution(c));
		int[] d = { 0 };
		System.out.print("solution = ");
		System.out.println(solution(d));
		int[] e = { 1, 2, 1, 3, 4, 1, 1, 3 };
		System.out.print("solution = ");
		System.out.println(solution(e));

	}

	public static int solution(int[] a) {
		int answer = 0;
		int[] store = new int[2];
		int[] f = new int[a.length];
		store[0] = -1;
		store[1] = -1;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				store[0] = -1;
				store[1] = -1;
				continue;
			}
			if (store[0] != a[i] && store[1] != a[i]) {
				f[a[i]]++;
				if (store[0] != a[i + 1] && store[1] != a[i + 1]) {
					f[a[i + 1]]++;
					store[1] = a[i + 1];
				} else
					store[1] = -1;
				store[0] = a[i];
			} else {
				if (store[0] != a[i + 1] && store[1] != a[i + 1]) {
					f[a[i + 1]]++;
					store[0] = a[i + 1];
				} else
					store[0] = -1;
				store[1] = -1;
			}

		}
		for (int i = 0; i < f.length; i++) {
			answer = Math.max(f[i], answer);
		}
		answer *= 2;
		return answer;
	}

	public static int solution1(int[] a) {
		int answer = 0;

		// 최고값 설정
		int maxNum = 0;
		for (int i = 0; i < a.length; i++) {
			if (maxNum <= a[i])
				maxNum = a[i];
		}

		int maxCountMax = 0;
		int[] maxCount = new int[maxNum + 1];
		boolean[] visited = new boolean[maxNum + 1];

		// a[test]를 기준으로 시작
		for (int test = 0; test < a.length; test++) {
			if (visited[a[test]])
				continue;
			visited[a[test]] = true;
//			System.out.print(a[test]+" ");

			// a[test]를 check에 넣으면서 기준이 된다
			int check = a[test];
			for (int num = 0; num < a.length - 1; num++) {

				// 첫 앞에 두수가 같으면
				if (a[num] == check && a[num + 1] == check)
					continue;
				// check와 서로 다르면
				if (a[num] != check && a[num + 1] != check)
					continue;

				// maxCount[test]에 2개를 더해서 스타 수열 증가
				maxCount[maxCountMax] += 2;
				num++;
			}
			maxCountMax++;
		}

		// answer를 가장 큰 값에 넣기
		for (int i = 0; i < maxCountMax; i++) {
			if (answer < maxCount[i])
				answer = maxCount[i];
		}

//		System.out.println();
		return answer;
	}

}
