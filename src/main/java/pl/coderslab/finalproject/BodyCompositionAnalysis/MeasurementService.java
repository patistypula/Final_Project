package pl.coderslab.finalproject.BodyCompositionAnalysis;

import org.springframework.stereotype.Service;
import pl.coderslab.finalproject.person.Person;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MeasurementService {
    private final MeasurementRepository measurementRepository;

    public MeasurementService(MeasurementRepository measurementRepository) {
        this.measurementRepository = measurementRepository;
    }

    public Measurement save(Measurement measurement) {
        return measurementRepository.save(measurement);
    }

    public List<Measurement> selectByCreated(Person person) {
        return measurementRepository.selectByCreated(person);
    }

    public Measurement findById(long id) {
        return measurementRepository.findById(id);
    }
}
