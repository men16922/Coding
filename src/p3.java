import java.util.Arrays;

public class p3 {
	
	/*
	 * phone_book 배열을 sorting하고 i번째부터 legngth-1까지, i+1이 i로 시작하는지 검사
	 * sort되었으므로 길이가 짧은 것부터 그다음 길이인 값의 접두사를 검사한다.
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
