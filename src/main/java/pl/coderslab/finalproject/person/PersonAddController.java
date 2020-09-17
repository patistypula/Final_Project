package pl.coderslab.finalproject.person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.Validator;
import java.util.List;

@Controller
@RequestMapping("/personDetails")
public class PersonAddController {
    private final PersonService personService;
    private final Validator validator;

    public PersonAddController(PersonService personService, Validator validator) {
        this.personService = personService;
        this.validator = validator;
    }

    @ModelAttribute("persons")
    public List<Person> getAllUsers() {
        return personService.selectByLastName();
    }


    @GetMapping("/add")
    public String addPerson(Model model){
        model.addAttribute("persons", new Person());
        return"person/form";
    }

    @PostMapping("/add")
    public String savePerson(@Valid Person person, BindingResult result) {
        if(result.hasErrors()) {
            return "person/form";
        }
        personService.save(person);
        return "redirect:/personDetails/all";
    }

}
