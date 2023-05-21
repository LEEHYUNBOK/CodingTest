/*
N개의 레이저 발사기가 있다.

이들 중 i번째 발사기는 수직선(x축)의 X[i]에 위치하고 강도 F[i]를 가진다.

X[i]에 위치한 발사기가 레이저를 발사하면 X[i]에서 X[i]+F[i]까지 위치한 발사기가 모두 파괴된다. 자기 자신도 파괴됨에 주의하라.

전체에서 몇 개의 발사기를 수동으로 동작시켜 모든 발사기를 파괴하고 싶다

발사되는 레이저를 선택할 때는 반드시 X[i]가 작은 것을 먼저 작동시켜야 하며, 파괴된 발사기는 동작할 수 없다

발사 가능한 최소의 개수를 구하라.



예를 들어, N = 3이고 발사기들의 좌표가 각각 2, 4, 6, 발사 거리가 모두 2라고 하자.

이 경우 제일 왼쪽 2에 위치한 발사기를 동작시키면, 2와 4에 위치한 두 개의 발사기가 파괴된다. 그리고 6에 위치한 발사기를 동작시키면 모든 발사기가 파괴된 것이고 이 경우의 답은 2가 된다



[제약사항]



발사기의 수 N은 1 이상 500 이하이다. (1 ≤ N ≤ 500)

발사기의 좌표는 1 이상 10,000 이하의 정수이다.

발사기들의 좌표는 모두 다르다.

발사기의 강도는 1 이상 4,000 이하의 정수이다.



[입력]

가장 첫 줄에는 테스트 케이스의 총 수가 주어진다.

그 다음 줄부터 각 테스트 케이스가 주어지며, 각 테스트 케이스는 N+1 줄로 구성된다. 각 테스트 케이스의 첫 줄에는 N이 주어진다.

다음 N개의 줄 각각에 각 발사기의 좌표와 강도가 주어진다.

발사기는 좌표 값이 작은 것부터 큰 것의 순서로 주어진다.



[출력]

출력의 각 줄은 ‘#x’로 시작하고, 공백을 한 칸 둔 다음 동작시켜야 하는 발사기의 최소 개수를 출력한다. 단, x는 테스트 케이스의 번호이다.



[입력 예]

3                         // 테스트 케이스의 수

1                         // N = 1, 테스트 케이스 #1

8 2

3                         // N = 3, 테스트 케이스 #2

2 2

4 2

6 2

3                         // N = 3, 테스트 케이스 #3

2 2

50 2

98 4





[출력 예]

#1 1

#2 2

#3 3


* */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++)
        {
            List<Integer> x = new ArrayList();
            List<Integer> f = new ArrayList();
            int raser = sc.nextInt();
            for(int i = 0; i < raser; i++){
                int xInput = sc.nextInt();
                int fInput = sc.nextInt();
                x.add(xInput);
                f.add(fInput);
            }
            int answer = 0;
            while(x.size() != 0 && f.size() != 0) {
                if (x.size() != 1 && x.get(0) + f.get(0) >= x.get(1)) {
                    x.remove(1);
                    f.remove(1);
                    continue;
                }
                x.remove(0);
                f.remove(0);
                answer++;
            }
            System.out.println("#" + test_case + " " + answer);
        }

        sc.close(); // 사용이 끝난 스캐너 객체를 닫습니다.
    }
}
