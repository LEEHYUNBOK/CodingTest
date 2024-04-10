import java.util.*;
import java.lang.*;
import java.io.*;



// The main method must be in a class named "Main".
class B10828 {
    // 문제 : 스택
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기
        Stack<Integer> stack = new Stack<>();
        String tmp = "";

        while ((tmp = br.readLine()) != null) {
            String[] order = tmp.split(" ");
            switch (order[0]) {
                case "push":
                    stack.push(Integer.parseInt(order[1]));
                    break;
                case "top":
                    if(stack.empty()){
                        sb.append(-1+"\n");
                        break;
                    }
                    sb.append(stack.peek()+"\n");
                    break;
                case "size":
                    sb.append(stack.size()+"\n");
                    break;
                case "empty":
                    if(stack.empty()){
                        sb.append(1+"\n");
                        break;
                    }
                    sb.append(0+"\n");
                    break;
                case "pop":
                    if(stack.empty()){
                        sb.append(-1+"\n");
                        break;
                    }
                    sb.append(stack.pop()+"\n");
                    break;
                default: 
                    break;
            }
        }
		System.out.print(sb);// StringBuilder에 있는 데이터 모두 출력
	}}
