class Solution {
    public int solution(int n, int k) {
      // P92335 : k진수에서 소수 개수 구하기
        int answer = 0;
        
        String baseK = Integer.toString(n, k);
        
        // split("0+")로 연속된 0을 한 번에 자를 수 있음.
        String[] selectPrimes = baseK.split("0+");
        
        for(String selectPrime : selectPrimes){
            // java.lang.NumberFormatException: For input string: ""
            // split("0")로 쪼개면 맨 앞/뒤가 0이거나 0이 연속될 때 빈 문자열("")이 나옵니다.
            // 그걸 그대로 Integer.parseInt("") 하니 NumberFormatException이 납니다.
            // 이 오류로 인해 추가
            if (selectPrime.isEmpty())
                continue; 
            
            long decimal = Long.parseLong(selectPrime);
            System.out.println(decimal);
            if(isPrime(decimal)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public boolean isPrime(Long decimal){
        
        if (decimal < 2)
            return false;

        // 소수 판정은 √n까지 반복하면 충분
        long rootNumber = (long) Math.sqrt(decimal);
        
        for(int i = 2; i <= rootNumber; i++){
            if(decimal%i == 0)
                return false;
        }
        return true;
    }
}
