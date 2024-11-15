import java.util.*;
public class ArraysReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4};
        System.out.print("Before Reverse :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        int f=0,l=a.length-1;
        System.out.print("Reverse arr:");
        while (f<l){
        int temp =a[l];
        a[f]=a[l];
        a[l]=temp;

        f++;
        l--;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
     }




    }
}
