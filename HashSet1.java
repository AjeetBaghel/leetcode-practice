import java.util.*;
public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>();

        st.add(1);
        st.add(2);
//        System.out.print(st);
        // clear and remove


        // Iterate
//        for(int i:st){
//            System.out.print(i); // also by Iterator
//        }

        Iterator it = st.iterator();
        while(it.hasNext()){
            System.out.println((it.next()));
        }

        System.out.println("size is :"+st.size());


    }
}
