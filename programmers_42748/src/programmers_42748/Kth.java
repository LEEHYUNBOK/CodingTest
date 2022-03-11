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
		if (p == r) // a�迭�� ũ�Ⱑ 1�� ��� a[p]�� ����
			return a[p];
		int q = partition(a, p, r); // partition�޼ҵ忡�� ������ ���ذ��� q�� ����
		int k = q - p + 1; // k�� a�迭���� k��° ���� ������
		if (i < k) // ���� k�� i���� ũ��
			return select(a, p, q - 1, i); // p~q-1������ �ؼ� �ٽ� ã�´�
		else if (i == k) // ���� ������ q��° ����
			return a[q];
		else // k�� i���� ������
			return select(a, q + 1, r, i - k); // q+1~r������ �ؼ� i-k��° ���� ���� ã��
	}

	public static int partition(int[] a, int min, int max) {
		int compare = a[max]; // �迭 ���κп� �ִ� ���� �������� �Ǵ� compare�� ����
		int pivot = min - 1; /*
								 * min���� max�� �����ϱ� ���� p-1�� pivot�� ����, min���� �ö���鼭 ���� �������� �Ǵ� ����
								 */
		int change; // ��ȯ�� ���� change ����
		for (int j = min; j < max; j++) { // ó���� min���� max ���� �ݺ�
			if (a[j] <= compare) { // j��° ���ڿ��� compare���� ������
				change = a[++pivot]; // ++pivot��° ���� compare���� ���� j��° ���� ��ȯ
				a[pivot] = a[j]; // ���� �������� �Ǳ����� �ϳ��� �÷������
				a[j] = change;
			}
		}
		change = a[pivot + 1]; // compare���� ���� �� ������ ���� ��ȯ
		a[pivot + 1] = a[max];
		a[max] = change;

		return pivot + 1; // ���� �������� �Ǵ� compares+1�� ����
	}
}
