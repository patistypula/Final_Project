package pl.coderslab.finalproject.dietPlan;

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
@RequestMapping("/diet")
public class DietPlanHistoryController {
    private final DietPlanService dietPlanService;
    private final PersonService personService;
    private final Validator validator;

    public DietPlanHistoryController(DietPlanService dietPlanService,
                                     PersonService personService, Validator validator) {
        this.dietPlanService = dietPlanService;
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
        DietPlan dietPlan = new DietPlan();
        dietPlan.getPerson();
        model.addAttribute("diets", dietPlanService.selectByCreated(person.get()));
        return "dietPlan/all";
    }
}
