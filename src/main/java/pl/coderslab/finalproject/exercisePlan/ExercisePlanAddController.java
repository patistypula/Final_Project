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
import java.util.Optional;

@Controller
@RequestMapping("/exercise")
public class ExercisePlanAddController {
    private final ExercisePlanService exercisePlanService;
    private final PersonService personService;
    private final Validator validator;

    public ExercisePlanAddController(ExercisePlanService exercisePlanService,
                                     PersonService personService, Validator validator) {
        this.exercisePlanService = exercisePlanService;
        this.personService = personService;
        this.validator = validator;
    }

    @ModelAttribute("persons")
    public List<Person> getAllUsers() {
        return personService.selectByLastName();
    }

    @GetMapping("/add/{id}")
    public String addExercise(Model model, @PathVariable long id) {
        Optional<Person> person = personService.findById(id);
        ExercisePlan exercisePlan = new ExercisePlan();
        exercisePlan.setPerson(person.get());
        model.addAttribute("exercises", exercisePlan);
        return "exercisePlan/form";
    }

    @PostMapping("/add/{id}")
    public String saveExercise(@Valid ExercisePlan exercisePlan, BindingResult result) {
        if(result.hasErrors()) {
            return "exercisePlan/form";
        }
        exercisePlanService.save(exercisePlan);
        return "redirect:/personDetails/all";
    }
}
