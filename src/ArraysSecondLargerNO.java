import java.util.*;
public class ArraysSecondLargerNO {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int arr[] = {-1,-2,-4,-5,-3};
      int fl = Integer.MIN_VALUE, sl =Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) {
          if(arr[i]>fl) {
              fl=arr[i];
          }
      }
      for (int i = 0; i < args.length; i++) {
          if(arr[i]>sl && arr[i]<fl){
              sl=arr[i];
          }
      }
      System.out.print("first max is :"+fl+" And second max is :"+ sl);
  }
}
