public class P42883 {
	// 문제 : 큰 수 만들기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("1477252841", 4));
	}

	public static String solution(String number, int k) {
		StringBuilder num = new StringBuilder(number);
		int kNum = k;

		for (int i = 0; i < k; i++) {
			int start = 0;
			for (int j = start; j < num.length() - 1; j++) {
				if (num.charAt(j) < num.charAt(j + 1)) {
					kNum--;
					start = j - 1;
//                	System.out.println(num.charAt(j)+"삭제");
					num.deleteCharAt(j);
					break;
				}
			}
		}

		if (kNum > 0) {
			for (int j = 0; j < kNum; j++) {
				num.deleteCharAt(num.length() - 1);
			}
		}
		return num.toString();
	}

}
