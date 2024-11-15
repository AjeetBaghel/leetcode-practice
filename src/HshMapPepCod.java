import java.util.*;
public class HshMapPepCod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String str = sc.nextLine();
        HashMap<Character,Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(hm.containsKey(ch)){
                int oldfrequency = hm.get(ch);
                int newfre = oldfrequency+1;
                hm.put(ch,newfre);
            }
            else{
                hm.put(ch,1);
            }
            
        }
        int mamximumfrechar = 0;
        char ch1 = str.charAt(0);
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(mamximumfrechar<hm.get(ch)){
                mamximumfrechar = hm.get(ch);
                ch1 = ch;
            }
//            mamximumfrechar = Math.max(mamximumfrechar, mamximumfrechar);
        }
        System.out.println(ch1+" "+mamximumfrechar);

    }
}
