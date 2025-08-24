package src.Se08.third3;
//throwable   کلاس پدر همه خطاهاست
//throws    ایه تابع مینویسیم نشان دهنده که خطایی در این تابع ممکن استsignature  کلمه ای است که در متد  رخ بده
//throw     برای زمان که خودمون عمدا میخواهیم یک خطایی رخ دهد
//throw      به معنی     رخ    دادن
public class ProductNotFoundException extends Exception {

    public ProductNotFoundException(String message) {
        super(message);
    }
}
