package ir.pt.library.Service.lmpl;


import ir.pt.library.Repo.PersonRepo;
import ir.pt.library.Service.PersonService;
import ir.pt.library.entity.Person;
import ir.pt.library.model.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    List<PersonDTO> people = new ArrayList<>();
    @Autowired
    private PersonRepo personRepo;
    @Override
    public PersonDTO addPerson(PersonDTO person) {
        Person person3=new Person("samin","rafati");
        personRepo.save(person3);




        PersonDTO person1 = new PersonDTO();

        person1.setName("samin");
        person1.setFamily("rafati");
        person1.setId(1);
        person1.setCode(1234);

        return person;
    }

    @Override
    public PersonDTO getPerson(PersonDTO person) {
        person.setName("samin");

        return person;
    }

    @Override
    public List<PersonDTO> getListOfPerson() {
        List<PersonDTO> people = new ArrayList<>();
        PersonDTO person=new PersonDTO();
        for (int i = 0; i < people.size(); i++) {
            person.setName("samin");
            person.setFamily("rafati");
            person.setId(1);
            people.add(person);

        }
        return people;
    }

    @Override
    public Boolean updatePerson(PersonDTO person) {
        person.setId(person.getId()+12);

        return true;
    }

    @Override
    public Boolean deletePerson(PersonDTO person) {
        people.remove(person);

        return true;
    }
}
