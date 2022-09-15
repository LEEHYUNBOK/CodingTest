import java.util.Deque;
import java.util.LinkedList;

public class P42583 {
	// 문제 : 다리를 지나는 트럭

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] orders = { 7, 4, 5, 6 };
		System.out.println(solution(2, 10, orders));

		int[] orders1 = { 10 };
		System.out.println(solution(100, 100, orders1));

		int[] orders2 = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		System.out.println(solution(100, 100, orders2));
	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		int sum = 0;
		Deque<Integer> bDeque = new LinkedList<>();

		Deque<Integer> wDeque = new LinkedList<>();
		for (int i : truck_weights)
			wDeque.add(i);

		Deque<Integer> aDeque = new LinkedList<>();
		int bridgeSum = 0;

		boolean crossing = true;
		while (wDeque.size() != 0 && bDeque.size() != 0) {
			System.out.println(aDeque + "    " + bDeque + "    " + wDeque);

			if (bridgeSum + wDeque.peekFirst() <= weight && crossing) {
				bDeque.addLast(wDeque.removeFirst());
				continue;
			}

		}
		System.out.println();

		return answer;
	}

}
