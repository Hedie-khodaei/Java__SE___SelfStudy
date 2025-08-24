package src.Se08.First1;

public class RectAngle implements Shape {
    private float width;
    private  float height;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public RectAngle(float width, float height) {
        this.width = width;
        this.height = height;


    }


    @Override
    public float getArea()  throws Exception{

         return width * height;
    }

    @Override
    public float getPerimeter(){
        return 2*(width + height);
    }
}
