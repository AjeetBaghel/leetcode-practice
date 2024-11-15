import java.util.*;
public class LC121 {
    public static void main(String[] args) {
        Scanner ssc = new Scanner(System.in);
        int x[] ={7,1,5,3,6,4};
        int n = x.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j =i+1; j < n; j++) {
                int profit = x[j]-x[i];
                if(profit >max){
                    max = profit;
                }
            }
        }
        System.out.print(max);
    }
}
