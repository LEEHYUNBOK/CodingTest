import java.util.*;

class Solution {

    // P42628 : 이중우선순위큐
    public int[] solution(String[] operations) {
        List<Integer> queue = new ArrayList<>();
        int min = 0;
        int max = 0;
        
        for(String operation : operations){
            String[] operCheck = operation.split(" ");
            // System.out.println(operCheck[0] + " : " + operCheck[1]);
            
            if(operCheck[0].equals("I")){
                int addNum = Integer.parseInt(operCheck[1]);


              // 처음 푼 방법 - 시간초과
//                 int addIndex = 0;
//                 if(queue.isEmpty() || queue.get(0) >= addNum){
//                     queue.add(0, addNum);
//                 }
//                 else if(queue.get(queue.size()-1) <= addNum){
//                     queue.add(queue.size(), addNum);
//                 }
//                 else{
//                     for(addIndex = 1; addIndex < queue.size()-2; addIndex++){
//                         if(queue.get(addIndex-1) <= addNum && queue.get(addIndex) >= addNum)
//                             queue.add(addIndex, addNum);

//                     }
//                 }

                // 두번째 푼 방법 - add 만 되는 경우를 생각 못함. 마지막 sort 필요.
                queue.add(addNum);
                
                // System.out.println("queue : "+queue);
            }else {
              
                // 두번째 푼 방법 - add 만 되는 경우를 생각 못함. 마지막 sort 필요.
                Collections.sort(queue);
                if(queue.isEmpty())
                    continue;
                else if(operCheck[1].equals("1")){
                    queue.remove(queue.size()-1);
                } else{
                    queue.remove(0);
                }
            }
        }

      
        // 세번째 푼 방법 - 해결
        Collections.sort(queue);
        if(queue.isEmpty()){
            return new int[]{0,0};
        } else{
            return new int[]{queue.get(queue.size()-1),queue.get(0)};
        }
    }
}
