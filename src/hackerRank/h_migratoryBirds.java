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

public class h_migratoryBirds {

	public static int migratoryBirds(List<Integer> arr) {
		
		int size = arr.size();
		
		int mode = 0; 
		int max = Integer.MIN_VALUE;
		int [] count = new int [size];

		
		for(int i: arr) {
			count[i]++;
		}
		
		for(int i = 0; i < size; i++) {
			
			if(max < count[i]) {
				max = count[i];
				mode = i;
			}
		}
		
		
		return mode;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int result = migratoryBirds(arr);	

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
