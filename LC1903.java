public class LC1903 {
    public static void main(String[] args) {
        String s ="4208";
        int x = Integer.parseInt(s);
        int max =0;
        while(x>0){
            int r= x%10;
            if(r>max){
                if(r%2!=0){
                  r =max;
                    String y=Integer.toString(x);
                    System.out.print(y);
                    break;
                }
            }
            else{
                System.out.print(" ");
            }
            x=x/10 ;
        }

    }
}
