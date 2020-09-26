package pl.coderslab.finalproject.person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/personDetails")
public class RegexController {
    private final PersonService personService;

    public RegexController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/search")
    public String searchPerson(Model model, @RequestParam String lastName){
        List<Person> list = personService.selectByRegex(lastName);
        model.addAttribute("persons", list);
        LocalDate now = LocalDate.now();
        List<Integer> ages = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            ages.add(now.getYear() - list.get(i).getYearOfBirth().getYear());
            model.addAttribute("ages", ages);
        }
        return"person/all";
    }
}
