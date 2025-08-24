package src.se05;

import java.util.ArrayList;

//array list اجازه خذف و اضافه میده (داده ها و عملیات مدیریت میکنه )
// arraylist مقدار تکرار/حذف و اضافه/ویرایش/ تر تیب مجاز  (index)داره
// array list   ظاهر برنامه نویسی دارد
//array list    تعداد/ نوع داده ثابت نباد قابل تغییر باشد و قابل تغییر هستش
//array list    برخلاف array فقط از نوع کلاس میتونه باشه   علامت و    <>       و
public class Main3 {
    public static void main(String[] args) {
        ArrayList myarrayList = new ArrayList();

        myarrayList.add(1);
        myarrayList.add(1);
        //   myarrayList.add(1);
        //  myarrayList.add(true);
        //  myarrayList.add(3.4F);

        System.out.println(myarrayList);
        ArrayList myarraylist = new ArrayList();
        // Add to end
        myarrayList.add("reza");
        myarrayList.add("ali");
        myarrayList.add("mohsen");
        //   myarrayList.add(1);
        //  myarrayList.add(true);
        //  myarrayList.add(3.4F);

        //insert to index
        myarrayList.add(1, "MOHSEN");

        System.out.println(myarrayList);

        //update
        myarrayList.set(1, "alireza");

        // delete

        // myarrayList.remove(0);
        //  myarrayList.remove("mohsen");

        System.out.println(myarrayList);
        // Access دسترسی
        System.out.println(myarrayList.get(2));


        for (int i = 0; i < myarrayList.size(); i++) {
            System.out.println(myarrayList.get(i));
        }
    }
}


