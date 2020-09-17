package pl.coderslab.finalproject.person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Validator;
import java.util.List;

@Controller
@RequestMapping("/personDetails")
public class PersonAllController {
    private final PersonService personService;
    private final Validator validator;

    public PersonAllController(PersonService personService, Validator validator) {
        this.personService = personService;
        this.validator = validator;
    }

    @ModelAttribute("persons")
    public List<Person> getAllUsers() {
        return personService.selectByLastName();
    }

    @RequestMapping("/all")
    public String getAllPerson(Model model) {
        model.addAttribute("persons", personService.selectByLastName());
        return "person/all";
    }

}
