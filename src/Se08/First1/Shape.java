package src.Se08.First1;
//if abstract class -----> only contains abstract method
// not ::::::::::::property  /method +  body
// interface /defult have method body  دارای متد بدون بدنه است با کلمه کلیدی (دیفالت) میتونه با بدنه باشه


public interface Shape {

   public abstract   float getArea() throws Exception;
    public abstract float getPerimeter();

    default int add(int a, int b) {
        return a + b;

    }

    }


