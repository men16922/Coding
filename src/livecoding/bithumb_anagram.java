package livecoding;

import java.util.Arrays;

public class bithumb_anagram {
    public static void main(String[] args) {
        String first = "abt";
        String second = "bat";

        char [] fArray = first.toCharArray();
        char [] sArray = second.toCharArray();
        Arrays.sort(fArray);
        Arrays.sort(sArray);

        first = new String(fArray);
        second = new String(sArray);
        if(first.equals(second)) {
            System.out.println("ANAGRAM!");
        }




    }
}
