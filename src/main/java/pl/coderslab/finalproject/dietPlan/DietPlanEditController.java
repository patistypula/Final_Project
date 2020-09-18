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

@Controller
@RequestMapping("/diet")
public class DietPlanEditController {
    private final DietPlanService dietPlanService;
    private final PersonService personService;
    private final Validator validator;

    public DietPlanEditController(DietPlanService dietPlanService,
                                  PersonService personService, Validator validator) {
        this.dietPlanService = dietPlanService;
        this.personService = personService;
        this.validator = validator;
    }

    @ModelAttribute("persons")
    public List<Person> getAllUsers() {
        return personService.selectByLastName();
    }

    @GetMapping("/edit/{id}")  // tu jest id pomiaru
    public String editDiet(@PathVariable long id, Model model) {
        DietPlan dietPlan = dietPlanService.findById(id);
        model.addAttribute("diets", dietPlan);
        return "dietPlan/form";
    }

    @PostMapping("/edit/{id}")   // tu jest id pomiaru
    public String saveEditDiet(@PathVariable long id, @Valid DietPlan dietPlan,
                                   BindingResult result) {
        if(result.hasErrors()) {
            return "dietPlan/form";
        }
        dietPlanService.save(dietPlan);
        return "redirect:/diet/history/"+dietPlan.getPerson().getId();
    }
}
