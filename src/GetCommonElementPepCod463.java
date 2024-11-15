import java.util.*;
public class GetCommonElementPepCod463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  Size of First array ");
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        System.out.print("Enter the Elements of 1st Array");
        for (int i = 0; i < a1.length; i++) {
             a1[i] = sc.nextInt();
             System.out.print(a1[i]);
        }
        System.out.print("Enter the  Size of 2nd array ");
        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        System.out.print("Enter the Elements of 2nd Array");
        for (int i = 0; i < a1.length; i++) {
            a2[i] = sc.nextInt();
            System.out.print(a2[i]);
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
    }
}
