package src.Se07.se07First;

public  abstract class person { //abstract: ارث بری مجاز (شی شازی مجاز نیست
    // چون مثلا person  معلوم نیست واسه استاد دانش آموز

    private int id;
    private String firstName;
    private String lastName;
    private String address;

    //public  person(int id, String firstName, String lastName) {
       // this.id = id;
       // this.firstName = firstName;
//this.lastName = lastName;
    //}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    @Override
   public String toString() {
        return "person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +

                '}';


    }

}
