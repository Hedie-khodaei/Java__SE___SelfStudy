package src.Se03;



public class Tamrin3 {
    public static void main(String[] args) {
        int sum=0 , i , count=0, result;

        for (i=100;i<1000;i++){
            if (i%2!=0){
                sum=sum+i;
                count++;
            }
        }
        result=sum/count;
        System.out.println("the avrage the three odd number is equal resualt"+result);
    }
}



