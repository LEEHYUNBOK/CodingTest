import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class KeyNode {
	class Node {
		String password; // ��� �� ����
		Node left;
		Node right;

		public Node(String password) { // ��忡 ����
			this.password = password;
			left = null;
			right = null;
		}
	}

	Node root = new Node(null);
	Node current = root;

	public void result(String password) {
		String[] role = new String[password.length()];
		role = password.split("");

		for (String a : role) {
			Node newNode = new Node(a);

			if (current.password == null && (a.equals("<") || a.equals(">") || a.equals("-"))) {
				continue;
			}

			// ���� ȭ��ǥ�̸�
			if (a.equals("<")) {
				if (current.left == null)
					continue;
				current = current.left;
				continue;
			}

			// ������ ȭ��ǥ�̸�
			else if (a.equals(">")) {
				if (current.right == null)
					continue;
				current = current.right;
				continue;
			}

			// �齺���̽���
			else if (a.equals("-")) {
				Node del = current.left;
				if (current.right == null) {
					current.left.right = null;
					current = del;
					continue;
				}
				current.left.right = current.right;
				current.right.left = current.left;
				current = del;
				continue;
			}
			// ȭ��ǥ�� �齺���̽��� �ƴ϶� ���� �ƹ��ų� ������
			else {
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
				continue;
			}
		}
	}

	String result = "";

	// ����� ���� �Լ�
	public String t() {
		print(root.right);
		return result;
	}

	public void print(Node k) {
		if (k == null)
			return;
		result = result.concat(k.password);
		print(k.right);
	}
}

public class B5397 {
	// ���� : Ű�ΰ�
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		for(int i = 0; i < num; i++) {
//			KeyNode key = new KeyNode();
//			String password = sc.next();
//			key.result(password);
//			key.t();
//			System.out.println();
//		}

//		KeyNode[] key = new KeyNode[num];
//		
//		for(int i = 0; i < num; i++) {
//			key[i] = new KeyNode();
//			String password = sc.next();
//			key[i].result(password);
//		}
//		for(KeyNode i : key) {
//			i.t();
//			System.out.println();
//		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine()); // Int

		for (int i = 0; i < num; i++) {
			KeyNode key = new KeyNode();
			String password = bf.readLine(); // String
			key.result(password);
			bw.write(key.t() + "\n");
		}
		bw.close(); // ��Ʈ���� ����
	}

}
