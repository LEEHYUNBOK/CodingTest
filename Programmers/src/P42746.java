import java.util.Arrays;

public class P42746 {
	// 문제 : K번째 수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 6, 10, 2 };
		System.out.println(solution(num));
	}

	public static String solution(int[] numbers) {
		String answer = "";
		String[] num = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(String.valueOf(numbers[i]) + " ");
			num[i] = String.valueOf(numbers[i]);
		}
		System.out.println();
		Arrays.sort(num, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
		for (String i : num) {
			System.out.print(i + " ");
			answer = answer + i;
		}
		if (answer.charAt(0) == '0')
			answer = "0";
		return answer;
	}
}