package se10.mft;

public class Taksi extends Car {
    private int price;

    public Taksi(String plate, String color, int price) {
        super(plate, color);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public Taksi setPrice(int price) {
        this.price = price;
        return this;


    }
}
