package bakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p_15552 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(buf.readLine());
		
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(buf.readLine(), " ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
	}
		buf.close();
		
		bw.flush();
		bw.close();
	}
}
