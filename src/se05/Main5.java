package src.se05;

import java.util.HashSet;

//set مقدار تکرری قبول نمیکنه
//hash set
// اندیس نداره یعنی دسترسی نداره نتیجه ویرایش نداره
public class Main5 {
    public static void main(String[] args) {
        HashSet<String> nanes = new HashSet<>();

        nanes.add("reza");
        nanes.add("reza");
        nanes.add("reza");
        nanes.add("ali");
        nanes.add("ali");
        System.out.println(nanes);

        nanes.remove("ali");
        System.out.println("mpohsen");
        System.out.println(nanes);



    }
}
