package pl.coderslab.finalproject.additional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.finalproject.person.Person;
import pl.coderslab.finalproject.person.PersonService;

import javax.validation.Validator;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/additional")
public class AdditionalHistoryController {
    private final AdditionalService additionalService;
    private final PersonService personService;
    private final Validator validator;

    public AdditionalHistoryController(AdditionalService additionalService, PersonService personService, Validator validator) {
        this.additionalService = additionalService;
        this.personService = personService;
        this.validator = validator;
    }

    @ModelAttribute("persons")
    public List<Person> getAllUsers() {
        return personService.selectByLastName();
    }

    @RequestMapping("/history/{id}")  // tu jest od uzytkownika
    public String getAll(Model model, @PathVariable long id) {
        Optional<Person> person = personService.findById(id);
        Additional additional = new Additional();
        additional.getPerson();
        model.addAttribute("additionals", additionalService.selectByCreated(person.get()));
        return "additional/all";
    }
}
