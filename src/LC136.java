import java.util.*;
public class LC136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x [] = {1,1,2,3,3,4,4};
        int a =0;
        for (int i = 0; i < x.length; i++) {
            a = a^x[i];
        }
        System.out.print(a);
    }
}
