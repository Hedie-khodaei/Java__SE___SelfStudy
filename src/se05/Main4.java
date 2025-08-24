package src.se05;


import java.util.LinkedList;

public class Main4 {
    public static void main(String[] args) {
       LinkedList mylinkedList = new  LinkedList();

        mylinkedList.add(1);
        mylinkedList.add(1);
        //   myarrayList.add(1);
        //  myarrayList.add(true);
        //  myarrayList.add(3.4F);

        System.out.println(mylinkedList);
        LinkedList myarraylist = new  LinkedList();
        // Add to end
        mylinkedList.add("mohsen");
        //   myarrayList.add(1);
        //  myarrayList.add(true);
        //  myarrayList.add(3.4F);

        //insert to index
        mylinkedList.add(1, "MOHSEN");

        System.out.println(mylinkedList);
        //update
        mylinkedList.set(1, "alireza");

        // delete

        // myarrayList.remove(0);
        //  myarrayList.remove("mohsen");

        System.out.println(mylinkedList);
        // Access دسترسی
        System.out.println(mylinkedList.get(2));


        for (int i = 0; i < mylinkedList.size(); i++) {
            System.out.println(mylinkedList.get(i));

        }
    }
}
