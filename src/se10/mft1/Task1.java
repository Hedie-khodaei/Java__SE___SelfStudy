package se10.mft1;

public class Task1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100_000_000; i++) {
            System.out.println("++++++++");

        }

    }


}
