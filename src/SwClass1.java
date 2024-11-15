import java.util.*;
public class SwClass1 {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
        int k=3;
        int s= 0,e=0;
        int p = 1;
        int maxp = 0;
            while (e<a.length){
             if(e-s+1>k){
                 p =p/a[s];
                 s++;
             }
             p =p*a[e];
             maxp =Math.max(maxp,p);
             e++;
            }
            System.out.print(maxp);


    }
}
