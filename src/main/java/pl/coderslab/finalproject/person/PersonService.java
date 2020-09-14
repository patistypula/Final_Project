package pl.coderslab.finalproject.person;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
}
