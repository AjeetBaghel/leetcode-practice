import java.util.*;
public class ArraysSortingO1And2 {
    public static void main(String[] args) {
        int x[] = {2,1};
        int n = x.length;
        int l =0,m=0;
        int h =n-1;
        while(m<=h){
            if(x[m]==0){
                int t = x[l];
                x[l] =x[m];
                x[m] =t;
                l++;
                m++;
            } else if (x[m]==1) {
               m++;
            }
            else {
               int t =x[l];
               x[l] =x[h];
               x[h] =t;
               h--;
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(x[i]+" ");
        }
    }
}
