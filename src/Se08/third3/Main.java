package src.Se08.third3;

import java.sql.DriverManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");

        try {
             int a = Integer.parseInt("allli");

            // DriverManager.getConnection("","","");  database  squal server

            //int[] numbers = new int[3];
           // numbers[11] = 1;


            System.out.println(10 / 0);
            System.out.println("End");
        } catch (Exception e) {
            System.out.println("Error dad"+e.getMessage()+" "+e.getClass());
        }
        System.out.println("End");
    }
}
