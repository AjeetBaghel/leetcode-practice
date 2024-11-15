import java.util.*;
public class ArraysSortingOAnd1 {
   public static void main(String[] args) {
       int x[] = {0,1,0,1,1,0,1,0};

       //    Solved by two pointer
//       int n = x.length;
//       int i = 0,j=0;
//        while (j<n){
//            if(x[j]==0){
//                j++;
//            }
//            else{
//                int temp = x[j];
//                x[j]= x[i];
//                x[i] = temp;
//                i++;
//                j++;
//            }
//        }
//       for (int k = x.length-1; k >0 ; k--) {
//           System.out.print(x[k]);
//       }

       //     Solved by DNF
       int m = x.length;
       int l=0,h=m-1;
       while (l<=h){
           if(l==0){
               int t = x[l];
               x[l] = x[h];
               x[h] =t;
               l++;
             h--;
           }
           else{
               int t = x[l];
               x[l] = x[h];
               x[h] =t;
               h--;
           }
       }
       for (int i = 0; i <x.length-1 ; i++) {
           System.out.print(x[i]);
       }

   }
}
