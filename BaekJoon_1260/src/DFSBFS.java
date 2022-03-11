import java.io.*;
import java.util.*;

class DBNode {
	class Node {
		int num; // 노드 값 저장
		Node next;

		public Node(int num) { // 노드에 저장
			this.num = num;
			next = null;
		}
	}

	Node root[];

	public void create(int num) {
		root = new Node[num + 1];
	}

	public void role(int stand, int next) {
		Node standN = new Node(next);
		Node nextN = new Node(stand);

		if (root[stand] == null)
			root[stand] = new Node(next);
		else {
			Node compare = root[stand];
			while (compare != null) {
				if(compare.num == next)
					break;
				if (root[stand].num > standN.num) {
					standN.next = root[stand];
					root[stand] = standN;
					break;
				} else if (compare.next != null) {
					if (compare.num < standN.num && compare.next.num > standN.num) {
						standN.next = compare.next;
						compare.next = standN;
						break;
					}
				} else if (compare.next == null) {
					compare.next = standN;
					break;
				}
				compare = compare.next;
			}
		}

		if (root[next] == null)
			root[next] = new Node(stand);
		else {
			Node compare = root[next];
			while (compare != null) {
				if(compare.num == stand)
					break;
				if (root[next].num > nextN.num) {
					nextN.next = root[next];
					root[next] = nextN;
					break;
				} else if (compare.next != null) {
					if (compare.num < nextN.num && compare.next.num > nextN.num) {
						nextN.next = compare.next;
						compare.next = nextN;
						break;
					}
				} else if (compare.next == null) {
					compare.next = nextN;
					break;
				}
				compare = compare.next;
			}
		}
		// 양방향 이므로 stand기준으로 넣어주고
		// next기준으로 넣어준다.

	}

	public void printing() {
		print(root[1]);
	}

	public void print(Node a) {
		if (a == null)
			return;
		System.out.print(a.num + " ");
		print(a.next);
	}

	public void bfs(int start) {
		boolean[] visited = new boolean[root.length];
		Node queue = new Node(start);
		String result = "";
		Node last = queue;

		int queueCount = 1;
		while (queueCount != 0) {
			queueCount--;
			Node stand = root[queue.num];
			int queueNum = queue.num;
			queue = queue.next;
			if (visited[queueNum])
				continue;
			visited[queueNum] = true;
			System.out.print(queueNum+" ");
//			result = result.concat(Integer.toString(queueNum) + " ");
			while (true) {
				if (stand == null)
					break;
				Node newNode = new Node(stand.num);
				if (queue == null) {
					queue = newNode;
					last = queue;
					stand = stand.next;
					queueCount++;
					continue;
				}
				last.next = newNode;
				last = last.next;
				stand = stand.next;
				queueCount++;
			}
		}
	}

	public void dfs(int start) {

		boolean[] visited = new boolean[root.length];

		String result = "";

		Node stack = new Node(start);
		int stackCount = 1;

		while (stackCount != 0) {
			stackCount--;
			Node stand = root[stack.num];
			Node last = stand;
			int stackNum = stack.num;
			stack = stack.next;
			if (visited[stackNum]) 
				continue;
			visited[stackNum] = true;
			System.out.print(stackNum+" ");
//			result = result.concat(Integer.toString(stackNum) + " ");
			while (true) {
				stackCount++;
				if (last.next == null)
					break;
				last = last.next;
			}
			last.next = stack;
			stack = stand;
		}
	}

}

public class DFSBFS {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		DBNode dbNode = new DBNode();
		// 정점 수
		int num = Integer.parseInt(st.nextToken());
		dbNode.create(num);
		// 규칙 수
		int roleNum = Integer.parseInt(st.nextToken());
		// 시작 정점
		int startNum = Integer.parseInt(st.nextToken());

		for (int i = 0; i < roleNum; i++) {
			st = new StringTokenizer(br.readLine());
			int stand = Integer.parseInt(st.nextToken());
			int next = Integer.parseInt(st.nextToken());
			dbNode.role(stand, next);
		}
//		dbNode.printing();
//		bw.write(dbNode.dfs(startNum) + "\n");
//		bw.write(dbNode.bfs(startNum));
		dbNode.dfs(startNum);
		System.out.println();
		dbNode.bfs(startNum);
//		bw.close(); // 스트림을 닫음

	}

}
