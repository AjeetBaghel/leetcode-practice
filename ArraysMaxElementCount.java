public class ArraysMaxElementCount {
    public static void main(String[] args) {
        int x[] = {1,1,0,1,1,1};
        int max =Integer.MIN_VALUE;
                int count =0 ;
        for (int i = 0; i < x.length; i++) {
            if(x[i]>max){
                max = x[i];
                 count=0;
            }
                 if(x[i]==max){
                     count++;
                 }
        }
        System.out.print("Max is : "+max +" And Max Count is : "+count);
    }
}
