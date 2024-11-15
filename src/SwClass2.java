import java .util.*;
public class SwClass2 {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
        int n = a.length;
        int sum =0;
        int max = Integer.MIN_VALUE;
        int lenmax =0;
        for (int i = 0; i < n; i++) {
            sum +=a[i];
            for (int j = 1; j <n ; j++) {
                sum +=a[j];
                if(sum%2!=0){
                     lenmax = Math.max(max,sum);
                }

            }

        }
        System.out.print(lenmax);
    }
}
