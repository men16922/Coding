import java.util.Arrays;

public class p3 {
	
	/*
	 * phone_book �迭�� sorting�ϰ� i��°���� legngth-1����, i+1�� i�� �����ϴ��� �˻�
	 * sort�Ǿ����Ƿ� ���̰� ª�� �ͺ��� �״��� ������ ���� ���λ縦 �˻��Ѵ�.
	 * 
	 */
	public static boolean solution(String[] phone_book) {

        Arrays.sort(phone_book);
        boolean result = true;
        for (int i=0; i<phone_book.length-1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                result = false;
                break;
            }
        }
        return result;
    }
        
 
	
	public static void main(String[] args) {
		String [] phone_book = {"119", "97674223", "1195524421"};
		
		System.out.println(solution(phone_book));
	}
}
