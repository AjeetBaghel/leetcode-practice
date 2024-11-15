import java.util.*;
public class LC287 {
    public static void main(String[] args) {
        int x [] ={1,2,2,3,4};
        int n = x.length;
        int a =0;
        for (int i = 0; i < n-1; i++) {
            a =x[i]^x[i+1];
        }
        System.out.print(a);

//        int check[] =new int[n-1];
//        for(int i =0;i<x.length;i++){
//            check[x[i]] =1;
//        }
//        for(int i =0;i<check.length;i++){
//            if(check[i]==0){
//                ans =i;
//            }
//        }
//        System.out.print(ans);
    }
}
