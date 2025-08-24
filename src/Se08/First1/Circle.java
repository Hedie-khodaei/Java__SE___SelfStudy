package src.Se08.First1;

public class Circle  implements Shape {

    private float radius;

    public Circle(int radius) {
        super();
    }

    public  float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        //this.radius = radius;
    }


    @Override
    public float getArea() {
        return radius * radius*3.14F;
    }

    @Override
    public float getPerimeter() {
        return radius * 2 *3.14F;
    }
}
