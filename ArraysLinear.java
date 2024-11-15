import java.util.*;
public class ArraysLinear {
    public static int linearSearch(int arr[] ,int key){
        Scanner sc = new Scanner(System.in);
        int no = 0;
        System.out.print("Enter the elments :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(key ==arr[i]){
               no =arr[i];
            }
        }
        return no;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array :");
        int x = sc.nextInt();
        int arr[] =new int[x];
        int key =10;
         int ans =linearSearch(arr,key);
        System.out.print("Element found at index :"+ans);


    }
}
