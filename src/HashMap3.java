import java.util.*;
public class HashMap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = "abbbcbbbaac";

        HashMap<Character,Integer> mp = new HashMap<>();

        for (int i = 0; i <x.length() ; i++) {
            char ch = x.charAt(i);
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> i : mp.entrySet()){
            System.out.print(i.getKey() +""+i.getValue());
        }

    }
}
