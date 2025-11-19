import java.util.*;
import java.util.stream.*;

class Solution {
  // P42626 : 더 맵게
    public int solution(int[] scoville, int K) {
        
        int answer = 0;
        PriorityQueue<Integer> queue =  Arrays.stream(scoville).boxed().collect(Collectors.toCollection(PriorityQueue::new));
        
            // cannot infer type arguments for ArrayList<> 에러 발생
            // new ArrayList<>(Arrays.asList(scoville));
        
        
        /***********************************
        while(queue.peek() < K && pq.size() > 1){
            int firstScov = queue.poll();
            int secondScov = queue.poll();
                
            queue.offer( firstScov * (secondScov * 2));
            answer++;
        }
        
        return pq.peek() < K ? -1 : answer;
        
        ***********************************/
        while(queue.size() > 1){
            if(queue.peek() >= K)
                return answer;
            int first = queue.poll();
            int second = queue.poll();
            queue.add(first + (second * 2));
            answer++;
        }
        
        if(queue.peek() < K)
            return -1;
        return answer;
    }
}
