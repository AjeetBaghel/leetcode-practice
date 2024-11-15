import java.util.*;
public class DSA {     // DSA 1.... Yash sir
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elments :");
        int  x= sc.nextInt();
        int arr[] = new int[x];
        System.out.print("Enter elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        // print elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
