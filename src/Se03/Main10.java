package src.Se03;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name :");
        String name=sc.nextLine();

        System.out.println("Enter Family :");
        String family=sc.nextLine();

        System.out.println("Enter Age :");
       int age= Integer.parseInt(sc.nextLine());

        System.out.println(name+"-"+family+"-"+age+"years old ");


    }
}
