
public class ����2�� {

	public static String solution(int n) {
	        String answer = "1";
	        
	        String [] tmp = answer.split("");
	        
	        for(int i = 0; i < n-1; i++) {
	        	tmp = answer.split("");
	        	
	        	String tkn = tmp[0];
	        	
	        	int cnt = 0;
	        	
	        	answer = "";
	        	for(int j=0;j<tmp.length;j++) {

	                if(tkn.equals(tmp[j])) {

	                    cnt++;

	                }else {

	                	answer += tkn+Integer.toString(cnt);

	                    tkn = tmp[j];

	                    cnt = 1;

	                }

	            }

	            if(cnt >= 1) {

	            	answer += tkn+Integer.toString(cnt);

	                cnt = 1;

	            }

	            

	        }

	        
	        return answer;
	        	
	        }
	        
	
	public static String gami(int num) {

        StringBuilder sb = new StringBuilder("1");

        String[] temp = sb.toString().split("");

        for(int i=0;i<num-1;i++) {
            temp = sb.toString().split("");

            String token = temp[0];

            sb = new StringBuilder();

            int cnt = 0;

            for(int j=0;j<temp.length;j++) {

                if(token.equals(temp[j])) {

                    cnt++;

                }else {

                    sb.append(token+""+cnt);

                    token = temp[j];

                    cnt = 1;

                }

            }

            if(cnt >= 1) {

                sb.append(token+""+cnt);

                cnt = 1;

            }

            

        }

        
        return sb.toString();
    }

	
	public static String solution1(int n) {
		String pre = new String("1"); 

        int index = 0; // ���� �ε���
        // n - 1 ��° index���� loop    
        while(index < n -1) {

            String post = "";
            for(int i = 0 ; i < pre.length(); i++) { 
                if(i > 0) {
                    if(pre.charAt(i-1) == pre.charAt(i)) {
                    	// ���ڿ��� ���ӵ� ���
                        continue;
                    }
                }
                
                char str = pre.charAt(i); // i��° ���ڿ�
                
                int cur = 0;
                
                for(int j = i ; j < pre.length() ; j++) { // ���ڿ��� i��°���� ���������� loop
                    if(str == pre.charAt(j)) {
                    	cur++; // ���ӵǴ� ������ ����
                    }else {
                        break;
                    }
                }
                
                post += str + Integer.toString(cur); // ���ڿ��� �� �ڿ� ���ӵ� ������ ������ �����ش�.
                
            }
            pre = post;
            
            index++;    
        }
        return pre;
	}
	
	public static String prnLine(String pre) {
        String next = "";
        
        for(int i=0 ; i<pre.length() ; i++) {
            if(i>0) {
                if(pre.charAt(i-1)==pre.charAt(i)) {
                    continue;
                }
            }
            next += numberOf(pre,i);
        }
        return next;        
    }
    
	private static String numberOf(String preLine, int index) {
        
        char str = preLine.charAt(index);
        int cnt = 0;
        
        for(int j=index ; j<preLine.length() ; j++) {
            if(str == preLine.charAt(j)) {
            cnt++;
            }else {
                break;
            }
        }
        return str + Integer.toString(cnt);
    }
	
	public static void main(String[] args) {
		int N = 5;
		//String answer = gami(N);
		//System.out.println(answer);
		//answer = solution(N);
		//System.out.println(answer);
		String answer2 = solution1(N);
		System.out.println(answer2);
	}
}

//5 ������ 122111
