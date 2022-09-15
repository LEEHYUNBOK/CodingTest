import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class P76502 {
	// 문제 : 괄호 회전하기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("[](){}"));

		System.out.println(solution("}]()[{"));

		System.out.println(solution("[)(]"));

		System.out.println(solution("}}}"));

		System.out.println(solution("()("));

		System.out.println(solution("("));

		System.out.println(solution("{{{{{{"));
	}

	public static int solution(String s) {

		int answer = 0;
		ArrayList<String> revolvingDoor = new ArrayList<String>(Arrays.asList(s.split("")));

		int c = 0;
		while (c != s.length()) {
			boolean check = true;
			Stack<String> stack = new Stack<>();
			for (String i : revolvingDoor) {

//				System.out.print(i);
				if (i.equals("[") || i.equals("(") || i.equals("{")) {
					stack.add(i);
					continue;
				}

				if (stack.size() == 0) {
					check = false;
					break;
				}

				String compare = stack.pop();
				switch (i) {
				case "]":
					if (!(compare.equals("[")))
						check = false;
					break;
				case ")":
					if (!compare.equals("("))
						check = false;
					break;
				case "}":
					if (!compare.equals("{"))
						check = false;
					break;
				}

			}
			revolvingDoor.add(revolvingDoor.size() - 1, revolvingDoor.remove(0));
			c++;

			if (!check || stack.size() != 0)
				continue;
			answer++;
		}

		return answer;
	}
}
