package src.Se07;

public class Employee {
      public String name; //instance property      هر شی از کارمندن بسازی یه دونه واس خودش جدا داره
       static String department;// class property  توکلاس  مال کلاس کارمدان و درکل برنامه یه دونه متغییر دپارتمنت  داره
    // همه به همین دسترسی داند
         public void salam(){}

       public static float test(){
              //  Employee employee = new Employee();
              // employee.salam();
             // System.out.println(name);
              System.out.println(department);
              return 1.0F;
       }
}
