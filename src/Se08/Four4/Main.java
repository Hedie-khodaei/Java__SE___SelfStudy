package src.Se08.Four4;
//library :  برنامه های از قبل نوشته شده/ برای هدف خاص /  برای پیشگیری از اختراع مجدد چرخ
//library : 1 +dd to project
//library : 2 + import
//library : 3 --> use
//library : prefix : .jar    like : Lombook .jar
public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        //Disign Pattern ---> Builder
        Person.setId(1).setName("hedi");
                //.setEmail("@hedi.com");

       // pretty format---- > alt + cntrl + l
        //.setId(1);
        //  .setName("ali");
        // .setFamily("alipour");
        //  .setEmail("hedi@gmail.com");
    }
}
