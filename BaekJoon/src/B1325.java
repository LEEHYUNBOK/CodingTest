import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B1325 {
	// 문제 : 효율적인 해킹
	static LinkedList<Integer>[] list;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()) + 1;
		int m = Integer.parseInt(st.nextToken());
		list = new LinkedList[n];

		for (int k = 0; k < n; k++) {
			list[k] = new LinkedList<Integer>();
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int in = Integer.parseInt(st.nextToken());
			list[Integer.parseInt(st.nextToken())].add(in);
		}

		ArrayList<Integer> result = null;

		int count = 0;

		for (int i = 1; i < n; i++) {
			visited = new boolean[n];
			if (list[i].size() == 0)
				continue;
			int compare = dfs(i);
			if (count <= compare) {
				if (count < compare)
					result = new ArrayList<Integer>();

				count = compare;
				result.add(i);
			}

		}

		for (Integer o : result)
			sb.append(o + " ");
		System.out.println(sb);
	}

	static int dfs(int t) {
		if (visited[t] == true) {
			return 0;
		}
		visited[t] = true;
		int count = 1;
		for (Integer k : list[t]) { // for문을 통한 전체출력
			count += dfs(k);
		}
		return count;

	}
}
