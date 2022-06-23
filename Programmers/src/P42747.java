public class P42747 {
	// ¹®Á¦ : H-Index
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 9, 9, 9, 12 };
		System.out.println(solution(num));
	}

	public static int solution(int[] citations) {
		int answer = 0;
		sort(citations);
		for (int i : citations)
			System.out.print(i + " ");
		System.out.println();
		for (int i = 0; i < citations.length; i++) {
			if (i >= citations[i]) {
				answer = i;
				break;
			}
		}

		return answer;
	}

	public static void sort(int[] array) {
		int change = 0;
		for (int last = array.length; last > 0; last--) {
			for (int i = 0; i < last - 1; i++) {
				if (array[i] <= array[i + 1]) {
					change = array[i + 1];
					array[i + 1] = array[i];
					array[i] = change;
				}
			}
		}
	}

}
