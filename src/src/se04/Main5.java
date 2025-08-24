package src.se04;

import java.time.LocalDate;

public class Main5 {
    public static void main(String[] args) {
       // Student std1; بدون اختصاص حافظه در هیپ
       src.se04.Student student=new src.se04.Student(); //شی گرا    (شروع)   (جدید شی رو اینجوری مینویسیم چون تشخیص میده حروف کوچک(student) student std1(شی ما)
        student.code=1;
        student.name="ali";
        student.family="alipor";
        student.bithdate= LocalDate.of(1995,12,11);

        System.out.println(student.code+"--"+student.name+"--"+student.family+student.bithdate+student.locked);

       // System.out.println(std1);
    }
}
