package ir.pt.library.controller;

import ir.pt.library.Service.PersonService;
import ir.pt.library.model.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/person")
public class personController {
    @Autowired
    PersonService personService;


    List<PersonDTO> people = new ArrayList<>();

    @PostMapping(value = "/add")

    public ResponseEntity addPerson() {
        PersonDTO person = new PersonDTO();


        return ResponseEntity.ok(personService.addPerson(person));


    }

    @GetMapping(value = "/search")
    public ResponseEntity getPerson(@RequestBody PersonDTO person) throws Exception {
        return ResponseEntity.ok(personService.getPerson(person));


    }

    @GetMapping(value = "/select")
    public ResponseEntity getListOfPerson(@RequestBody PersonDTO person) throws Exception {

        return ResponseEntity.ok(personService.getListOfPerson());

    }

    @PutMapping(value = "/update")
    public ResponseEntity updatePerson(@RequestBody PersonDTO person) throws Exception {

        return ResponseEntity.ok(personService.updatePerson(person));


    }

    @DeleteMapping(value = "/delete")

    public ResponseEntity deletePerson(@RequestBody PersonDTO person) throws Exception {

        return ResponseEntity.ok(personService.deletePerson(person));


    }
}
