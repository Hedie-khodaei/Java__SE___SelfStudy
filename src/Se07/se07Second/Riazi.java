package src.Se07.se07Second;

public class Riazi {
    //متد همنام به شرطی که تعداد یا نوع ورودی ها متفاوت باشد
    //overload Method
    public int addInt(int aInt, int bInt) {
        System.out.println("Add Integer");
        return aInt + bInt;
    }
    public float addFloat(float afloat, float bfloat) {
        System.out.println("Add Floats");
        return afloat + bfloat;
    }
    public String addString(String asting, String bstring) {
        System.out.println("Add Strings");
        return asting+bstring;
    }
}
