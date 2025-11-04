// 풀의 1 : dfs => 효율성 이슈로 인한 아웃
public class P1844 {
	// P1844 : 게임 맵 최단거리 풀의

	static int x;
	static int y;

	static int total;

	static boolean arrive;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maps = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 },
				{ 0, 0, 0, 0, 1 } };
		System.out.println(solution(maps));
		int[][] maps1 = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 1 } };
		System.out.println(solution(maps1));
	}

	public static int solution(int[][] maps) {
		total = 1;
		x = maps.length;
		y = maps[0].length;
		arrive = false;
		boolean[][] visit = new boolean[x][y];
		int answer = 0;
		dfs(0, 0, total, maps, visit);
		if (arrive == false)
			total = -1;
		return total;
	}

	public static void dfs(int i, int j, int sum, int[][] maps, boolean[][] visit) {

		if (i == x - 1 && j == y - 1) {
			if (total == 1 || total > sum)
				total = sum;
			arrive = true;
			return;
		}
		if (i < 0 || i >= x || j < 0 || j >= y || visit[i][j] == true || maps[i][j] == 0)
			return;
		if (maps[i][j] == 1) {
			visit[i][j] = true;
			dfs(i + 1, j + 0, sum + 1, maps, visit);
			dfs(i + 0, j - 1, sum + 1, maps, visit);
			dfs(i - 1, j + 0, sum + 1, maps, visit);
			dfs(i + 0, j + 1, sum + 1, maps, visit);
			visit[i][j] = false;
		}
	}
}

// 풀의 2 : bfs => 효율성 이슈 해결
import java.util.*;

class Solution {
    
    public int solution(int[][] maps) {
		int row = maps.length;
		int column = maps[0].length;
		
		boolean[][] visit = new boolean[row][column];
        
        
        Queue<int[]> bfs = new LinkedList<>();
        bfs.add(new int[]{0, 0, 1});
        
        visit[0][0] = true;
        
        int[][] upDownLeftRights = {{-1,0},{1,0},{0,-1},{0,1}};
        while(!bfs.isEmpty()){
            int[] current = bfs.poll();
            int xCurrent = current[0];
            int yCurrent = current[1];
            int countCurrent = current[2];
            
            
            if(xCurrent == row-1 && yCurrent == column-1){
                return countCurrent;
            }
            
            for(int[] upDownLeftRight : upDownLeftRights){
                int xNext = xCurrent + upDownLeftRight[0];
                int yNext = yCurrent + upDownLeftRight[1];
                if(xNext >= 0 &&
                   yNext >= 0 &&
                   xNext < row &&
                   yNext < column &&
                   visit[xNext][yNext] == false &&
                   maps[xNext][yNext] == 1
                  ){
                   visit[xNext][yNext] = true;
                    bfs.add(new int[]{xNext, yNext, countCurrent+1});
                }
                    
            }
        }
		return -1;
	}
}
