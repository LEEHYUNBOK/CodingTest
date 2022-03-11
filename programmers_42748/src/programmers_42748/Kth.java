package programmers_42748;

public class Kth {
	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] test = solution(array, commands);
		for (int l : test)
			System.out.print(l + " ");
	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int answerNum = 0;
		for (int[] i : commands) {
			int[] sort = new int[(i[1] - i[0] + 1)];
			int num = 0;
			for (int j = i[0] - 1; j < i[1]; j++)
				sort[num++] = array[j];
			answer[answerNum++] = select(sort, 0, sort.length - 1, i[2]);
		}
		return answer;
	}

	public static int select(int[] a, int p, int r, int i) {
		if (p == r) // a배열의 크기가 1일 경우 a[p]를 리턴
			return a[p];
		int q = partition(a, p, r); // partition메소드에서 나오는 기준값을 q에 저장
		int k = q - p + 1; // k는 a배열에서 k번째 작은 원소임
		if (i < k) // 만약 k가 i보다 크면
			return select(a, p, q - 1, i); // p~q-1까지로 해서 다시 찾는다
		else if (i == k) // 만약 같으면 q번째 리턴
			return a[q];
		else // k가 i보다 작으면
			return select(a, q + 1, r, i - k); // q+1~r까지로 해서 i-k번째 작은 원소 찾기
	}

	public static int partition(int[] a, int min, int max) {
		int compare = a[max]; // 배열 끝부분에 있는 수를 기준점이 되는 compare에 저장
		int pivot = min - 1; /*
								 * min부터 max을 정열하기 위해 p-1를 pivot에 저장, min부터 올라오면서 다음 기준점이 되는 변수
								 */
		int change; // 교환을 위한 change 정의
		for (int j = min; j < max; j++) { // 처음인 min부터 max 까지 반복
			if (a[j] <= compare) { // j번째 문자열이 compare보다 작으면
				change = a[++pivot]; // ++pivot번째 수와 compare보다 작은 j번째 수를 교환
				a[pivot] = a[j]; // 다음 기준점이 되기위해 하나씩 올려줘야함
				a[j] = change;
			}
		}
		change = a[pivot + 1]; // compare번쨰 수와 현 기준점 수를 교환
		a[pivot + 1] = a[max];
		a[max] = change;

		return pivot + 1; // 다음 기준점이 되는 compares+1을 리턴
	}
}
