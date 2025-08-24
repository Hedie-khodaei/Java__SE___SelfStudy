package src.se06.oop;

import java.util.ArrayList;
// متد مواد اولیه کارخانه است که مواد بدیم بهش میتوانیم ازش محصول بگیریم وقتی متد تعریف میشه نوع محصول را تو توعریف نوشته باشه
// متد ها در جاوا یک خروجی دارند
// 1)acces modifier 2)ورودی input-type 3)name (input)) ورودی هاش رو
public class Circle {



  public void sayhello(String name)       //   // Method signature  (output type  name (inputs))  بخشی از متد د سطح اول تعریف میشود
  {// Method Boody  عملیات ها


       int a = 1;
       System.out.println("hello" + name);
   }

       float circleArea ( int radius){
           float aarea = radius * radius * 3.14F;
           //200000000000000000000
           return aarea;

       }


       float mohit ( int radius){
           return radius * 2 * 3.14F;
       }

       Float mohit ( float radius){
           return null;
       }
   }
