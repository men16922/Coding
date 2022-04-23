package hackerRank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class h_candles {
	public static int birthdayCakeCandles(List<Integer> candles) {
	    // Write your code here
	        int max = Integer.MIN_VALUE;
	        int size = candles.size();
	        
	        for(int i : candles) {
	            max = Math.max(i, max);
	        }
	        
	        int count = Collections.frequency(candles, max);
	        
	        return count;

	    }
	
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")) // 공백에서 시작해서 공백으로 끝나는 구문 정규표현식 제거
            .map(Integer::parseInt)
            .collect(toList());

        int result = birthdayCakeCandles(candles);
        System.out.println(result);
        
        bufferedReader.close();
        
    }
}
