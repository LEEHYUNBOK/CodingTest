import java.util.Scanner;

class Stack {

	Integer[] stack;

	public void Stack(int size) {
		stack = new Integer[size];
	}

	int size = 0;

	public void push(int num) {
		stack[size++] = num;
	}

	public Integer poll() {
		if (size == 0)
			return null;
		int num = stack[--size];
		stack[size] = null;
		return num;
	}

	public Integer print() {
		if (size == 0)
			return null;
		return stack[size - 1];
	}
}

public class B23253 {
	// 문제 : 자료구조는 정말 최고야
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("책 수");
		int bookCount = sc.nextInt();
		System.out.println("책 더미 수");
		int bookPiles = sc.nextInt();

		// 더미 배열
		Stack[] heapCount = new Stack[bookPiles];

		// 더미 갯수
		for (int heap = 0; heap < bookPiles; heap++) {
			System.out.println("한 더미의 책 개수");
			// 한 더미에 책이 몇개 들어가는지
			int count = sc.nextInt();
			heapCount[heap] = new Stack();
			heapCount[heap].Stack(count);
			// 한 더미에 들어가 책 번호
			for (int number = 0; number < count; number++) {
//				System.out.print("번호 = ");
				int book = sc.nextInt();
				if (book > bookCount)
					continue;
				heapCount[heap].push(book);
			}
		}
		// 더미 번째
		int thNum = 0;
		// 다음 번호
		Integer num = 1;
		// 더미 도는 횟수
		int max = 1;
		while (true) {
			// 계속 더미 찾다가 마지막 더미를 조사하면
			if (thNum == bookPiles)
				thNum = 0;

			// 만약 max가 더미 수와 같으면
			// 만약 전부 돌았는데 없으면
			if (max > bookPiles) {
				System.out.println("No");
				break;
			}
			System.out.println(thNum + "번째" + " , " + max + "회전");
			// 번호가 다음 번호랑 같으면
			if (num == heapCount[thNum].print()) {
//				System.out.println("찾았다");				
//				heapCount[thNum].poll();
				System.out.println("번호" + heapCount[thNum].poll());
				if (num == bookCount) {
					System.out.println("Yes");
					break;
				}
				max = 1;
				thNum++;
				num++;
			} else {
				thNum++;
				max++;
			}

		}

	}

}
