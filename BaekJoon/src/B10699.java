import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class B10699 {
	// 문제 : 오늘 날짜
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(); // 할당된 버퍼에 값 넣어주기
		sb.append(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		System.out.println(sb);
	}
}
