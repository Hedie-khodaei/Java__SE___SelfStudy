import mftplus.model.entity.Person;
import mftplus.model.enums.Role;
import mftplus.model.service.PersonService;

import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) throws Exception {
        Person person = Person
                .builder()
               // .id(1)
                .name("ali")
                .family("alizade")
                .birthDate(LocalDate.of(2000, 1, 15))
                .role(Role.admin)
                .status(true)
                .build();
        PersonService.getService().save(person);


       // Repository Test passed
       //try with resourse
    //   try (PersonRepositiry personRepositiry = new PersonRepositiry()) {
       //    personRepositiry.save(person);


           // System.out.println("قبل از آکولاد بسته");

           // System.out.println("بعد از آکولاد بسته ");


           //Test passed
           // personRepositiry.save(person);

           //Test passed
           //  personRepositiry.edit(person);

           //Test passed
           // personRepositiry.delete(0);

           //Test passed
          // System.out.println(personRepositiry.findAll());

           //Test passed
           //System.out.println(personRepositiry.findById(1));
          // System.out.println(personRepositiry.findById(41));

           //Test passed
           //System.out.println(personRepositiry.findByNameAndFamily("ali", "alipouri"));
           //System.out.println(personRepositiry.findByNameAndFamily("a", "a"));

        // }

    }
}
