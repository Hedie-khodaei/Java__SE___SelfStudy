package se05;
// ساختمان داده ها
// الگوریتم جستجو ومرتب سازی
//یه داده چند مقداری
//دسترسی به (مقدار تکرار(ویراش(حذف(اضافه(ترتیب   ساختمان داده ای بر اساس همینا باهم تفاوت دارن
// ارایه سریع ترprimitive
//aray list ازنوع کلاس فقط
// array هم primitive  هم wrapper class// }
//heap  مقدار داخل
//تعدادش ثابت ارایه عدد صحیح نمیشه ریخت حذف و اضافه نمیشه کرد(مقدار تکرار میشه(ویراش و تر تیب هم میشه
public class Main1 {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "reza";
        names[1] = "ali";
        names[2] = "ali";

        names[2] = null;




        for (int i = 0; i < 3; i++) {
            System.out.println("hello" + names[i]);
        }

            //System.out.println("helo" +names);

            // System.out.println(names);

            //  names[3] ="ahmad";

        }
    }
