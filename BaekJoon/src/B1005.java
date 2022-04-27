/* 
  문제 : ACM Craft
  https://www.acmicpc.net/problem/1005
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Building {
	class Node {
		int time; // 노드 값 저장
		int num;
		Node next; // 다음 노드 주소 선언

		public Node(int time, int num) { // 노드에 저장
			this.num = num;
			this.time = time;
			next = null; // 다음 노드 null로 저장
		}
	}

	Node[][] build;

	int count = 1;

	// 건물의 개수를 num x num 크기로 2중배열 만듦
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
					System.out.print("□ ");
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

//		System.out.println("입력 숫자");
		int testCaseT = sc.nextInt(); // 테스트케이스의 개수 T
		for (int testCase = 0; testCase < testCaseT; testCase++) {
			Building building = new Building();
//			System.out.print("건물 갯수");
			int buildingN = sc.nextInt(); // 건물의 개수 N

//			System.out.print("규칙 갯수");
			int ruleK = sc.nextInt();// 건물간의 건설순서 규칙의 총 개수 K

			// 먼저 건물의 갯수를 building 배열에 +1해서 넣는다 넣어준다.
			// +1 하는 이유는 규칙 추가할 1번째 부터 시작하므로 편의를 위해 넣었다.
			building.buildingN(buildingN + 1);
			// 가리켜지는 방향이 몇개 있는지 확인해 주는 배열 order
			int[] order = new int[buildingN + 1];

//			System.out.print("건물 시간");
			// 우선 빌딩의 시간을 넣어면서 Node 추가해 준다
			for (int i = 0; i < buildingN; i++) {
				int time = sc.nextInt(); // 시간을 입력 받아 순서대로 넣어준다.
				building.add(time);
			}

//			System.out.print("규칙들");
			for (int i = 0; i < ruleK; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				// 가리켜질때마다 1씩 추가하기
				order[end] += 1;
				building.link(start, end);
			}
//			System.out.print("목표");
			// 건설해야할 건물의 번호
			int targetW = sc.nextInt();

//			for (int i = 1; i < buildingN + 1; i++) {
//				System.out.print(order[i] + " ");
//			}
			// 건물 시간 출력

//			System.out.println();
//			System.out.println();
//			building.Print();
//			System.out.println();
			System.out.println(minTime(building, targetW, order));

		}

	}

	public static int minTime(Building building, int targetW, int[] order) {

		// 가리켜지는 방향이 없는 건물의 순서를 삽입하기 위한 Queue삽입을 위한 queue 생성
		Queue<Integer> queue = new LinkedList<Integer>();

		// 건물을 지을때 마다 걸리는 시간을 저장하기 위한 배열
		int[] targetTime = new int[order.length];
		// queue에 가리켜 지는 방향이 없는 건물부터 넣기
		// 그래야 도착지점으로 가면서 몇시간이 걸리는지 알 수 있음
		for (int i = 0; i < order.length; i++) {
			if (order[i] == 0)
				queue.add(i);
		}

		// queue의 크기가 0이 아닐때 까지 반복
		// 모든 건물이 다 지어질 때까지 반복한다.
		while (queue.size() != 0) {
			// 이제 지어질 건물을 저장한 stand
			int stand = queue.poll();
			// stand가 가리키는 건물을 찾는다.
			for (int i = 1; i < order.length; i++) {
				// stand와 i가 같으면 continue
				if (stand == i)
					continue;
				// 만약에 가리키는 것이 있으면
				if (building.exist(stand, i) != null) {
//					System.out.println(stand + ", " + i + " = 존재");
					// 가리킨 건물 i의 가리켜지는 횟수를 하나 줄인다.
					order[i] -= 1;
					// 건물 i까지의 시간이 stand로부터 지어지는 경로의 시간보다 적다면
					// stand로부터 오는 경로의 시간이 끝나야 i가 지어지므로
					// i까지의 걸리는 시간이 더 큰 것으로 넣는다.
					targetTime[i] = (targetTime[i]) < (building.exist(stand, stand).time + targetTime[stand])
							? (building.exist(stand, stand).time + targetTime[stand])
							: targetTime[i];
//					System.out.println("targetTime[" + i + "] = " + targetTime[i]);
					// 만약에 가리켜지는 것이 없으면 queue에 넣는다.
					if (order[i] == 0)
						queue.add(i);
				}
			}
		}

		// 끝나서 이제 출력을 해야할때 W까지 지어지는 시간과 W가 지어지는 시간을 더해서 return한다.
		return targetTime[targetW] + building.exist(targetW, targetW).time;
	}

}
