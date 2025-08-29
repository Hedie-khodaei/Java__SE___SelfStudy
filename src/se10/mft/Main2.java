package se10.mft;

public class Main2 {
    public static void main(String[] args) throws Exception {

        Car car1 = new Car("11b123","red");

        Car car2 = (Car) car1.clone();
        car2.setColor("black");


        System.out.println(car1.getColor());
        System.out.println(car2.getColor());
    }
}
