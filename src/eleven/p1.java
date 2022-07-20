package eleven;

public class p1 {

	public static int solution(String S) {
		
		int max = 1;
		String str_temp = "";
		String str = S.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
			String str_div = str.substring(i, j+1); //문자열의 처음부터 차례대로 잘라나감.
			String str_div2 = str.substring(i+1); 
//			System.out.println(str_div2.matches(".*"+str_div+".*") + "  " + str_div + " " + str_div2);
						
			//문자열 비교.
			if(str_div2.matches(".*"+str_div+".*"))
			//계산값중 가장 긴 문자열 이며 , 원본과 다를때.
			if((max < str_div.length())&& (str_div.length() != str.length())){
				max = str_div.length();
				str_temp = str_div;
								System.out.println(str_temp);
				}
			}
			}
		System.out.println(max + "  " + str_temp);
        
        
        return -1;
    }

	public static void main(String[] args) {

		String s = "azABaabza";

		System.out.println(solution(s));
	}

}
