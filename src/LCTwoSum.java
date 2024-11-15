import java.util.*;
import java.util.HashMap;

public class LCTwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {0,1,2,3,4,5};
        int ans[] =new int[2];
        int target =4;
       // HashMap<Integer,Integer> mp = new HashMap<>();
//
//        mp.put(arr[0],0);
//        mp.put(arr[1],1);
//        mp.put(arr[2],2);
//        mp.put(arr[3],3);
//       int x = mp.get(arr[1]);
//        System.out.print(x);
//        System.out.print((mp.containsKey(arr[6])));
//        for(Map.Entry<Integer,Integer> i:map.entrySet()){
//           map.put(arr[i].getKey(),i.getValue());
//
//        }


        // Iterate
     //   Set<Integer> st = mp.keySet();
       // System.out.print(st); // print only keys
//        for(Integer k:st){
//            System.out.print("Keys ="+k+" values ="+mp.get(k)+" ,");
//        }
        for(int i =0;i<2;i++){
            for (int j = i+1; j <2; j++) {
                 if(arr[i]+arr[j]==target){
                    ans= System.out.print(ans[i]+" "+ ans[j]);
                     break;
                 }
            }
        }
    }
}
