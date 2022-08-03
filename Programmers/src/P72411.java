import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class P72411 {
	// 문제 : 메뉴 리뉴얼

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] orders = { "ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH" };
		int[] course = { 2, 3, 4 };
		System.out.println(Arrays.toString(solution(orders, course)));
		String[] orders1 = { "ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD" };
		int[] course1 = { 2, 3, 5 };
		System.out.println(Arrays.toString(solution(orders1, course1)));
		String[] orders2 = { "XYZ", "XWY", "WXA" };
		int[] course2 = { 2, 3, 4 };
		System.out.println(Arrays.toString(solution(orders2, course2)));
	}

	static HashMap<String, Integer> map = new HashMap<>();

	public static String[] solution(String[] orders, int[] course) {
		String[] answer = {};

		for (int i = 0; i < orders.length; i++) {
			String[] order = orders[i].split("");
			Arrays.sort(order);

			for (int j = 0; j < order.length - 1; j++) {

				for (int k = 0; k < course.length; k++) {
					dfs(order, j, 1, course[k], order[j]);
				}

			}

		}

		List<String> list = new ArrayList<>(map.keySet());
		Collections.sort(list, new Comparator<String>() {

			public int compare(String o1, String o2) {
				return map.get(o2) - map.get(o1);
			}
		});

		List<String> result = new ArrayList<>();
		for (int i = 0; i < course.length; i++) {
			int max = 0;

			for (String courseMenu : list) {
				if (map.get(courseMenu) > 1 && courseMenu.length() == course[i]) {
					if (map.get(courseMenu) >= max) {
						result.add(courseMenu);
						max = map.get(courseMenu);
					}
				}

			}

		}

		Collections.sort(result);

		answer = new String[result.size()];
		result.toArray(answer);

		return answer;
	}

	static void dfs(String[] order, int idx, int depth, int courseLen, String menu) {
		if (depth == courseLen) {
			map.put(menu, map.getOrDefault(menu, 0) + 1);
		}

		for (int i = idx + 1; i < order.length; i++) {
			dfs(order, i, depth + 1, courseLen, menu + order[i]);
		}

	}

}
