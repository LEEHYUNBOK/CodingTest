public class P60057 {
	// 문제 : 문자열 압축

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("aabbaccc"));
		System.out.println(solution("ababcdcdababcdcd"));
		System.out.println(solution("abcabcdede"));
		System.out.println(solution("abcabcabcabcdededededede"));
		System.out.println(solution("xababcdcdababcdcd"));
	}

	public static int solution(String s) {
		if (s.length() == 1)
			return 1;
		int answer = s.length();
		StringBuilder sb = null;

		for (int len = 1; len <= s.length() / 2; len++) {
			sb = new StringBuilder();

			for (int i = 0; i < s.length(); i++) {
				int n = 1;

				if (i + len >= s.length()) {
					sb.append(s.subSequence(i, s.length()));
					break;
				}

				String st = s.substring(i, i + len);

				int idx = i + len;

				while (idx + len <= s.length()) {
					if (s.substring(idx, idx + len).equals(st)) {
						n++;
						idx += len;
					} else
						break;
				}

				if (n != 1) {
					sb.append(n);
					i += (len * n) - 1;
				} else {
					i += len - 1;
				}
				sb.append(st);
			}
			answer = Math.min(sb.length(), answer);
		}
		return answer;
	}
}
