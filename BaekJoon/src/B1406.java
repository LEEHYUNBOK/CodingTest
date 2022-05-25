import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class ENode {
	class Node {
		String spelling; // 노드 값 저장
		Node left;
		Node right;

		public Node(String spelling) { // 노드에 저장
			this.spelling = spelling;
			left = null;
			right = null;
		}
	}

	Node root = new Node(null);
	Node current = root;

	public void add(String spelling) {
		String[] role = new String[spelling.length()];
		role = spelling.split("");
		for (String a : role) {
			Node newNode = new Node(a);
			current.right = newNode;
			newNode.left = current;
			current = current.right;
		}
	}

	public void L() {
		if (current.left == null)
			return;
		current = current.left;
	}

	public void D() {
		if (current.right == null)
			return;
		current = current.right;
	}

	public void B() {
		if (current.spelling == null)
			return;
		if (current.right == null) {
			current.left.right = null;
			current = current.left;
			return;
		}
		current.left.right = current.right;
		current.right.left = current.left;
		current = current.left;
	}

	public void P(String spell) {
		Node newNode = new Node(spell);
		if (current.right == null) {
			current.right = newNode;
			newNode.left = current;
			current = current.right;
		} else {
			current.right.left = newNode;
			newNode.right = current.right;
			current.right = newNode;
			newNode.left = current;
			current = newNode;
		}
	}

	String result = "";

	// 출력을 위한 함수
	public String t() {
		print(root.right);
		return result;
	}

	public void print(Node k) {
		if (k == null)
			return;
		result = result.concat(k.spelling);
		print(k.right);
	}
}

public class B1406 {
	// 문제 : 에디터
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String spelling = sc.next(); // String

		ENode eNode = new ENode();
		eNode.add(spelling);
		int num = sc.nextInt(); // Int
		for (int i = 0; i < num; i++) {
			String role = sc.next(); // String
			switch (role) {
			case "L":
				eNode.L();
				break;
			case "D":
				eNode.D();
				break;
			case "B":
				eNode.B();
				break;
			case "P":
				String spell = sc.next(); // String
				eNode.P(spell);
				break;
			}
		}
		bw.write(eNode.t());
		bw.close(); // 스트림을 닫음
	}

}
