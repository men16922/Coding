package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class h_breakingRecords {
	
	 public static List<Integer> breakingRecords(List<Integer> scores) {
		    // Write your code here
		        int max = scores.get(0);
		        int min = scores.get(0);
		        int maxCount = 0;
		        int minCount = 0;
		        
		        for(int i = 1; i < scores.size(); i++) {
		        
		            if(max < scores.get(i)) {
		                max = scores.get(i);
//		                System.out.println("max : " + scores.get(i));
		                maxCount++;
		            }
		            if(min > scores.get(i)) {
		                min = scores.get(i);
//		                System.out.println("min : " + scores.get(i));
		                minCount++;
		            }
		        }
		        
		        System.out.printf("max : %d, min : %d", maxCount, minCount);
		        System.out.println();
		        List<Integer> result = new ArrayList<>();
		        result.add(maxCount);
		        result.add(minCount);
		        
		        return result;
		    }
	 
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = breakingRecords(scores);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

