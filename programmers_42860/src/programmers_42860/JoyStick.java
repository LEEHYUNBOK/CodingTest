package programmers_42860;

public class JoyStick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("JAN"));

	}

	public static int solution(String name) {
		int answer = 0;
		String[] arr = name.split("(?!^)");
		Integer[] w = new Integer[arr.length];
		boolean[] t = new boolean[arr.length];
		int p = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].compareTo("A") != 0) {
				t[i] = true;
				w[p++] = i;
			}
		}

		int max;

		int stand = 0;
		// compare1은 맨 뒤 자리
		int compare1 = p - 1;
		// compare2는 기준점 오른쪽 자리
		int compare2 = 1;

		int num = 0;
		int sum = 0;
		int count = 0;
		while (num > p) {
			if (t[compare1] == false && t[compare2] == false)
				break;

			// 기준점에서 compare1 의 위치를 뺀 최소값
			int test1 = (Math.abs(w[stand] - w[compare1]) > (p - Math.abs(w[stand] - w[compare1])))
					? (p - Math.abs(w[stand] - w[compare1]))
					: Math.abs(w[stand] - w[compare1]);
			
			// 기준점에서 compare2 의 위치를 뺀 최소값
			int test2 = (Math.abs(w[stand] - w[compare2]) > (p - Math.abs(w[stand] - w[compare2])))
					? (p - Math.abs(w[stand] - w[compare2]))
					: Math.abs(w[stand] - w[compare2]);
			
			// 두 최소값중 더 작은 값이 다음 기준값이 된다.
			if(test1 >= test2) {
				
			}

			break;
		}

//		for (int k = 0; k < arr.length; k++) {
		for (Integer k : w) {
			if (k != null) {
				switch (arr[k]) {
				case "A":
					break;
				case "B":
				case "Z":
					answer += 1;
					break;
				case "C":
				case "Y":
					answer += 2;
					break;
				case "D":
				case "X":
					answer += 3;
					break;
				case "E":
				case "W":
					answer += 4;
					break;
				case "F":
				case "V":
					answer += 5;
					break;
				case "G":
				case "U":
					answer += 6;
					break;
				case "H":
				case "T":
					answer += 7;
					break;
				case "I":
				case "S":
					answer += 8;
					break;
				case "J":
				case "R":
					answer += 9;
					break;
				case "K":
				case "Q":
					answer += 10;
					break;
				case "L":
				case "P":
					answer += 11;
					break;
				case "M":
				case "O":
					answer += 12;
					break;
				case "N":
					answer += 13;
					break;
				}
			} else
				break;

			System.out.println(k + " " + answer);
		}

		System.out.println();
		return answer;
	}

}
