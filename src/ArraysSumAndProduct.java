import java.util.*;
public class ArraysSumAndProduct {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int sum =0;
        long pro =1;
        // sum &&product
        for (int i = 0; i < arr.length; i++) {
            sum =sum+arr[i];
              pro = pro*arr[i];
        }
       System.out.print("Sum is : "+sum +" And product is :"+pro);



    }
}
