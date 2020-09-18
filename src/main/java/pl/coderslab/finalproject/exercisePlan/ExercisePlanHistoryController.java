package pl.coderslab.finalproject.exercisePlan;

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
@RequestMapping("/exercise")
public class ExercisePlanHistoryController {
    private final ExercisePlanService exercisePlanService;
    private final PersonService personService;
    private final Validator validator;

    public ExercisePlanHistoryController(ExercisePlanService exercisePlanService,
                                         PersonService personService, Validator validator) {
        this.exercisePlanService = exercisePlanService;
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
        ExercisePlan exercisePlan = new ExercisePlan();
        exercisePlan.getPerson();
        model.addAttribute("exercises", exercisePlanService.selectByCreated(person.get()));
        return "exercisePlan/all";
    }
}
