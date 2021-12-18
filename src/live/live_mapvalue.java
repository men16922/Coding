package live;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class live_mapvalue {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 3);
		map.put("b", 2);
		map.put("c", 1);
		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
		entryList.sort(((o1, o2) -> map.get(o1.getKey()) - map.get(o2.getKey())));
		for(Map.Entry<String, Integer> entry : entryList){
		    System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
		}
	}
}
