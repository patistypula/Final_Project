package pl.coderslab.finalproject.additional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.finalproject.person.Person;
import pl.coderslab.finalproject.person.PersonService;

import javax.validation.Valid;
import javax.validation.Validator;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/additional")
public class AdditionalAddController {
    private final AdditionalService additionalService;
    private final PersonService personService;
    private final Validator validator;

    public AdditionalAddController(AdditionalService additionalService, PersonService personService, Validator validator) {
        this.additionalService = additionalService;
        this.personService = personService;
        this.validator = validator;
    }

    @ModelAttribute("persons")
    public List<Person> getAllUsers() {
        return personService.selectByLastName();
    }

    @GetMapping("/add/{id}")
    public String addAdditional(Model model, @PathVariable long id) {
        Optional<Person> person = personService.findById(id);
        Additional additional = new Additional();
        additional.setPerson(person.get());
        model.addAttribute("additionals", additional);
        return "additional/form";
    }

    @PostMapping("/add/{id}")
    public String saveAdditional(@Valid @ModelAttribute ("additionals") Additional additional,
                                 BindingResult result) {
        if(result.hasErrors()) {
            return "additional/form";
        }
        additionalService.save(additional);
        return "redirect:/personDetails/all";
    }
}
