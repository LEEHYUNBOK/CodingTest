import java.util.ArrayList;

public class BruteForce {
	// ���� Ž��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] people = { "1", "2", "3", "4", "5", "6" };
		result(people);
	}

	private static void result(String[] people) {
		int r = 6;
		boolean[] isChecked = new boolean[people.length];
		String[] result = new String[r];
		ArrayList<String[]> totalList = new ArrayList<String[]>();

		permutation(people, isChecked, result, r, 0, totalList);

		for (String[] strings : totalList) {
			String temp = "";
			for (String text : strings) {
				temp += text;
			}
			System.out.println(temp);
		}
		System.out.println("�� ����� �� : " + totalList.size());
	}

	private static void permutation(String[] people, boolean[] isChecked, String[] result, int endPoint, int dept,
			ArrayList<String[]> totalList) {
		if (endPoint == dept) {
			totalList.add(result.clone());
		} else {
			for (int i = 0; i < people.length; i++) {
				if (!isChecked[i]) {
					isChecked[i] = true; // ���� �迭 ��ġ
					result[dept] = people[i]; // ����
					permutation(people, isChecked, result, endPoint, dept + 1, totalList);
					isChecked[i] = false; // ���� �� �ٽ� ���ڸ�
					result[dept] = ""; // ����� �� ���ڸ�
				}
			}
		}
	}
}
