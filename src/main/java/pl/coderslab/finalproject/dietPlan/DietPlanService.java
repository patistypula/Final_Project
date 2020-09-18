package pl.coderslab.finalproject.dietPlan;

import org.springframework.stereotype.Service;
import pl.coderslab.finalproject.person.Person;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DietPlanService {
    private final DietPlanRepository dietPlanRepository;

    public DietPlanService(DietPlanRepository dietPlanRepository) {
        this.dietPlanRepository = dietPlanRepository;
    }

    public DietPlan save(DietPlan dietPlan) {
        return dietPlanRepository.save(dietPlan);
    }

    public List<DietPlan> selectByCreated(Person person) {
        return dietPlanRepository.selectByCreated(person);
    }

    public DietPlan findById(long id) {
        return dietPlanRepository.findById(id);
    }


}
