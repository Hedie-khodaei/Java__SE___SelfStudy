package src.Se07.se07Second;

public class Main {
    static boolean methodA(){
        System.out.println("Mathod A");
        return false;
    }
    static boolean methodB(){
        System.out.println("Method B ");
        return true;
    }
    public static void main(String[] args) {
        System.out.println(methodA() && methodB());

    }
}
