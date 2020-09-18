package pl.coderslab.finalproject.person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Validator;
import java.time.LocalDate;
import java.util.ArrayList;
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
        List<Person> persons = personService.selectByLastName();
        model.addAttribute("persons", persons);
        LocalDate now = LocalDate.now();
        List<Integer> ages = new ArrayList<>();
        for(int i=0;   i<persons.size();   i++){
            ages.add(now.getYear()-persons.get(i).getYearOfBirth().getYear());
        }
        model.addAttribute("ages", ages);
        return "person/all";
    }

}
