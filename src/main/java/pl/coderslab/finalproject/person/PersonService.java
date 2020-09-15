package pl.coderslab.finalproject.person;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public List<Person> selectByLastName() {
        return personRepository.selectByLastName();
    }

    public Optional<Person> findById(long id) {
        return personRepository.findById(id);
    }
}
