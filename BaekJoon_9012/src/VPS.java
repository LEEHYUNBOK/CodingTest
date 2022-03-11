import java.util.*;

class Stack {

	String[] stack;

	public void Stack(String concatenation) {
		stack = new String[concatenation.length()];
		size = concatenation.length();
		stack = concatenation.split("");

	}

	int size = 0;

//	public void push(String num) {
//		stack[size++] = num;
//	}
	public int size() {
		return size;
	}

	public String poll() {
		if (size == 0)
			return null;
		String num = stack[--size];
		stack[size] = null;
		return num;
	}

	public void print() {
		for(int i =0; i < size;i++) {
			System.out.print(stack[i]);
		}
	}
}

public class VPS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("VPS ¼ö");
		int VPSNum = sc.nextInt();
		Stack[] VPS = new Stack[VPSNum];
		String concatenation;
		for (int i = 0; i < VPSNum; i++) {
			concatenation = sc.next();
			VPS[i] = new Stack();
			VPS[i].Stack(concatenation);
		}
//		for (int i = 0; i < VPSNum; i++) {
//			VPS[i].print();
//			System.out.println();
//		}
		for (int i = 0; i < VPSNum; i++) {
			int num = 0;
			while(true) {
//				System.out.println("µé°¬¾î");
				String n = VPS[i].poll();
				if(n == null)
					break;
				if (n.equals(")"))
					num+=1;
				else if (n.equals("("))
					num-=1;
				if (num < 0)
					break;
			}
			if (num == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
