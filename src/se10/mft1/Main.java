package se10.mft1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5000);


        Thread task1 = new  Thread ( new Task1());
        Task2 task2 = new Task2();

        task1.start(); //*********************
        task2.start(); //.....................
    }
}
