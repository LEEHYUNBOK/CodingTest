import java.util.*;
import java.lang.*;
import java.io.*;

class B2751 {
    // 문제 : 수 정렬하기 2
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기
        ArrayList<Integer> sort = new ArrayList<>();
        String tmp = br.readLine();

        while ((tmp = br.readLine()) != null)
            sort.add(Integer.parseInt(tmp));

        Collections.sort(sort);
        
        for(int i : sort)
            sb.append(i+"\n");
		System.out.print(sb);// StringBuilder에 있는 데이터 모두 출력
	}
}
