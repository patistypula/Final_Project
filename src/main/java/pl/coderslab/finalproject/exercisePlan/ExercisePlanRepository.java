package pl.coderslab.finalproject.exercisePlan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.finalproject.person.Person;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ExercisePlanRepository extends JpaRepository<ExercisePlan, Long> {
    ExercisePlan save(ExercisePlan entity);

    @Query("SELECT e FROM ExercisePlan e WHERE e.person= ?1 ORDER BY e.created asc")
    List<ExercisePlan> selectByCreated(Person person);

    ExercisePlan findById(long id);
}
