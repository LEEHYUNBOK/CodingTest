package programmers_42840;

public class MockExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer1 = { 1, 2, 3, 4, 5 };
		int[] k1 = solution(answer1);
		for (int i = 0; i < k1.length; i++)
			System.out.print(k1[i] + " ");
		System.out.println();
		System.out.println();

		int[] answer2 = { 1, 3, 2, 4, 2 };
		int[] k2 = solution(answer2);
		for (int i = 0; i < k2.length; i++)
			System.out.print(k2[i] + " ");
		System.out.println();
		System.out.println();

		int[] answer3 = { 1, 1, 2, 1, 3, 2, 4 };
		int[] k3 = solution(answer3);
		for (int i = 0; i < k3.length; i++)
			System.out.print(k3[i] + " ");
		System.out.println();
	}

	public static int[] solution(int[] answers) {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = {  2, 1, 2, 3, 2, 4, 2, 5 };
		int c[] = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int[] count = { 0, 0, 0 };
		int aLength = 0;
		int bLength = 0;
		int cLength = 0;
		for (int i = 0; i < answers.length; i++) {
			if(aLength >= a.length)
				aLength=0;
			if(bLength >= b.length)
				bLength=0;
			if(cLength >= c.length)
				cLength=0;
			if (a[aLength++] == answers[i])
				count[0]++;
			if (b[bLength++] == answers[i])
				count[1]++;
			if (c[cLength++] == answers[i])
				count[2]++;
		}

		int max = 0;
		for (int i = 0; i < count.length; i++) {
			if (max < count[i])
				max = count[i];
		}
		int orderCount = 0;
		for (int i = 0; i < count.length; i++) {
			if(max == count[i]) 
				orderCount++;
		}
		int[] order = new int[orderCount];
		System.out.println("orderCount = "+ orderCount);
		int num =0;
		for(int i = 0; i < count.length; i++) {
			if(max == count[i])
				order[num++] = i+1;
		}
			
		return order;
	}
}
