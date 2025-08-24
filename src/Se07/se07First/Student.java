package src.Se07.se07First;

public class Student extends person{
    //دانشجو abstract محسوب نمیشه چون دانشجو معمولی داریم آنلاین داریم
    // کار مشخصی دارد ولی شخص باید معلوم بشه
    //جاوا ارث بری چند گانه نداریم

    private float avrage;

    public float getAvrage() {
        return avrage;
    }

    public void setAvrage(float avrage) {
        this.avrage = avrage;
    }
}

