import java.util.Scanner;


class CityNode {
	class Node {
		int number; // 노드 값 저장
		Node left; // 왼쪽 자식 노드 주소 선언
		Node right; // 오른쪽 자식 노드 주소 선언
		Node top; // 위 자식 노드 주소 선언
		Node bottom; // 아래 자식 노드 주소 선언

		public Node(int number) { // 노드에 저장
			this.number = number;
			left = null; // 왼쪽 자식 노드 null로 저장
			right = null; // 오른쪽 자식 노드 null로 저장
			top = null; // 위 자식 노드 null로 저장
			bottom = null; // 아래 자식 노드 null로 저장
		}

	}
	private int number = 0;

	// 도시의 node를 이중 배열로 삽입
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
			// city채우기
			city[row][column] = newNode;
			// 오른쪽 삽입
			if (city[row][column + 1] != null) {
				city[row][column].right = city[row][column + 1];
				city[row][column + 1].left = city[row][column];
			}
			// 왼쪽 삽입
			if (city[row][column - 1] != null) {
				city[row][column].left = city[row][column - 1];
				city[row][column - 1].right = city[row][column];
			}
			// 위 삽입
			if (city[row - 1][column] != null) {
				city[row][column].top = city[row - 1][column];
				city[row - 1][column].bottom = city[row][column];
			}
			// 아래 삽입
			if (city[row + 1][column] != null) {
				city[row][column].bottom = city[row + 1][column];
				city[row + 1][column].top = city[row][column];
			}
		} else {
			System.out.println("이미 있음");
		}
	}

	public Node print(int row, int column) {
		return city[row][column];
	}

	public void bfs(int[] cityRow, int[] cityColumn, int stand) {
		System.out.println("row = " + cityRow[stand] + ", column = " + cityColumn[stand]);
		System.out.println("number = " + number);
		// 각 길이들의 배열
		int[] length = new int[number];
		length[city[cityRow[stand]][cityColumn[stand]].number] = 0;
		// 길이 채워줄 변수
		int lengthNum = 0;

		boolean[] visited = new boolean[number];

		// 큐
		Node[] queue = new Node[100];
		// 큐 위치
		int queueCount = 0;

		// 처음 삽입
		queue[queueCount++] = city[cityRow[stand]][cityColumn[stand]];
		System.out.println("queue start = " + queue[queueCount - 1].number + " " + queueCount);

		while (queueCount != 0) {

			// 큐 처음 삭제
			queueCount -= 1;
			Node now = queue[0];
			queue[0] = null;
			for (int i = 0; i < queueCount; i++)
				queue[i] = queue[i + 1];

			// 만약 들어간 곳이면
			if (visited[now.number])
				continue;
			// 안들어갔으면 들어간 것으로 추가
			visited[now.number] = true;

			// 츌룍

			// 지정된 곳에서 부터 지금 있는 곳까지의 길이
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

//메인 함수
public class IdealCity {

	// 이상적인 도시 cityNode
	static CityNode cityN = new CityNode();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("입력 숫자");
		int cityNum = sc.nextInt(); // 도시 몇개 넣을건지

		// 위치들
		int cityRow[] = new int[cityNum];
		int cityColumn[] = new int[cityNum];

		/* 지정된 행열 최소 최대 넣기 */
		int rowMax = 0;
		int rowMin = 0;
		int columnMax = 0;
		int columnMin = 0;

		int count = 0;
		while (count < cityNum) { // 도시를 어디에 넣을건지
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

				// 조금 잘 보이게 하려고
				cityN.add(row, column);
				cityRow[count] = row;
				cityColumn[count] = column;
			} else {
				System.out.println("다시입력");
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
						System.out.print("□ ");
					else {
						System.out.print("■ ");
					}
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("전체 길이 = ");
		cityN.bfs(cityRow, cityColumn, 0);
		System.out.println();
		System.out.print("전체 길이 = ");
		System.out.println(DistanceSum(cityRow, cityColumn, cityNum));

	}


	public static int DistanceSum(int[] cityRow, int[] cityColumn, int cityNum) {
		int sum =0;
		for (int stand = 0; stand < cityNum; stand++) {
			int number = cityN.Number();

			// 각 길이들의 배열
			int[] length = new int[number];
			length[cityN.print(cityRow[stand], cityColumn[stand]).number] = 0;
			// 길이 채워줄 변수
			int lengthNum = 0;

			//방문한 곳을 확인하기 위해서 
			boolean[] visited = new boolean[number];

			// 큐
			Integer[] queue = new Integer[100];
			// 큐 위치
			int queueCount = 0;

			// 처음 삽입
			queue[queueCount++] = cityN.print(cityRow[stand], cityColumn[stand]).number;
			
			// 반복으로 bfs 구현
			while (queueCount != 0) {

				// 큐 처음 삭제
				queueCount -= 1;
				int now = queue[0];
				queue[0] = null;
				for (int i = 0; i < queueCount; i++)
					queue[i] = queue[i + 1];

				// 만약 들어간 곳이면
				if (visited[cityN.print(cityRow[now], cityColumn[now]).number])
					continue;
				// 안들어갔으면 들어간 것으로 추가
				visited[cityN.print(cityRow[now], cityColumn[now]).number] = true;

				// 츌룍

				// 지정된 곳에서 부터 지금 있는 곳까지의 길이
				// 왼쪽이 있으면
				if (cityN.print(cityRow[now], cityColumn[now]).left != null) {
					queue[queueCount++] = cityN.print(cityRow[now], cityColumn[now]).left.number;
					// 왼쪽으로 방문을 안했으면
					// 왼쪽의 길이는 now으로 부터 길이 1 추가
					if (visited[cityN.print(cityRow[now], cityColumn[now]).left.number] == false)
						length[cityN.print(cityRow[now], cityColumn[now]).left.number] = length[cityN
								.print(cityRow[now], cityColumn[now]).number] + 1;
				}
				
				if (cityN.print(cityRow[now], cityColumn[now]).bottom != null) {
					queue[queueCount++] = cityN.print(cityRow[now], cityColumn[now]).bottom.number;
					// 아래로 방문을 안했으면
					// 아래쪽의 길이는 now으로 부터 길이 1 추가
					if (visited[cityN.print(cityRow[now], cityColumn[now]).bottom.number] == false)
						length[cityN.print(cityRow[now], cityColumn[now]).bottom.number] = length[cityN
								.print(cityRow[now], cityColumn[now]).number] + 1;
				}
				if (cityN.print(cityRow[now], cityColumn[now]).right != null) {
					queue[queueCount++] = cityN.print(cityRow[now], cityColumn[now]).right.number;
					// 오른쪽으로 방문을 안했으면
					// 오른쪽의 길이는 now으로 부터 길이 1 추가
					if (visited[cityN.print(cityRow[now], cityColumn[now]).right.number] == false)
						length[cityN.print(cityRow[now], cityColumn[now]).right.number] = length[cityN
								.print(cityRow[now], cityColumn[now]).number] + 1;
				}
				if (cityN.print(cityRow[now], cityColumn[now]).top != null) {
					queue[queueCount++] = cityN.print(cityRow[now], cityColumn[now]).top.number;
					// 위로 방문을 안했으면
					// 위쪽의 길이는 now으로 부터 길이 1 추가
					if (visited[cityN.print(cityRow[now], cityColumn[now]).top.number] == false)
						length[cityN.print(cityRow[now], cityColumn[now]).top.number] = length[cityN.print(cityRow[now],
								cityColumn[now]).number] + 1;
				}
				// 기준보다 큰 번호만 더하기
				if(cityN.print(cityRow[now], cityColumn[now]).number > stand)
					sum += length[cityN.print(cityRow[now], cityColumn[now]).number];
			}
//			System.out.println(stand+"sum = " + sum);
		}
//		System.out.println("결론sum = " + sum);
		return sum;
	}
}
