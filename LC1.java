public class LC1 {
    public static void main(String[] args) {
        int x[] ={1,2,3,4};
        int target = 6;
        // int flag = 0;
       // int i,j=0;
        for (int i = 0; i < x.length-1; i++) {
            if(x[0]+x[1]==target){
                System.out.print(i+" ");
            }
        }
    }
}
