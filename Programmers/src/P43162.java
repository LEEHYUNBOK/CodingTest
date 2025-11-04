// bfs : P43162 : 네트워크
import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        Queue<Integer> bfs = new LinkedList<>();
        
        
        for(int computerIndex = 0; computerIndex < n; computerIndex++){
            if(!visited[computerIndex]){
                bfs.add(computerIndex);

                while(!bfs.isEmpty()){
                    int currentIndex = bfs.poll();
                    visited[currentIndex] = true;

                    for(int searchConnectIndex = 0; searchConnectIndex < n; searchConnectIndex++){
                        if(searchConnectIndex != currentIndex &&
                           !visited[searchConnectIndex] &&
                           computers[currentIndex][searchConnectIndex] == 1
                          ){
                            visited[searchConnectIndex] = true;
                            bfs.add(searchConnectIndex);
                        }
                    }
                }
                answer++;
            } else{
                continue;
            }            
        }
        return answer;
        
    }
}
