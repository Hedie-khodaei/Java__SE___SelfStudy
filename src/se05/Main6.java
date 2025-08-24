package src.se05;

import java.util.ArrayList;
import java.util.HashMap;

public class Main6 {
    public static void main(String[] args) {
      //  ArrayList<Integer> scores= new ArrayList<>();
        HashMap<String ,Integer> scores =new HashMap<>();

        System.out.println(scores.keySet());





         //Add
        scores.put("math",90);
        scores.put("lang",88);
        scores.put("geo",42);

        System.out.println(scores.keySet());


        //edit
      //  scores.put("math",70);
      //  System.out.println(scores);

      //  System.out.println(scores.get("math"));

       // System.out.println(scores.keySet());
       // System.out.println(scores.values());



       // scores.remove("lang");
        //System.out.println(scores);


    }
}
