package pl.coderslab.finalproject.dietPlan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.finalproject.person.Person;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface DietPlanRepository extends JpaRepository<DietPlan, Long> {
    DietPlan save(DietPlan entity);

    @Query("SELECT d FROM DietPlan d WHERE d.person=?1 ORDER BY d.created asc")
    List<DietPlan> selectByCreated(Person person);

    DietPlan findById(long id);
}
