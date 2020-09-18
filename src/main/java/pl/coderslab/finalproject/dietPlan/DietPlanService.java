package pl.coderslab.finalproject.dietPlan;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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


}
