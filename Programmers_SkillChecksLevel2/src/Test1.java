import java.util.LinkedList;

public class Test1 {
	// 문제 : 캐시
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cities = { "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA" };
		System.out.println(solution(3, cities));
		System.out.println();
		String[] cities1 = { "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul" };
		System.out.println(solution(3, cities1));
	}

	public static int solution(int cacheSize, String[] cities) {
		LinkedList<String> test = new LinkedList<String>();
		int answer = 0;
		if (cacheSize == 0)
			return 5 * cities.length;

		for (int i = 0; i < cities.length; i++) {

			String compare = cities[i];

			boolean exist = false;
			for (int listIndex = 0; listIndex < test.size(); listIndex++) {
				if (test.get(listIndex).compareToIgnoreCase(compare) == 0) {
					answer += 1;
					exist = true;
					test.remove(listIndex);
					test.add(0, compare);
					break;
				}
			}
			if (exist == true)
				continue;
			if (test.size() >= cacheSize) {
				test.removeLast();
			}
			answer += 5;
			test.add(0, compare);
		}
		return answer;
	}
}
