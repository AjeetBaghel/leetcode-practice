import jdk.jfr.Frequency;

import java.util.*;
public class HashMap2 {
    public static void main(String[] args) {

    String s = "abbbcaa";
    Scanner sc = new Scanner(System.in);

    HashMap<Character,Integer> mp = new HashMap<>();

//        for (int i = 0; i <s.length() ; i++) {
//            char ch = s.charAt(i);  // Confusion in this line
//
//            mp.put(ch, mp.getOrDefault(ch,0)+1);
//        }

        for(char ch: s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        System.out.print("Frequencies are " +mp);
}
}