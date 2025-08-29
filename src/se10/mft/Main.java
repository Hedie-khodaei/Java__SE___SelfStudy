package se10.mft;

public class Main {
    public static void main(String[] args) {
        /*
        Jam jam = new Jam();
        System.out.println(jam.amaliat(1, 2));

        Tafrigh tafrigh = new Tafrigh();
        System.out.println(tafrigh.amaliat(1, 2));

        Zarb zarb = new Zarb();
        System.out.println(zarb.amaliat(1, 2));

         */

       // Riazi jam = new Riazi() {
          //  @Override
         //   public float amaliat(int a, int b) {
          //      return a+b;
       //     }
      //  };
       //
        //System.out.println(jam.amaliat(1, 2));
        ///    ..................جایگزین روش بالا
        Riazi jam = (int a, int b) -> a+b;
        System.out.println(jam.amaliat(5, 6));

        Riazi tafrigh = (int a, int b) -> a-b;
        System.out.println(tafrigh.amaliat(5, 6));
    }
}
