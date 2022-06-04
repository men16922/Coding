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

public class h_divisibleSumPairs {

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

		int size = ar.size();
		int cnt = 0;
		
		for(int i = 0; i < size; i++) {
		
			for(int j = i + 1; j < size; j++) {
				
				int first = ar.get(i);
				int second = ar.get(j);
				int sum = first + second;
				
				if((sum) % k == 0) {
					System.out.printf("i : %d, j : %d, i + j : %d V\n", first, second, sum);
					cnt++;
				} else {
//					System.out.printf("i : %d, j : %d, i + j : %d\n", first, second, sum);
				}
				
			
			}
		}
		
		return cnt;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int k = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int result = divisibleSumPairs(n, k, ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
