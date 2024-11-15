import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
//        HashMap<String,Integer> map = new HashMap<>();
        // Insert
//        map.put("Ajeet",20);
//        map.put("nano",22);
//        map.put("sam",12);
//        // Duplicate-->> override before value // Update
//        map.put("nano",22);
//
//        System.out.print(map);

        // Delete(only by key no need of remov of value)
      //  map.remove("Ajeet");  // map.remove("nano",22);

        // Access(corresponding value of key)
       // System.out.println(map.get("nano"));

        // Checking values is preesent or not
        //System.out.print(map.containsKey("asdv")); // ans in true or false

        // How to Print

//        for(Map.Entry<String,Integer> i: map.entrySet()){   // key and value dono ek sath
//            System.out.print(i.getKey() +""+i.getValue());
//
//        }

        // for indiviually print of key(only for key)
//
//        for(String i : map.keySet()){
//            System.out.print(i);
//        }
//
//        // only for value
//
//        for(int i : map.values()){
//            System.out.print(i);
//        }


        // frequency of character

        // By getOrDefault method
        HashMap<String,Integer> map = new HashMap<>();
        String s ="abcba";
        for(Map.Entry<String,Integer> i: map.entrySet()){
          //  char ch =s.charAt((i));
            map.put(s, map.getOrDefault(s,0)+1);

        }
        System.out.print(map);

    }
}
