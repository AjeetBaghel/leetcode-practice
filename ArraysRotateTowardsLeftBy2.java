  import java.util.*;
public class ArraysRotateTowardsLeftBy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k how many times you want to rotate :");
        int k = sc.nextInt();
        int x[] = {1,2,3,4,5,6,7,8,9,};
        int n  = x.length;
        k = k%n;
        int temp1 =x[1];
        int temp2 =x[0];
        int temp3 =x[2];
        for (int i =3; i <=n-1; i++) {
            x[i-3] = x[i];
        }
        x[n-2] = temp1;
        x[n-1] = temp2;
        x[n-3] = temp3;
        for (int i = 0; i < n; i++) {
            System.out.print(x[i]);
        }

    }
}
