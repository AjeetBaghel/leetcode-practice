public class ArraysRotateTowardsRightBy1 {
    public static void main(String[] args) {
     int x[] = {1,2,3,4,5};
     int n = x.length;
     int temp =x[n-1];
        for (int i = n-2; i >= 0; i--) {
            x[i+1] = x[i];
        }
        x[0] =temp;
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }
    }
}
