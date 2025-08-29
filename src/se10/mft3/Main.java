package se10.mft3;

import mft3.entity.Person;
import mft3.entity.Role;
import mft3.repository.PersonRepositiry;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Person person =new Person(
                11,
                "new",
                "edited",
                LocalDate.of(2000,6,10),
                Role.manager,
                true
        );

        PersonRepositiry personRepositiry = new PersonRepositiry();//بایگانی


        //test passed------------------------------------------
     //   personRepositiry.save(person);

        //test passed------------------------------------------
        //personRepositiry.edit(person);


        //test passed------------------------------------------
        personRepositiry.delete(11);
    }
}
