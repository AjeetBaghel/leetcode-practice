public class PrintSubArray {
    public static void main(String[] args) {
        int x[] ={1,2,3};
        int n = x.length;
        for (int i = 0; i < n; i++) {
           System.out.print(x[i]+",");
            for (int j = i+1; j < n; j++) {
                System.out.print("("+ x[i]+","+ x[j]+")"+",");
            }

        }
    }
}
