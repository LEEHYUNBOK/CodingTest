//import java.util.ArrayList;

public class P1835 {
	// 문제 : 단체사진 찍기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] t = { "N~F=0", "R~T>2" };
		System.out.println(solution(2, t));
		String[] k = { "M~C<2", "C~M>1" };
		System.out.println(solution(2, k));
	}

	static int answer;

	static boolean[] visited = new boolean[8];
	static String[] people = { "A", "C", "F", "J", "M", "N", "R", "T" };

//	static ArrayList<String> totalList = new ArrayList<String>();

	public static int solution(int n, String[] data) {
		answer = 0;
		dfs("", data);
//		for (String d : totalList) 
//			System.out.println(d);

		return answer;
	}

	public static void dfs(String word, String[] data) {
		if (word.length() == people.length) {
//			totalList.add(word);
//			answer += 1;
			boolean exit = false;
			for (String d : data) {
				exit = compare(word, d);
				if (!exit)
					break;
			}
//			System.out.println(word + " " + exit);
			if (exit)
				answer += 1;
		} else {
			for (int i = 0; i < people.length; i++) {
				if (!visited[i]) {
					visited[i] = true;
					String words = word + people[i];
					dfs(words, data);
					visited[i] = false;
				}
			}
		}
	}

	public static boolean compare(String finishedWord, String data) {
		String[] datas = data.split("");
		int distance = Integer.parseInt(datas[4]);
		int interval = Math.abs(finishedWord.indexOf(datas[0]) - finishedWord.indexOf(datas[2])) - 1;
		boolean result = false;
		switch (datas[3]) {
		case "=":
			result = interval == distance;
			break;
		case ">":
			result = interval > distance;
			break;
		case "<":
			result = interval < distance;
			break;
		}
		return result;
	}
}
