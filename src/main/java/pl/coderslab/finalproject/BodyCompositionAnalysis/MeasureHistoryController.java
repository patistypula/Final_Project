package pl.coderslab.finalproject.BodyCompositionAnalysis;

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
@RequestMapping("/measurement")
public class MeasureHistoryController {
    private final MeasurementService measurementService;
    private final PersonService personService;
    private final Validator validator;

    public MeasureHistoryController(MeasurementService measurementService, PersonService personService, Validator validator) {
        this.measurementService = measurementService;
        this.personService = personService;
        this.validator = validator;
    }

    @ModelAttribute("persons")
    public List<Person> getAllUsers() {
        return personService.selectByLastName();
    }

    @RequestMapping("/history/{id}")   // tu jest id osoby
    public String getAll(Model model, @PathVariable long id) {
        Optional<Person> person = personService.findById(id);
        Measurement measurement = new Measurement();
        measurement.getPerson();
        model.addAttribute("measurements", measurementService.selectByCreated(person.get()));
        return "measurement/all";
    }
}
