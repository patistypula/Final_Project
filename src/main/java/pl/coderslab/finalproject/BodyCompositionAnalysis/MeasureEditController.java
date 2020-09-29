package pl.coderslab.finalproject.BodyCompositionAnalysis;

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
@RequestMapping("/measurement")
public class MeasureEditController {
    private final MeasurementService measurementService;
    private final PersonService personService;
    private final Validator validator;

    public MeasureEditController(MeasurementService measurementService, PersonService personService, Validator validator) {
        this.measurementService = measurementService;
        this.personService = personService;
        this.validator = validator;
    }

    @ModelAttribute("persons")
    public List<Person> getAllUsers() {
        return personService.selectByLastName();
    }

    @GetMapping("/edit/{id}")  // tu jest id pomiaru
    public String editMeasure(@PathVariable long id, Model model) {
        Measurement measurement = measurementService.findById(id);
        model.addAttribute("measurements", measurement);
        return "measurement/form";
    }

    @PostMapping("/edit/{id}")   // tu jest id pomiaru
    public String saveEditedMeasure(@PathVariable long id, @Valid @ModelAttribute ("measurements")
            Measurement measurement, BindingResult result) {
        if(result.hasErrors()) {
            return "measurement/form";
        }
        measurementService.save(measurement);
        return "redirect:/measurement/history/" +measurement.getPerson().getId();
    }
}
