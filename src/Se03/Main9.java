package src.Se03;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {

      //  int grade = 21;
/*
        String grade = "21";
       //int grade=Integer.parseInt(grade)

        switch (grade){
            case "1":
                System.out.println("gg");
                break;
            case "2":
                System.out.println("bb");
                break;
            case "3":
                System.out.println("cc");
                break;
            default:
                System.out.println("wrong");

*/

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number");
                String strNum =sc.nextLine();
                int num=Integer.parseInt(strNum);


                if (num % 2 ==0 ){
                         System.out.println("zog");
                      }else {
                         System.out.println("frd");
                     }

        }
    }

