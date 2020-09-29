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

@Controller
@RequestMapping("/additional")
public class AdditionalEditController {
    private final AdditionalService additionalService;
    private final PersonService personService;
    private final Validator validator;

    public AdditionalEditController(AdditionalService additionalService, PersonService personService, Validator validator) {
        this.additionalService = additionalService;
        this.personService = personService;
        this.validator = validator;
    }

    @ModelAttribute("persons")
    public List<Person> getAllUsers() {
        return personService.selectByLastName();
    }

    @GetMapping("/edit/{id}")  // tu jest id pomiaru
    public String editAdditio(@PathVariable long id, Model model) {
        Additional additional = additionalService.findById(id);
        model.addAttribute("additionals", additional);
        return "additional/form";
    }

    @PostMapping("/edit/{id}")   // tu jest id pomiaru
    public String saveEditedAddition(@PathVariable long id, @Valid @ModelAttribute ("additionals")
            Additional additional, BindingResult result) {
        if(result.hasErrors()) {
            return "additional/form";
        }
        additionalService.save(additional);
        return "redirect:/additional/history/" + additional.getPerson().getId();
    }
}
