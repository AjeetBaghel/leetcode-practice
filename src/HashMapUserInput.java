import java.util.*;
import java.util.HashMap;

public class HashMapUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String , Integer> h1 = new HashMap<>();
        System.out.print("Enter The Size of an array :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter The Elements of an Arrays :");
        for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            h1.put(String.valueOf(i),arr[i]);
        }


        for(Map.Entry< String, Integer > i : h1.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
}
