import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class B10699 {
	// ���� : ���� ��¥
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(); // �Ҵ�� ���ۿ� �� �־��ֱ�
		sb.append(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		System.out.println(sb);
	}
}
