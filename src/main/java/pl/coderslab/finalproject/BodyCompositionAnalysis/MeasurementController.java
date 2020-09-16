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
import java.util.Optional;

@Controller
@RequestMapping("/measurement")
public class MeasurementController {
    private final MeasurementService measurementService;
    private final PersonService personService;
    private final Validator validator;

    public MeasurementController(MeasurementService measurementService, PersonService personService, Validator validator) {
        this.measurementService = measurementService;
        this.personService = personService;
        this.validator = validator;
    }

    @ModelAttribute("persons")
    public List<Person> getAllUsers() {
        return personService.selectByLastName();
    }

    @GetMapping("/add/{id}")
    public String addMeasure(Model model, @PathVariable long id){
        Optional<Person> person = personService.findById(id);
        Measurement measurement = new Measurement();
        measurement.setPerson(person.get());
        model.addAttribute("measurements", measurement);
        return"measurement/form";
    }

    @PostMapping("/add/{id}")
    public String saveMeasure(@Valid Measurement measurement, BindingResult result) {
        if(result.hasErrors()) {
            return "measurement/form";
        }
        measurementService.save(measurement);
        return "redirect:/personDetails/all";
    }

    @RequestMapping("/history/{id}")
    public String getAll(Model model, @PathVariable long id) {
        Optional<Person> person = personService.findById(id);
        Measurement measurement = new Measurement();
        measurement.getPerson();
        model.addAttribute("measurements", measurementService.selectByCreated(person.get()));
        return "measurement/all";
    }

    @GetMapping("/edit/{id}")
    public String editMeasure(@PathVariable long id, )





}
