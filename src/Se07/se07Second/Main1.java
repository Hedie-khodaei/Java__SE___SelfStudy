package src.Se07.se07Second;

public class Main1 {
    public static String methodA() {
        Riazi riazi = new Riazi();
        Object object = new Object();


        System.out.println(riazi.addInt(1, 2));
        System.out.println(riazi.addFloat(1.1f, 2.2f));
        System.out.println(riazi.addString("a", "b"));


        return "a";
    }

}
