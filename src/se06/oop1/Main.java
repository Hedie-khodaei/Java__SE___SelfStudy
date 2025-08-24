package src.se06.oop1;

import java.util.Scanner;

//1  encapsolation   محفظه سازی  set:تغییر   get:دریافت
// دسترسی مستقیم به داده حذف کردیم  دوتا متد مینویسیم متد بهش (میدیم)getname name   ومتد set name از کاربرمیگیره name را وset  میکنیم
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        Student student1 = new Student(1,"alipour","alipour","123","Marlik","0993");
       // Student student1 = new Student();
       // student1.setName("ali");
      //  student1.setFamily("alipour");
       //student1.getAllData("ali","alipour");
       // System.out.println(student1.getFullName());
        //System.out.println(student1.getName()+" "+student1.getFamily());

        System.out.println();
    }
}
