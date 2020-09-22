package pl.coderslab.finalproject.exercisePlan;

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
@RequestMapping("/exercise")
public class ExercisePlanEditController {
    private final ExercisePlanService exercisePlanService;
    private final PersonService personService;
    private final Validator validator;

    public ExercisePlanEditController(ExercisePlanService exercisePlanService,
                                      PersonService personService, Validator validator) {
        this.exercisePlanService = exercisePlanService;
        this.personService = personService;
        this.validator = validator;
    }


    @ModelAttribute("persons")
    public List<Person> getAllUsers() {
        return personService.selectByLastName();
    }

    @GetMapping("/edit/{id}")  // tu jest id pomiaru
    public String editExercise(@PathVariable long id, Model model) {
        ExercisePlan exercisePlan = exercisePlanService.findById(id);
        model.addAttribute("exercises", exercisePlan);
        return "exercisePlan/form";
    }

    @PostMapping("/edit/{id}")   // tu jest id pomiaru
    public String saveEditExercise(@PathVariable long id, @Valid ExercisePlan exercisePlan,
                                   BindingResult result) {
        if(result.hasErrors()) {
            return "exercisePlan/form";
        }
        exercisePlanService.save(exercisePlan);
        return "redirect:/exercise/history/"+exercisePlan.getPerson().getId();
    }
}
