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
    Person entityPerson=new Person(person.getName(),person.getFamily(),person.getId());
    personRepo.save(entityPerson);
    PersonDTO personDTO=new PersonDTO(entityPerson.getId(),entityPerson.getName(),entityPerson.getFamily());
    return personDTO;
    }

    @Override
    public PersonDTO getPerson(PersonDTO person) {
       Person entityPerson=personRepo.findById(person.getId()).get();
       return new PersonDTO(entityPerson.getId(),entityPerson.getName(),entityPerson.getFamily());

    }

    @Override
    public List<PersonDTO> getListOfPerson() {
        List<Person> people=(List) personRepo.findAll();
        List<PersonDTO> peopleDTO=new ArrayList<>();
        for(Person entityPerson:people){
            peopleDTO.add(new PersonDTO(entityPerson.getId(),entityPerson.getName(),entityPerson.getFamily()));
        }

        return peopleDTO;

    }

    @Override
    public Boolean updatePerson(PersonDTO person) {
        person.setId(person.getId()+12);

        return true;
    }

    @Override
    public Boolean deletePerson(PersonDTO person) {
       personRepo.deleteById(person.getId());

        return true;
    }
}
