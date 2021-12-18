package naverfinancial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class p3 {
	
	class Tester {
		String tno; // �����ȣ
		ArrayList<String> qno; // ������ȣ
		ArrayList<String> score; // ��������
		
		
		public Tester(String tno) {
			super();
			this.tno = tno;
			this.qno = new ArrayList<String>();
			this.score = new ArrayList<String>();
		}

		
		public String getTno() {
			return tno;
		}


		public void setTno(String tno) {
			this.tno = tno;
		}

		
		public void addQno(String qno) {
			this.qno.add(qno);
		}
		
		public void addScore(String score) {
			this.score.add(score);
		}
		
		public ArrayList<String> getQno() {
			return qno;
		}

		public ArrayList<String> getScore() {
			return score;
		}
		
	}
	
	public String[] solution(String[] logs) {
        String[] answer = {};
        
        ArrayList<String> testList = new ArrayList<>(); // �����ڸ���Ʈ
        
        for(String s : logs) { 
        	String [] str = s.split(" ");
        	if(!testList.contains(str[0])) {
        		testList.add(str[0]);
        	}
        	
        }
        Tester[] tester = new Tester[testList.size()]; // ������ Ŭ����
        
        for(int i = 0; i < testList.size(); i++) {
        	tester[i] = new Tester(testList.get(i));
        }
        
        for(String s : logs) { 
        	String [] str = s.split(" ");
        	
        	for(int i = 0; i < tester.length; i++) {
        		if(str[0].equals(tester[i].getTno())) {
        			int idx = tester[i].getQno().indexOf(str[1]);
        			if(idx !=-1) { // ������ ������ Ǭ ���� ������
        				tester[i].getScore().set(idx, str[2]);
        			} else {
        				tester[i].addQno(str[1]); // ������ȣ
            			tester[i].addScore(str[2]); // ��������
        			}
        			
        		}
        	}
        }
//        ArrayList<String> qno = tester[0].getQno();
//        for(String s : qno) {
//        	System.out.println(s);
//        }
        
        HashSet<String> badguys = new HashSet<>(); // ����������
        
        for(int i = 0; i < tester.length; i++) {
        	String tno = tester[i].getTno();
        	ArrayList<String> qno = tester[i].getQno();
        	ArrayList<String> score = tester[i].getScore();
        	
        	for(int j = i + 1; j < tester.length; j++) { // ���� ������

        		String tno2 = tester[j].getTno();
        		ArrayList<String> qno2 = tester[j].getQno();
            	ArrayList<String> score2 = tester[j].getScore();
            	
            	if(qno.size() == qno2.size() && qno.size() >=5) { // �� �����ڰ� Ǭ ���� ���� ����
            		if(qno.containsAll(qno2)) { // ���� ������ Ǯ��
            			if(score.containsAll(score2)) { // ������ ������
            				// ����������
            				badguys.add(tno);
            				badguys.add(tno2);
            			}
            		}
            	}
            	
            	
        	}
        	
        	
        	
    	}
        

        
        answer = badguys.toArray(new String[0]);
        
        Arrays.sort(answer);
        
        if(answer.length == 0) {
        	String [] ans = {"None"};
        	return ans;
        }
        
        for(String s : answer) {
        	System.out.println(s);
        }
        
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		p3 p3 = new p3();
		
		//�����ȣ ������ȣ ����
		String [] logs = {"1901 10 50", "1909 10 50"};
		System.out.println(p3.solution(logs));
	}
}
