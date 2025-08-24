package src.Se08.First1;

public class square implements Shape {
    private float side;

    public square(float side) {
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public float getArea() {
        return side * side;
    }

    @Override
    public float getPerimeter() {
        return side*4;
    }
}
