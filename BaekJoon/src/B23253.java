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
	// ���� : �ڷᱸ���� ���� �ְ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("å ��");
		int bookCount = sc.nextInt();
		System.out.println("å ���� ��");
		int bookPiles = sc.nextInt();

		// ���� �迭
		Stack[] heapCount = new Stack[bookPiles];

		// ���� ����
		for (int heap = 0; heap < bookPiles; heap++) {
			System.out.println("�� ������ å ����");
			// �� ���̿� å�� � ������
			int count = sc.nextInt();
			heapCount[heap] = new Stack();
			heapCount[heap].Stack(count);
			// �� ���̿� �� å ��ȣ
			for (int number = 0; number < count; number++) {
//				System.out.print("��ȣ = ");
				int book = sc.nextInt();
				if (book > bookCount)
					continue;
				heapCount[heap].push(book);
			}
		}
		// ���� ��°
		int thNum = 0;
		// ���� ��ȣ
		Integer num = 1;
		// ���� ���� Ƚ��
		int max = 1;
		while (true) {
			// ��� ���� ã�ٰ� ������ ���̸� �����ϸ�
			if (thNum == bookPiles)
				thNum = 0;

			// ���� max�� ���� ���� ������
			// ���� ���� ���Ҵµ� ������
			if (max > bookPiles) {
				System.out.println("No");
				break;
			}
			System.out.println(thNum + "��°" + " , " + max + "ȸ��");
			// ��ȣ�� ���� ��ȣ�� ������
			if (num == heapCount[thNum].print()) {
//				System.out.println("ã�Ҵ�");				
//				heapCount[thNum].poll();
				System.out.println("��ȣ" + heapCount[thNum].poll());
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
