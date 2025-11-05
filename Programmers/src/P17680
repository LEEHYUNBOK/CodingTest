import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        // P17680 : 2018 KAKAO BLIND RECRUITMENT : [1차] 캐시

        int answer = 0;
        Queue<String> cashLRU = new LinkedList<>();
        int size = 0;
        
        for(String i : cities) {
            String city = i.toLowerCase();
            if(cashLRU.contains(city) && cacheSize != 0){
                cashLRU.remove(city);
                cashLRU.add(city);
                answer++;
            } else{
                if(size >= cacheSize){
                    cashLRU.poll();
                } else{
                    size++;
                }
                cashLRU.add(city);
                answer += 5;
            }
            // System.out.println("queue : "+cashLRU);
        }
        
        return answer;
    }
}
