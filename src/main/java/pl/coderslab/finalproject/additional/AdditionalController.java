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
public class AdditionalController {
    private final AdditionalService additionalService;
    private final PersonService personService;
    private final Validator validator;

    public AdditionalController(AdditionalService additionalService, PersonService personService, Validator validator) {
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
    public String saveAdditional(@Valid Additional additional, BindingResult result) {
        if(result.hasErrors()) {
            return "additional/form";
        }
        additionalService.save(additional);
        return "redirect:/personDetails/all";
    }

    @RequestMapping("/history/{id}")  // tu jest od uzytkownika
    public String getAll(Model model, @PathVariable long id) {
        Optional<Person> person = personService.findById(id);
        Additional additional = new Additional();
        additional.getPerson();
        model.addAttribute("additionals", additionalService.selectByCreated(person.get()));
        return "additional/all";
    }

    @GetMapping("/edit/{id}")  // tu jest id pomiaru
    public String editAdditio(@PathVariable long id, Model model) {
        Additional additional = additionalService.findById(id);
        model.addAttribute("additionals", additional);
        return "additional/form";
    }

    @PostMapping("/edit/{id}")   // tu jest id pomiaru
    public String saveEditedAddition(@PathVariable long id, @Valid Additional additional, BindingResult result) {
        if(result.hasErrors()) {
            return "additional/form";
        }
        additionalService.save(additional);
        return "redirect:/additional/history/"+additional.getPerson().getId();
    }

}
