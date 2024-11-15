public class ArraysReverseForLoop {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int n = a.length;
        for (int i = 0; i < n/2; i++) {
            int temp = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = temp;
        }
        System.out.print("After Reverse :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
