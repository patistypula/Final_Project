package pl.coderslab.finalproject.dietPlan;

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
@RequestMapping("/diet")
public class DietPlanAddController {
    private final DietPlanService dietPlanService;
    private final PersonService personService;
    private final Validator validator;

    public DietPlanAddController(DietPlanService dietPlanService,
                                 PersonService personService, Validator validator) {
        this.dietPlanService = dietPlanService;
        this.personService = personService;
        this.validator = validator;
    }

    @ModelAttribute("persons")
    public List<Person> getAllUsers() {
        return personService.selectByLastName();
    }

    @GetMapping("/add/{id}")
    public String addDietPlan(Model model, @PathVariable long id) {
        Optional<Person> person = personService.findById(id);
        DietPlan dietPlan = new DietPlan();
        dietPlan.setPerson(person.get());
        model.addAttribute("diets", dietPlan);
        return "dietPlan/form";
    }

    @PostMapping("/add/{id}")
    public String saveDietPlan(@Valid DietPlan dietPlan, BindingResult result) {
        if(result.hasErrors()) {
            return "dietPlan/form";
        }
        dietPlanService.save(dietPlan);
        return "redirect:/personDetails/all";
    }
}
