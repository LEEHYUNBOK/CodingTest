
class Queue {
	class Node {
		int num;
		Node next;

		Node(int num) {
			this.num = num;
			next = null;
		}
	}

	public int size = 0;
	Node root = null;
	Node first = root;
	public Node last = null;

	public void add(int num) {
		Node newNode = new Node(num);
		if (root == null) {
			root = newNode;
			first = root;
			last = root;
		}

		else if (root.next == null) {
			root.next = newNode;
			last = root.next;
		} else {
			last.next = newNode;
			last = last.next;
		}
		size++;
	}

	public int poll() {
		int num = root.num;
		root = root.next;
		first = root;
		size--;
		return num;
	}

	public void printing() {
		print(root);
	}

	public void print(Node root) {
		if (root != null)
			System.out.print(root.num + " ");
		else
			return;
		print(root.next);
	}
}

public class P42586 {
	// 문제 : 기능개발
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] progresses = { 20, 99, 98, 97 };
		int[] speeds = { 30, 1, 1, 1 };
		int[] i = solution(progresses, speeds);
		System.out.println();
		for (int k : i)
			System.out.print(k + ", ");
		System.out.println();
		int[] progresses1 = { 20, 99, 93, 30, 55, 10 };
		int[] speeds1 = { 5, 10, 1, 1, 30, 5 };
		int[] i1 = solution(progresses1, speeds1);
		System.out.println();
		for (int k : i1)
			System.out.print(k + ", ");
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		Queue time = new Queue();
		int size = 0;
		int com = 0;
		for (int i = 0; i < speeds.length; i++) {
			int num = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
			if (time.last != null && time.last.num >= num)
				num = time.last.num;
			else
				size++;
			time.add(num);
		}

		time.printing();
		int[] answer = new int[size];
		size = 0;
		int compare = time.poll();
		answer[size] += 1;
		for (int i = 1; i < speeds.length; i++) {
			int num = time.poll();
			if (num > compare) {
				compare = num;
				size++;
			}
			answer[size] += 1;
//			if(num[] != )
		}
		return answer;
	}

}
