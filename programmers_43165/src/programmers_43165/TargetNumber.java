package programmers_43165;

public class TargetNumber {

	public static int answer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers1 = { 1, 1, 1, 1, 1 };
		int target = 3;
		System.out.println("test1 = " + solution(numbers1, target));
		int[] numbers2 = { 4, 1, 2, 1 };
		target = 3;
		System.out.println("test1 = " + solution(numbers2, target));
	}

	public static int solution(int[] numbers, int target) {
		dfs(numbers, target, 0, 0);
		return answer;
	}

	public static void dfs(int[] numbers, int target, int sum, int idx) {
		if (idx == numbers.length) {
			if (sum == target) {
				answer += 1;
			}
			return;
		}

		dfs(numbers, target, sum + numbers[idx], idx + 1);
		dfs(numbers, target, sum - numbers[idx], idx + 1);
	}

}
