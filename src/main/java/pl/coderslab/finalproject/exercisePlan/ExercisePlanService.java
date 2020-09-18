package pl.coderslab.finalproject.exercisePlan;

import org.springframework.stereotype.Service;
import pl.coderslab.finalproject.person.Person;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ExercisePlanService {
    private final ExercisePlanRepository exercisePlanRepository;

    public ExercisePlanService(ExercisePlanRepository exercisePlanRepository) {
        this.exercisePlanRepository = exercisePlanRepository;
    }

    public ExercisePlan save(ExercisePlan exercisePlan) {
        return exercisePlanRepository.save(exercisePlan);
    }

    public List<ExercisePlan> selectByCreated(Person person) {
        return exercisePlanRepository.selectByCreated(person);
    }

    public ExercisePlan findById(long id) {
        return exercisePlanRepository.findById(id);
    }

}
