/* 
  ���� : ACM Craft
  https://www.acmicpc.net/problem/1005
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Building {
	class Node {
		int time; // ��� �� ����
		int num;
		Node next; // ���� ��� �ּ� ����

		public Node(int time, int num) { // ��忡 ����
			this.num = num;
			this.time = time;
			next = null; // ���� ��� null�� ����
		}
	}

	Node[][] build;

	int count = 1;

	// �ǹ��� ������ num x num ũ��� 2�߹迭 ����
	public void buildingN(int num) {
		build = new Node[num][num];
	}

	public void add(int time) {
		Node newNode = new Node(time, count);
		build[count][count] = newNode;
		count++;
	}

	public void link(int start, int end) {
		build[start][end] = build[end][end];
	}

	public int time(int num) {
		return build[num][num].time;
	}

	public Node exist(int stand, int compare) {
		return build[stand][compare];
	}

	public void Print() {
		for (int i = 1; i < count; i++) {
			for (int j = 1; j < count; j++) {
				if (build[i][j] == null)
					System.out.print("�� ");
				else
					System.out.print(build[i][j].num + " ");
			}
			System.out.println();
		}
	}

}

public class B1005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

//		System.out.println("�Է� ����");
		int testCaseT = sc.nextInt(); // �׽�Ʈ���̽��� ���� T
		for (int testCase = 0; testCase < testCaseT; testCase++) {
			Building building = new Building();
//			System.out.print("�ǹ� ����");
			int buildingN = sc.nextInt(); // �ǹ��� ���� N

//			System.out.print("��Ģ ����");
			int ruleK = sc.nextInt();// �ǹ����� �Ǽ����� ��Ģ�� �� ���� K

			// ���� �ǹ��� ������ building �迭�� +1�ؼ� �ִ´� �־��ش�.
			// +1 �ϴ� ������ ��Ģ �߰��� 1��° ���� �����ϹǷ� ���Ǹ� ���� �־���.
			building.buildingN(buildingN + 1);
			// ���������� ������ � �ִ��� Ȯ���� �ִ� �迭 order
			int[] order = new int[buildingN + 1];

//			System.out.print("�ǹ� �ð�");
			// �켱 ������ �ð��� �־�鼭 Node �߰��� �ش�
			for (int i = 0; i < buildingN; i++) {
				int time = sc.nextInt(); // �ð��� �Է� �޾� ������� �־��ش�.
				building.add(time);
			}

//			System.out.print("��Ģ��");
			for (int i = 0; i < ruleK; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				// �������������� 1�� �߰��ϱ�
				order[end] += 1;
				building.link(start, end);
			}
//			System.out.print("��ǥ");
			// �Ǽ��ؾ��� �ǹ��� ��ȣ
			int targetW = sc.nextInt();

//			for (int i = 1; i < buildingN + 1; i++) {
//				System.out.print(order[i] + " ");
//			}
			// �ǹ� �ð� ���

//			System.out.println();
//			System.out.println();
//			building.Print();
//			System.out.println();
			System.out.println(minTime(building, targetW, order));

		}

	}

	public static int minTime(Building building, int targetW, int[] order) {

		// ���������� ������ ���� �ǹ��� ������ �����ϱ� ���� Queue������ ���� queue ����
		Queue<Integer> queue = new LinkedList<Integer>();

		// �ǹ��� ������ ���� �ɸ��� �ð��� �����ϱ� ���� �迭
		int[] targetTime = new int[order.length];
		// queue�� ������ ���� ������ ���� �ǹ����� �ֱ�
		// �׷��� ������������ ���鼭 ��ð��� �ɸ����� �� �� ����
		for (int i = 0; i < order.length; i++) {
			if (order[i] == 0)
				queue.add(i);
		}

		// queue�� ũ�Ⱑ 0�� �ƴҶ� ���� �ݺ�
		// ��� �ǹ��� �� ������ ������ �ݺ��Ѵ�.
		while (queue.size() != 0) {
			// ���� ������ �ǹ��� ������ stand
			int stand = queue.poll();
			// stand�� ����Ű�� �ǹ��� ã�´�.
			for (int i = 1; i < order.length; i++) {
				// stand�� i�� ������ continue
				if (stand == i)
					continue;
				// ���࿡ ����Ű�� ���� ������
				if (building.exist(stand, i) != null) {
//					System.out.println(stand + ", " + i + " = ����");
					// ����Ų �ǹ� i�� ���������� Ƚ���� �ϳ� ���δ�.
					order[i] -= 1;
					// �ǹ� i������ �ð��� stand�κ��� �������� ����� �ð����� ���ٸ�
					// stand�κ��� ���� ����� �ð��� ������ i�� �������Ƿ�
					// i������ �ɸ��� �ð��� �� ū ������ �ִ´�.
					targetTime[i] = (targetTime[i]) < (building.exist(stand, stand).time + targetTime[stand])
							? (building.exist(stand, stand).time + targetTime[stand])
							: targetTime[i];
//					System.out.println("targetTime[" + i + "] = " + targetTime[i]);
					// ���࿡ ���������� ���� ������ queue�� �ִ´�.
					if (order[i] == 0)
						queue.add(i);
				}
			}
		}

		// ������ ���� ����� �ؾ��Ҷ� W���� �������� �ð��� W�� �������� �ð��� ���ؼ� return�Ѵ�.
		return targetTime[targetW] + building.exist(targetW, targetW).time;
	}

}
