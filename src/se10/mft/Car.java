package se10.mft;

import com.google.gson.Gson;

import java.io.Serializable;

public class Car implements Serializable ,Cloneable{
   private String plate;
   private String color;
   private String newData;


    public Car(String plate, String color) {
        this.plate = plate;
        this.color = color;
    }

    public String getPlate() {
        return plate;
    }

    public Car setPlate(String plate) {
        this.plate = plate;
        return this;
    }

    public String getColor() {
        return color;
    }

    public String getNewData() {
        return newData;
    }

    public Car setNewData(String newData) {
        this.newData = newData;
        return this;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       // Car newCar = new Car(plate, color);
        return super.clone();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();

        return gson.toJson(this);
                //"Car{" +
               // "plate='" + plate + '\'' +
              //  ", color='" + color + '\'' +
              //  '}';
    }
}
