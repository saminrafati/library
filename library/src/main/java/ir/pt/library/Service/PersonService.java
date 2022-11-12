package ir.pt.library.Service;


import ir.pt.library.model.PersonDTO;

import java.util.ArrayList;
import java.util.List;

public interface PersonService {
    PersonDTO addPerson(PersonDTO person);
    PersonDTO getPerson(PersonDTO person);
    List<PersonDTO> getListOfPerson();
    Boolean updatePerson(PersonDTO person);
    Boolean deletePerson(PersonDTO person);

}
