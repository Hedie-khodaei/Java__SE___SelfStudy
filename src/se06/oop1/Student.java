package src.se06.oop1;
//property به فیلد های داده ای میگیم به صورت تخصصی که دارای getter و setter هستند
// get: دریافت      set:تغییر
//@Entity اجباری نیست
public class Student {
    //@Id

    private int id;
    private String name;
    private String family;
   private String nationalCode;
   private String address;
   private String phone;
    //متد سازنده(موقع تولد صدا زده میشه میشه)
    //    (constractur متدی هم نام کلاس(قالبا public  نوع خروجی void نداشته باشه
    //(constractur + No Argoman
    // (constractur +  prameter -->Argument    به string  میگیم آرگومان
   // public Student(String name, String family) {

    public Student(int id, String name, String family, String nationalCode, String address, String phone) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.nationalCode = nationalCode;
        this.address = address;
        this.phone = phone;

   // public void  getAllData(String n, String f){
       // System.out.println("زمانی که تو حافظه تعریف شد");
      //  System.out.println("+++ Created");
      // this.name = name;// کلمه this واسه متد های تکراری
      //  this.family = family;

    }

    // Encapsoulation :دسترسی حافظه یه صورت مستقیم از بین میبره
    // Filed -> private -> getter/setter

    String getName(){
        return name;
    }

   void setName(String n){
        name = n;

     }
     String getFamily(){
        return family;
     }

     void setFamily(String f){
        family = f;
     }

   // String getFullName(){
       // return name+" "+family;
     //}


    //بازنویسی متد
    // @   Annotation   توضیح  +  عملیات    +اجباری نیست
    @Override
     public String toString(){
       // Object
      return name+" "+family;
     }

    @Override
    protected void finalize() throws Throwable {
        //super.finalize();
       // System.out.println("از حافظ پاک شد");
        System.out.println("--Deleted");

    }
}

