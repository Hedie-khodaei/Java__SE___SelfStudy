package src.Se08.First1;
// interface /defult have method body  دارای متد بدون بدنه است با کلمه کلیدی (دیفالت) میتونه با بدنه باشه
public class Main {
    public static void main(String[] args) //throws Exception// {
    {

        Circle circle = new Circle(10);
        square square = new square(5);
        RectAngle rectangle = new RectAngle(10,20);
        System.out.println(circle.getRadius());
        System.out.println(square.getArea());
        try {
            System.out.println(rectangle.getArea());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
