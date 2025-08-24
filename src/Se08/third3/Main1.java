package src.Se08.third3;

public class Main1 {
    public class ArithmeticException extends RuntimeException {
        private static final long serialVersionUID = 1L;

        public ArithmeticException(){super();}

        public ArithmeticException(String s){super(s);}

    }


    /*
    public static void main(String[] args) {
        System.out.println("start");

        //connect........disconnect

        try {
            System.out.println("connect");
            //String aa =null;
          // System.out.println(aa.toLowerCase());
//         int a = Integer.parseInt("allli");
            //int[] numbers = new int[10];
            //numbers[11] = 1;
            // System.out.println(numbers[1] /0 );
          //  System.out.println("disconnect");
            System.out.println(10 / 0);
           // System.out.println("disconnect");
        } catch (ArithmeticException e) {
            System.out.println("خطای محاسباتی");
           // System.out.println("disconnect");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("خطای اندیس");
        } catch (NumberFormatException e) {
            System.out.println("خطای تبدیل عددی");
           // System.out.println("disconnect");
        } catch (Exception e) {
            System.out.println("خطای ناشناخته-  تماس با ادمین");
        }finally {
            System.out.println("disconnect");
           // System.out.println("Error dad"+e.getMessage()+" "+e.getClass());
        }
        System.out.println("End");

     */
    }


