package se10.mft2;

import mft.Car;
import com.google.gson.Gson;
import mft.Taksi;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("11b123" , "red");
        Car car2 = new Car("22b123" , "black");

        car1.setNewData("DATA");

        System.out.println(car1);

        Taksi taksi =new Taksi("11b123","red",100);
        taksi.setNewData("Taksi Data");
        System.out.println(taksi);

       // ArrayList<Car> cars = new ArrayList<>();
       // cars.add(car1);
      //  cars.add(car2);

       //  Gson gson = new Gson();

         //serialize
       // System.out.println(gson.toJson(cars));


        //Deserialize
        //String jsonCar ="{\"plate\":\"11b123\",\"color\":\"red\"}";
        //Car car = gson.fromJson(jsonCar, Car.class);
       // System.out.println(car.getColor());

    }


}
