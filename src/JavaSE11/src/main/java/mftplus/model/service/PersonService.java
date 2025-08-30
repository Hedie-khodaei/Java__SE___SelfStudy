package mftplus.model.service;

import lombok.Getter;
import mftplus.model.entity.Person;
import mftplus.model.repository.PersonRepositiry;

import java.util.List;

// چک کردن منطق کسب و کار
public class PersonService  implements Service<Person,Integer> {
    @Getter
    public static PersonService service = new PersonService();

    private PersonService() {

    }

    @Override
    public void save(Person person) throws Exception {
        try(PersonRepositiry personRepositiry = new PersonRepositiry()) {
            personRepositiry.save(person);
        }

    }

    @Override
    public void edit(Person person) throws Exception {
        try (PersonRepositiry personRepositiry = new PersonRepositiry()) {
            personRepositiry.edit(person);
        }

    }

    @Override
    public void delete(Integer id) throws Exception {
        try (PersonRepositiry personRepositiry = new PersonRepositiry()) {
            personRepositiry.delete(id);
        }

    }

    @Override
    public List<Person> findAll() throws Exception {
        try (PersonRepositiry personRepositiry = new PersonRepositiry()) {
            return personRepositiry.findAll();
        }
    }

    @Override
    public Person findById(Integer id) throws Exception {
        try (PersonRepositiry personRepositiry = new PersonRepositiry()) {
            return personRepositiry.findById(id);
        }
    }
    public void findByNameAndFmily(String name , String fmily) throws Exception {
        try (PersonRepositiry personRepositiry = new PersonRepositiry()) {
            personRepositiry.findByNameAndFamily(name, fmily);
        }
    }
}


    /*
        public  void save(Person person) throws Exception {
            try (PersonRepositiry personRepositiry = new PersonRepositiry()) {
                if (person.getBirthDate().isBefore(LocalDate.of(2020, 1, 11))) {
                    personRepositiry.save(person);
                } else {
                    throw new Exception("سن واسه اتستخدام مناسب نیست");
                }
            }
        }
        public  void edit (Person person){
            try (PersonRepositiry personRepositiry = new PersonRepositiry()) {
                personRepositiry.edit(person);
            }


        }
    }

     */




