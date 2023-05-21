import java.util.*;

class Solution2
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++)
        {
            int day = sc.nextInt();
            List<Integer> isSale = new ArrayList<>();
            List<Integer> price = new ArrayList<>();
            for(int i = 0; i < day; i++){
                int a = sc.nextInt();
                int s = sc.nextInt();
                isSale.add(a);
                price.add(s);
            }
            int most = 0;
            int cost = 0;
            for(int i = 0; i < price.size(); i++){
                if(isSale.get(i) == 1 && cost < price.get(i) && sale(isSale,price, cost, price.get(i),i)) {
                    cost = price.get(i);
                }
                else if(isSale.get(i) == -1 && cost == price.get(i)){
                    cost = 0;
                    most += price.get(i);
                }
            }

            System.out.println("#" + test_case + " " + most);
        }

        sc.close(); // 사용이 끝난 스캐너 객체를 닫습니다.
    }

    public static boolean sale(List<Integer> isSale, List<Integer> price, int sp, int mp, int index) {
        int indexSp = 0;
        int indexMp = 0;
        for(int i = index; i < price.size(); i++) {
            if(isSale.get(i) == -1 && sp == price.get(i)) {
                indexSp = i;
                break;
            }
        }
        for(int i = index; i < price.size(); i++) {
            if(isSale.get(i) == -1 && mp == price.get(i)) {
                indexMp = i;
                break;
            }
        }
        if(indexMp > indexSp)
            return true;
        return false;

    }
}
