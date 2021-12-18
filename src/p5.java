import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class p5 {

	public static int[] solution(String[] genres, int[] plays) {
       
        
        Map <String, Integer> gMap = new HashMap <String, Integer>();
        
        /*for(int i = 0; i < genres.length; i++) {
        	gMap.put(genres[i], gMap.getOrDefault(genres[i], 0) + 1);
        }*/
        HashSet<String> hashSet = new HashSet<>();
        
        for(String item : genres){
            hashSet.add(item);
        }
        
        for(String item : hashSet) {
        	//System.out.println(item);
        	int sum = 0;
        	
        	for(int i=0; i < genres.length; i++) {
        		if(item.equals(genres[i])) {

        			sum += plays[i];
        			//System.out.println(sum);
        			gMap.put(item, sum);
        		}
        	}
        }
		
        
        Map <String, ArrayList<Integer>> aMap = new HashMap <String, ArrayList<Integer>>();
		for (Entry<String, Integer> entry : gMap.entrySet()) { 
			//System.out.println("[key]:" + entry.getKey() + ", [value]:" + entry.getValue()); 
			ArrayList<Integer> tempList = new ArrayList<Integer>();
			for(int i=0; i< genres.length; i++) {
				if(entry.getKey().equals(genres[i])) {
					tempList.add(plays[i]);

				}		
			}
			Descending descending = new Descending();

			tempList.sort(descending);
			aMap.put(entry.getKey(), tempList);
		}
		ArrayList<Integer> answerList = new ArrayList<Integer>();
		for (Entry<String, ArrayList<Integer>> entry : aMap.entrySet()) {
			//System.out.println("[key]:" + entry.getKey() + ", [value]:" + entry.getValue());
			
	
			for(int i=0; i<entry.getValue().size(); i++) {
				if(i>=2) {
					break;
				}
				//System.out.println(entry.getValue().get(i));
				for(int j=0; j<plays.length; j++) {
					if(entry.getValue().get(i) == plays[j]) {
						if(!(answerList.contains(j)))
							answerList.add(j);
					}
				}
			}
		}
		
		for(int i =0; i < answerList.size();i++) {
			System.out.println(answerList.get(i));
		}
		
		int[] answer = new int [answerList.size()];
		for(int i =0 ; i<answer.length; i++) {
			answer[i] = answerList.get(i);
		}
        return answer;
    }
	
	public static void main(String[] args) {
		String [] genres = {"classic", "pop", "classic", "classic", "pop"};
		int [] plays = {500, 600, 150, 800, 2500};
		
		int [] answer = solution(genres,plays);
		for(int i=0; i < answer.length; i++) {
			//System.out.print(answer[i]);
		}
	}
}

/* 내림차순 정렬 */
class Descending implements Comparator<Integer> {
 
    @Override
    public int compare(Integer a, Integer b) {
        return b.compareTo(a);
    }
}


