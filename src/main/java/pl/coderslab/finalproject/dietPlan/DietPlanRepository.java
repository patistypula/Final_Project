package pl.coderslab.finalproject.dietPlan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface DietPlanRepository extends JpaRepository<DietPlan, Long> {
    DietPlan save(DietPlan entity);
}
