package src.se05;

import src.se04.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        int option;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        while (true) {

            System.out.println("1)Add Student");
            System.out.println("2)Show Students");
            System.out.println("0)Exit");

            System.out.print("Enter Option :");
            option = Integer.parseInt(scanner.nextLine());
            System.out.println("-------------------------------------------");

            if (option == 0) {
                break;
            } else if (option == 1) {
                Student student = new Student();
                System.out.print("Enter Id : ");
                student.id =  Integer.parseInt(scanner.nextLine());

                System.out.print("Enter Name : ");
                student.name =  scanner.nextLine();

                System.out.print("Enter Family : ");
                student.family =  scanner.nextLine();

                studentList.add(student);
                System.out.println("Student added successfully");

            } else if (option == 2) {
                if(studentList.isEmpty()){
                    System.err.println("There is no students in the system !!!");
                }else{
                    System.out.println("Student List :\n");
                    for (Student student : studentList) {
                        System.out.printf("%4s - %10s %10s%n", student.id, student.name, student.family);
                    }
                }} else {
                System.out.println("Invalid option");
            }
            System.out.println("-------------------------------------------");

        }
    }
}


