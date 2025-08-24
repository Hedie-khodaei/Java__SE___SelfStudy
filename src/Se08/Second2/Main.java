package src.Se08.Second2;

import src.Se08.First1.Circle;

import java.util.ArrayList;

// چارشنبه   چهارشنبه  چارشنمبه
//  آگر داده ها دارید که مقدار ثابتی دارند ولی کلافه کرده مارو مثل روز های هفته هرکی یه جوری مینوسه و از طرهی روز های هفته ثابت
public class Main {
    public static void main(String[] args) {

        WeekDay day = WeekDay.wednesday;
        System.out.println(day.name());

        String d="true";
        WeekDay day1 = WeekDay.wednesday;
        // WeekDay day2 = WeekDay.valueOf(d);
        Student student = new Student();
        Circle circle = new Circle(10);
        int a=1;
        Float f=3.4F;
        ArrayList arr=new ArrayList();
        arr.add(1);
        arr.add("salam");

        Object obj1 =student;
        Object obj2 =circle;

        Circle c2= (Circle) obj2;
        Student sttd = (Student) obj1;

        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());

    }
}
