import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class P42888 {
	// 문제 : 오픈채팅방

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };
//		String[] t = solution(record);
		System.out.println(Arrays.toString(solution(record)));
	}

	public static String[] solution(String[] record) {
		ArrayList<String[]> print = new ArrayList<>();

		HashMap<String, String> users = new HashMap<>();
		System.out.println(print.size());

		for (String text : record) {
			String[] texts = text.split(" ");

			switch (texts[0]) {
			case "Enter":
				print.add(new String[] { texts[0], texts[1] });
				if (users.containsKey(texts[1]))
					users.replace(texts[1], texts[2]);
				else
					users.put(texts[1], texts[2]);
				break;
			case "Change":
				users.replace(texts[1], texts[2]);
				break;
			case "Leave":
				print.add(new String[] { texts[0], texts[1] });
				break;
			}
		}

		String[] answer = new String[print.size()];
		int i = 0;
		for (String[] k : print) {
			answer[i++] = users.get(k[1]) + (k[0].equals("Enter") ? "님이 들어왔습니다." : "님이 나갔습니다.");
		}

		return answer;
	}

	public String[] solutionMe(String[] record) {

		String[][] print = new String[record.length][record.length];

		ArrayList<String> users = new ArrayList<String>();
		String[] nickName = new String[record.length];

		int count = 0;

		for (int i = 0; i < record.length; i++) {
			String[] text = record[i].split(" ");
			if ("Enter".equals(text[0])) {
				print[i][0] = text[1];
				print[i][1] = "님이 들어왔습니다.";
				if (users.indexOf(text[1]) == -1)
					users.add(text[1]);
				nickName[users.indexOf(text[1])] = text[2];
			} else if ("Leave".equals(text[0])) {
				print[i][0] = text[1];
				print[i][1] = "님이 나갔습니다.";
			} else if ("Change".equals(text[0])) {
				nickName[users.indexOf(text[1])] = text[2];
				continue;
			}
			count++;
		}

		String[] answer = new String[count];
		for (int i = 0; i < count; i++) {
			String t = nickName[users.indexOf(print[i][0])];
			answer[i] = (t.length() < 11 ? t : t.substring(0, 10)) + print[i][1];
		}

		return answer;
	}

}
