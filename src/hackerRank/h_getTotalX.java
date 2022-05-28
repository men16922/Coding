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

public class h_getTotalX {
	public static int getTotalX(List<Integer> a, List<Integer> b) {
		int cnt = 0;
		int current = a.get(a.size() - 1);
		int flag;

		while (current <= b.get(0)) {
			flag = 0;

			for (int i : a) {
				if (current % i != 0) {
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				for (int i : b) {
					if (i % current != 0) {
						flag = 1;
						break;
					}
				}
			}

			if (flag == 0) {
				cnt++;
			}

			System.out.printf("cnt: %d, current: %d, flag: %d%n", cnt, current, flag);
			current++;
		}
		return cnt;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int total = getTotalX(arr, brr);

		bufferedWriter.write(String.valueOf(total));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
