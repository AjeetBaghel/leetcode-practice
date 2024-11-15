import java.util.*;
public class MaxSubarraySumLc53 {
    public static void main(String[] args) {
        int[] nums = {-1};
        int cs =0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            cs +=nums[i];
            ms = Math.max(cs,ms);
            if(cs<0){
                cs =0;
            }
        }
        System.out.print(ms);

    }
}
