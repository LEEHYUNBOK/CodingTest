import java.util.Scanner;


class CityNode {
	class Node {
		int number; // ��� �� ����
		Node left; // ���� �ڽ� ��� �ּ� ����
		Node right; // ������ �ڽ� ��� �ּ� ����
		Node top; // �� �ڽ� ��� �ּ� ����
		Node bottom; // �Ʒ� �ڽ� ��� �ּ� ����

		public Node(int number) { // ��忡 ����
			this.number = number;
			left = null; // ���� �ڽ� ��� null�� ����
			right = null; // ������ �ڽ� ��� null�� ����
			top = null; // �� �ڽ� ��� null�� ����
			bottom = null; // �Ʒ� �ڽ� ��� null�� ����
		}

	}
	private int number = 0;

	// ������ node�� ���� �迭�� ����
	Node city[][] = new Node[100][100];

	public int Number() {
		return number;
	}

	public CityNode.Node[][] City() {
		return city;
	}

	public void add(int row, int column) {
		Node newNode = new Node(number++);
		if (city[row][column] == null) {
			// cityä���
			city[row][column] = newNode;
			// ������ ����
			if (city[row][column + 1] != null) {
				city[row][column].right = city[row][column + 1];
				city[row][column + 1].left = city[row][column];
			}
			// ���� ����
			if (city[row][column - 1] != null) {
				city[row][column].left = city[row][column - 1];
				city[row][column - 1].right = city[row][column];
			}
			// �� ����
			if (city[row - 1][column] != null) {
				city[row][column].top = city[row - 1][column];
				city[row - 1][column].bottom = city[row][column];
			}
			// �Ʒ� ����
			if (city[row + 1][column] != null) {
				city[row][column].bottom = city[row + 1][column];
				city[row + 1][column].top = city[row][column];
			}
		} else {
			System.out.println("�̹� ����");
		}
	}

	public Node print(int row, int column) {
		return city[row][column];
	}

	public void bfs(int[] cityRow, int[] cityColumn, int stand) {
		System.out.println("row = " + cityRow[stand] + ", column = " + cityColumn[stand]);
		System.out.println("number = " + number);
		// �� ���̵��� �迭
		int[] length = new int[number];
		length[city[cityRow[stand]][cityColumn[stand]].number] = 0;
		// ���� ä���� ����
		int lengthNum = 0;

		boolean[] visited = new boolean[number];

		// ť
		Node[] queue = new Node[100];
		// ť ��ġ
		int queueCount = 0;

		// ó�� ����
		queue[queueCount++] = city[cityRow[stand]][cityColumn[stand]];
		System.out.println("queue start = " + queue[queueCount - 1].number + " " + queueCount);

		while (queueCount != 0) {

			// ť ó�� ����
			queueCount -= 1;
			Node now = queue[0];
			queue[0] = null;
			for (int i = 0; i < queueCount; i++)
				queue[i] = queue[i + 1];

			// ���� �� ���̸�
			if (visited[now.number])
				continue;
			// �ȵ����� �� ������ �߰�
			visited[now.number] = true;

			// ��

			// ������ ������ ���� ���� �ִ� �������� ����
			if (now.left != null) {
				queue[queueCount++] = now.left;
				if (visited[now.left.number] == false)
					length[now.left.number] = length[now.number] + 1;
			}
			if (now.bottom != null) {
				queue[queueCount++] = now.bottom;
				if (visited[now.bottom.number] == false)
					length[now.bottom.number] = length[now.number] + 1;
			}
			if (now.right != null) {
				queue[queueCount++] = now.right;
				if (visited[now.right.number] == false)
					length[now.right.number] = length[now.number] + 1;
			}
			if (now.top != null) {
				queue[queueCount++] = now.top;
				if (visited[now.top.number] == false)
					length[now.top.number] = length[now.number] + 1;
			}

			System.out.println("num = " + now.number + ", length = " + length[now.number]);
//			lengthNum++;
		}
	}
}

//���� �Լ�
public class IdealCity {

	// �̻����� ���� cityNode
	static CityNode cityN = new CityNode();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("�Է� ����");
		int cityNum = sc.nextInt(); // ���� � ��������

		// ��ġ��
		int cityRow[] = new int[cityNum];
		int cityColumn[] = new int[cityNum];

		/* ������ �࿭ �ּ� �ִ� �ֱ� */
		int rowMax = 0;
		int rowMin = 0;
		int columnMax = 0;
		int columnMin = 0;

		int count = 0;
		while (count < cityNum) { // ���ø� ��� ��������
			int row = sc.nextInt();
			int column = sc.nextInt();
			if (row >= 1 || column >= 1) {

				/* ======================================= */
				if (rowMax == 0 && rowMin == 0 && columnMax == 0 && columnMin == 0) {
					rowMax = row;
					rowMin = row;
					columnMax = column;
					columnMin = column;
				}

				if (rowMax < row)
					rowMax = row;
				else if (rowMin > row)
					rowMin = row;
				if (columnMax < column)
					columnMax = column;
				else if (columnMin > column)
					columnMin = column;
				/* ======================================= */

				// ���� �� ���̰� �Ϸ���
				cityN.add(row, column);
				cityRow[count] = row;
				cityColumn[count] = column;
			} else {
				System.out.println("�ٽ��Է�");
				continue;
			}
			count++;
		}

		for (int i = 0; i < rowMax + 2; i++) {
			System.out.print(i + " ");
			for (int j = 1; j < columnMax + 2; j++) {
				if (i == 0)
					System.out.print(j + " ");
				else {
					if (cityN.print(i, j) == null)
						System.out.print("�� ");
					else {
						System.out.print("�� ");
					}
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("��ü ���� = ");
		cityN.bfs(cityRow, cityColumn, 0);
		System.out.println();
		System.out.print("��ü ���� = ");
		System.out.println(DistanceSum(cityRow, cityColumn, cityNum));

	}


	public static int DistanceSum(int[] cityRow, int[] cityColumn, int cityNum) {
		int sum =0;
		for (int stand = 0; stand < cityNum; stand++) {
			int number = cityN.Number();

			// �� ���̵��� �迭
			int[] length = new int[number];
			length[cityN.print(cityRow[stand], cityColumn[stand]).number] = 0;
			// ���� ä���� ����
			int lengthNum = 0;

			//�湮�� ���� Ȯ���ϱ� ���ؼ� 
			boolean[] visited = new boolean[number];

			// ť
			Integer[] queue = new Integer[100];
			// ť ��ġ
			int queueCount = 0;

			// ó�� ����
			queue[queueCount++] = cityN.print(cityRow[stand], cityColumn[stand]).number;
			
			// �ݺ����� bfs ����
			while (queueCount != 0) {

				// ť ó�� ����
				queueCount -= 1;
				int now = queue[0];
				queue[0] = null;
				for (int i = 0; i < queueCount; i++)
					queue[i] = queue[i + 1];

				// ���� �� ���̸�
				if (visited[cityN.print(cityRow[now], cityColumn[now]).number])
					continue;
				// �ȵ����� �� ������ �߰�
				visited[cityN.print(cityRow[now], cityColumn[now]).number] = true;

				// ��

				// ������ ������ ���� ���� �ִ� �������� ����
				// ������ ������
				if (cityN.print(cityRow[now], cityColumn[now]).left != null) {
					queue[queueCount++] = cityN.print(cityRow[now], cityColumn[now]).left.number;
					// �������� �湮�� ��������
					// ������ ���̴� now���� ���� ���� 1 �߰�
					if (visited[cityN.print(cityRow[now], cityColumn[now]).left.number] == false)
						length[cityN.print(cityRow[now], cityColumn[now]).left.number] = length[cityN
								.print(cityRow[now], cityColumn[now]).number] + 1;
				}
				
				if (cityN.print(cityRow[now], cityColumn[now]).bottom != null) {
					queue[queueCount++] = cityN.print(cityRow[now], cityColumn[now]).bottom.number;
					// �Ʒ��� �湮�� ��������
					// �Ʒ����� ���̴� now���� ���� ���� 1 �߰�
					if (visited[cityN.print(cityRow[now], cityColumn[now]).bottom.number] == false)
						length[cityN.print(cityRow[now], cityColumn[now]).bottom.number] = length[cityN
								.print(cityRow[now], cityColumn[now]).number] + 1;
				}
				if (cityN.print(cityRow[now], cityColumn[now]).right != null) {
					queue[queueCount++] = cityN.print(cityRow[now], cityColumn[now]).right.number;
					// ���������� �湮�� ��������
					// �������� ���̴� now���� ���� ���� 1 �߰�
					if (visited[cityN.print(cityRow[now], cityColumn[now]).right.number] == false)
						length[cityN.print(cityRow[now], cityColumn[now]).right.number] = length[cityN
								.print(cityRow[now], cityColumn[now]).number] + 1;
				}
				if (cityN.print(cityRow[now], cityColumn[now]).top != null) {
					queue[queueCount++] = cityN.print(cityRow[now], cityColumn[now]).top.number;
					// ���� �湮�� ��������
					// ������ ���̴� now���� ���� ���� 1 �߰�
					if (visited[cityN.print(cityRow[now], cityColumn[now]).top.number] == false)
						length[cityN.print(cityRow[now], cityColumn[now]).top.number] = length[cityN.print(cityRow[now],
								cityColumn[now]).number] + 1;
				}
				// ���غ��� ū ��ȣ�� ���ϱ�
				if(cityN.print(cityRow[now], cityColumn[now]).number > stand)
					sum += length[cityN.print(cityRow[now], cityColumn[now]).number];
			}
//			System.out.println(stand+"sum = " + sum);
		}
//		System.out.println("���sum = " + sum);
		return sum;
	}
}
