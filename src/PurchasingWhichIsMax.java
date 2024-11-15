import java.util.*;
public class PurchasingWhichIsMax {
    public static int Max(int x[],int l){
        for (int i = 0; i < x.length; i++) {

            if(x[i]>l){
                l=x[i];
            }
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x[] = {100,23,234,1500,500};
        int l =0;
        int ans = Max(x,l);
        System.out.print(ans);

    }
}
