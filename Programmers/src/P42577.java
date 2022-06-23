
import java.util.Arrays;

public class P42577 {
	// 문제 : 전화번호 목록
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phone_book = { "12", "123", "1235", "567", "88" };
		String[] phone_book1 = { "123", "456", "789" };
		String[] phone_book2 = { "119", "97674223", "1195524421" };
		System.out.println(solution(phone_book));
		System.out.println(solution(phone_book1));
		System.out.println(solution(phone_book2));
	}

	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		Arrays.sort(phone_book);

		for (String i : phone_book)
			System.out.print(i.substring(0, phone_book[0].length()) + " ");
		System.out.println();

		for (int i = 0; i < phone_book.length - 1; i++) {
			if (phone_book[i].length() <= phone_book[i + 1].length()) {
				if (phone_book[i].compareTo(phone_book[i + 1].substring(0, phone_book[i].length())) == 0) {
					answer = false;
					break;
				}
			}
		}

		return answer;
	}

}