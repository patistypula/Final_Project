package pl.coderslab.finalproject.person;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.validation.Validator;

@Controller
@RequestMapping("/personDetails")
public class PersonController {
    private final PersonService personService;
    private final Validator validator;

    public PersonController(PersonService personService, Validator validator) {
        this.personService = personService;
        this.validator = validator;
    }
}
