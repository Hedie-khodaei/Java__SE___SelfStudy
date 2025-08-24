package src.se06.oop;

public class Main1 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.sayhello("hello");

        // call Method  صدا کردن متد
        // فراخوانی متد invok
       // System.out.println(circle1.sayhello());
        System.out.println( circle1.circleArea(20));
        System.out.println(circle1.circleArea(10));
        System.out.println(circle1.mohit(10));

      // System.out.println(circle1.circleArea(25));

        Mostatil mostatil1 = new Mostatil();
        System.out.println(mostatil1.mohit(20,12));
  //   system:class
  //   printIn:method
    }
}
