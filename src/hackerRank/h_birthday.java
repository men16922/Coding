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

public class h_birthday {

	public static int birthday(List<Integer> s, int d, int m) {
		// Write your code here
		
		int count = 0;
		
		for(int i = 0; i < s.size(); i++) {
			
			int temp = 0;
			int size = s.size();
			if(i + m <= size) {
				for(int j = i;  j < i + m ; j++) {
					System.out.println(j + "¹øÂ° ¼ö : " + s.get(j));
					temp += s.get(j);
					System.out.println(temp);
				}
				
				System.out.println();
				
				if(temp == d) {
					count++;
				}
			}
			
		}
		
		System.out.println("final : " + count);
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int d = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		int result = birthday(s, d, m);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
