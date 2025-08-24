package src.se05;

import java.util.ArrayList;
import java.util.Scanner;

public class Tamrin2 {
    public static void main(String[] args) {

        int choice;
        String choicestr;

        Scanner input = new Scanner(System.in);
        ArrayList<simcard> simcards = new ArrayList<>();

        do {
            System.out.println("1) Add simcard");
            System.out.println("2) Find by operator");
            System.out.println("3) Sum of owner");
            System.out.println("4) Show list");
            System.out.println("5) Exit");
            System.out.println("-------------------------------------------------");

            System.out.println("please enter your choice");
            choicestr = input.nextLine();
            choice = Integer.parseInt(choicestr);

            switch (choice) {
                case 1:
                    simcard simcard = new simcard();
                    System.out.println("please enter your id");
                    simcard.id = Integer.parseInt(input.nextLine());
                    System.out.println("please enter your operator");
                    simcard.operator = input.nextLine();
                    System.out.println("please enter your number");
                    simcard.number = input.nextLine();
                    System.out.println("please enter your owner");
                    simcard.owner = input.nextLine();
                    simcards.add(simcard);
                    System.out.println("simcard added successfully");
                    System.out.println("----------------------------------------");
                    break;

                case 2:
                    System.out.println("under construction.........!");
                    System.out.println("-------------------------------------------");
                    break;

                case 3:
                    System.out.println("under construction.........!");
                    System.out.println("--------------------------------------------");
                    break;
                case 4:
                    if (simcards.isEmpty()) {
                        System.out.println("no simcards found");
                        System.out.println("---------------------------------------");
                    } else {
                        for (simcard simcard1 : simcards) {
                            System.out.println("4d operator name:%10s and number is---> %11s and the owner is %5s%n"+simcard1.id+simcard1.operator+simcard1.number+simcard1.owner);
                            System.out.println("----------------------------------------------------------------------------");

                        }
                    }
                case 5:
                    System.out.println("Exitting");
                    break;
                default:


            }
        }while (choice != 5) ;
        }
    }
















