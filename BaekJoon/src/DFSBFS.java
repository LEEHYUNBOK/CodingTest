import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class DFSBFS {
	public static int num;
	public static int role;
	public static int start;
	public static boolean[] dpsVisit;
	public static int[][] link;

	public static void DFS(int v) {

		dpsVisit[v] = true;
		System.out.print(v + " ");
		for (int i = 1; i <= num; i++) {
			if (link[v][i] == 1 && !dpsVisit[i]) {
				DFS(i);
			}
		}
		return;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		num = Integer.parseInt(st.nextToken());
		role = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		link = new int[num + 1][num + 1];
		int a, b;
		for (int i = 0; i < role; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			link[a][b] = 1;
			link[b][a] = 1;
		}

		dpsVisit = new boolean[num + 1];
		DFS(start);
		System.out.println();

		boolean[] bVisit = new boolean[num + 1];
		LinkedList<Integer> linked = new LinkedList<>();
		linked.add(start);
		bVisit[start] = true;
		int now;
		while (!linked.isEmpty()) {
			now = linked.poll();
			System.out.print(now + " ");
			for (int i = 1; i <= num; i++) {
				if (link[now][i] == 1 && !bVisit[i]) {
					linked.add(i);
					bVisit[i] = true;
				}
			}
		}
	}
}
