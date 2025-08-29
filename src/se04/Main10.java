package se04;

import java.time.LocalDate;

public class Main10 {
    public static void main(String[] args) {
        Student student1=new Student(); // shift+F6
        student1.code=1;
        student1.name="ali";
        student1.family="alipor";
        student1.bithdate= LocalDate.of(1995,12,11);

        Student student2=new Student(); // shift+F6
        student2.code=1;
        student2.name="ali";
        student2.family="alipor";
        student2.bithdate= LocalDate.of(1995,12,11);


        //System.out.println(student2.code+"--"+student2.name+"--"+student2.family+student2.bithdate+student2.locked);

        System.out.printf("%s-Fullname : %-10s  %10s - BD: %s - (%s)%n",student1.code,student1.name,student1.family,student1.bithdate,student1.locked);
        System.out.printf("%s-Fullname : %-10s %10s - BD: %s - (%s)%n",student2.code,student2.name,student2.family,student2.bithdate,student2.locked);
         // scae char
        // \n   new line
        // \t   tab
        // \r   return to first char of this line

        System.out.println("a\nb\tc\rd");


    }
}
