package pl.coderslab.finalproject.person;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PersonConverter implements Converter<String, Optional<Person>> {

//    @Autowired
    private PersonService personService;

    public Optional<Person> convert(String source) {
        Optional<Person> group = personService.findById(Long.parseLong(source));
        return group;
    }
}