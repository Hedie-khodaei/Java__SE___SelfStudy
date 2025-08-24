package src.se04;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        //مقادیر ابتدایی
        Scanner scanner = new Scanner(System.in);
        int count =0;
        // دریافت ورودی از کاربر و تبدیل به عدد صحیح
        System.out.println("enter number:");
       // int num = 17;
        int num= Integer.parseInt(scanner.nextLine());//برنامه تشخیص عدد اول


        //شمارش تعداد مقسوم علیه ها
        for (int i =1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("count :"+count);


        // تشخیص عدد اول دارای 2 مقسوم علیه
        if (count == 2){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }
}
