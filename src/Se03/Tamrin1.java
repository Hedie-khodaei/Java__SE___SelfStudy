package src.Se03;

//import java.util.Scanner;

import java.util.Scanner;

public class Tamrin1 {
    public static void main(String[] args) {


        double weight, height, bmi;
        String sweight, sheight;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter yuor height (m))");
        sheight = sc.nextLine();
        height = Double.parseDouble(sheight);
        System.out.println("enter your weight (kg))");
        sweight = sc.nextLine();
        weight = Double.parseDouble(sweight);

        bmi = weight / Math.pow(height, 2);
        if (bmi < 18.5) {
            System.out.println("your bmi is" + bmi + "\n your are under weight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("your bmi is" + bmi + "\n your are normal");
        } else if (bmi > 25) {
            System.out.println("your bmi is" + bmi + "\n your are ower weight");
        } else {
            System.out.println("there is invalid");


        /*
        double weight,height,bmi;
        String sweight, sheight;
        Scanner sc=new Scanner(System.in);
        System.out.println("heighr (m)");
        sheight =sc.nextLine();
        height=Double.parseDouble(sheight);
        System.out.println("weight (kg)");
        sweight=sc.nextLine();
        weight=Double.parseDouble(sweight);


        bmi=weight / Math.pow(height ,2);
        */
        }
    }

}
