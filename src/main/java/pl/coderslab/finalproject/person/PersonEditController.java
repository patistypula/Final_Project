package pl.coderslab.finalproject.person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.Validator;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/personDetails")
public class PersonEditController {
    private final PersonService personService;
    private final Validator validator;

    public PersonEditController(PersonService personService, Validator validator) {
        this.personService = personService;
        this.validator = validator;
    }

    @ModelAttribute("persons")
    public List<Person> getAllUsers() {
        return personService.selectByLastName();
    }

    @GetMapping("/edit/{id}")
    public String editPerson (@PathVariable long id, Model model) {
        Optional<Person> person = personService.findById(id);
        if (person == null) {
            return "person/all";
        }
        model.addAttribute("persons", person);
        return "person/form";
    }

    @PostMapping("/edit/{id}")
    public String saveEditPerson (@PathVariable long id, @Valid Person person, BindingResult result) {
        if(id != person.getId()) {
            return "home/error";
        }
        if(result.hasErrors()) {
            return "person/form";
        }
        personService.save(person);
        return "redirect:/personDetails/all";
    }
}
