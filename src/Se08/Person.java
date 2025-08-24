package src.Se08;

public abstract class Person {
    int  a;

    public int add(int a ,int b) //method signature
    {                            // method body
     return a + b;
    }

    // method abstract without body
    // implemention ---> sub class
    // Force to implement
    public abstract boolean login (String username,String password);
}
