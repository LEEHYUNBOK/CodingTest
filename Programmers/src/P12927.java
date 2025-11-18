/*****************************************************************
 Priority Queue
   : 삽입되는 순서와 관계없이 큐에 저장된 원소들 중 우선순위가 높은 순으로 삭제되는 자료구조

 선언
   import java.util.PriorityQueue;
   import java.util.Collections; // 정렬에 필요한 경우

   PriorityQueue<자료형> 변수명 = new PriorityQueue<>();
     ㄴ <자료형>에 넣은 자료형만 삽입, 삭제 가능

   PriorityQueue 변수명 = new PriorityQueue();
     ㄴ 큐에 저장되어있는 value와 같은 자료형만 삽입 가능

 정렬 우선순위 (Sort Priority)
   1. 오름차순
      PriorityQueue<자료형> 변수명 = new PriorityQueue<>();

   2. 내림차순
      PriorityQueue<자료형> 변수명 = new PriorityQueue<>(Collections.reverseOrder());

   3. 사용자 정의
      PriorityQueue<자료형> 변수명 = new PriorityQueue<>(new Comparator<자료형>() {
          @Override
          public int compare(자료형 o1, 자료형 o2) {
              return o1 - o2; // 오름차순
              return o2 - o1; // 내림차순
          }
      });

   4. 객체 정렬
      static class 클래스명 implements Comparable<클래스명> {
          클래스명 클래스변수
          ...
          @Override
          public int compareTo(클래스명 변수명) {
              return this.클래스변수 - 변수명.클래스변수;
          }
      }
      // 우선순위 큐 선언 시
      PriorityQueue<클래스명> 변수명 = new PriorityQueue<>();

 메서드 (Method)
   PriorityQueue<자료형> pq = new PriorityQueue<>();

   1. 삽입
      pq.add(삽입할 value);
        ㄴ 반환 값(boolean): 삽입 성공 시 true / 실패 시 Exception발생

      pq.offer(삽입할 value);
        ㄴ 반환 값(boolean): 삽입 성공 시 true / 실패 시 false 반환

   2. 삭제
      pq.remove();
        ㄴ 반환 값(삭제된 value의 자료형): 삭제된 value / 공백 큐이면 Exception("NoSuchElementException") 발생

      pq.remove(삭제할 value);
        ㄴ 반환 값(boolean): 큐에 해당 value가 존재하면 해당 값 삭제 후 true / 존재하지 않으면 false 반환

      pq.poll();
        ㄴ 반환 값(삭제된 value의 자료형): 삭제된 value / 공백 큐이면 null 반환

   3. 큐의 front에 위치한 value 반환
      pq.element();
        ㄴ 반환 값(큐 head에 위치한 value의 자료형): 큐 head에 위치한 value / 공백 큐이면 Exception("NoSuchElementException") 발생

      pq.peek();
        ㄴ 반환 값(큐 head에 위치한 value의 자료형): 큐 head에 위치한 value / 공백 큐이면 null 반환

   4. 큐 초기화(= 공백 큐 만들기)
      pq.clear();
        ㄴ 반환 값(void): X

   5. 큐 크기
      pq.size();
        ㄴ 반환 값(int): 큐 사이즈 반환

   6. 큐에 해당 원소가 존재하는지?
      pq.contains(찾을 value);
        ㄴ 반환 값(boolean): 해당 값이 존재할 때 true / 해당 값이 없을 때 false 반환

   7. 공백 큐인가?
      pq.isEmpty();
        ㄴ 반환 값(boolean): 공백 큐이면 true / 공백 큐가 아니면 false 반환
 ******************************************************************/



import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
      // p12927 : 야근지수
        long answer = 0;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> ( b - a ));
        // PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int work : works){
            queue.add(work);
        }
        
        while(n > 0 && !queue.isEmpty()) {
            int nextNum = queue.poll();
            if(nextNum > 0){
                queue.add(nextNum-1);
                n--;
            }
        }
        
        while(!queue.isEmpty()){
            answer+= Math.pow(queue.poll(), 2);
        }
        
        return answer;
    }
}
