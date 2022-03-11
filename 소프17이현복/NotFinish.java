package programmers_42576;

import java.util.ArrayList;
import java.util.Arrays;

public class NotFinish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		String[] participant1 = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion1 = { "josipa", "filipa", "marina", "nikola" };
		String[] participant2 = { "mislav", "stanko", "mislav", "ana" };
		String[] completion2 = { "stanko", "ana", "mislav" };
		System.out.println(solution(participant, completion));
		System.out.println(solution(participant1, completion1));
		System.out.println(solution(participant2, completion2));

	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < participant.length; i++) {
			if (i == completion.length || participant[i].compareTo(completion[i]) != 0) {
				answer = participant[i];
				break;
			}
		}

		return answer;
	}

}
