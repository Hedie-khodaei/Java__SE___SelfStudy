package src.Se07.se07First;

public class Main {
    public static void main(String[] args) {
      //  person person = new person();



        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setAddress("Marlik");
        System.out.println(employee);
        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.setUsername("John");
        System.out.println(onlineStudent);




    }
}
