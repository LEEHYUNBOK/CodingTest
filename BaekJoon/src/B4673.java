import java.io.IOException;

public class B4673 {
	// 문제 : 셀프 넘버
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기

		boolean[] a = new boolean[10001];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			int num = 0;
			if (i < 10)
				num = i + i;
			else if (i < 100)
				num = (i / 10) + (i % 10) + i;
			else if (i < 1000)
				num = (i / 100) + ((i % 100) / 10) + (i % 10) + i;
			else
				num = (i / 1000) + ((i % 1000) / 100) + (((i % 1000) % 100) / 10) + (i % 10) + i;
			if (num > 10000)
				continue;
			a[num] = true;

		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == false)
				sb.append(i + "\n");
		}
		System.out.println(sb);
	}
}
