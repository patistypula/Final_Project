package pl.coderslab.finalproject.additional;

import org.springframework.stereotype.Service;
import pl.coderslab.finalproject.person.Person;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AdditionalService {
    private final AdditionalRepository additionalRepository;

    public AdditionalService(AdditionalRepository additionalRepository) {
        this.additionalRepository = additionalRepository;
    }

    public Additional save(Additional additional) {
        return additionalRepository.save(additional);
    }

    public List<Additional> selectByCreated (Person person) {
        return additionalRepository.selectByCreated(person);
    }
}
