package pl.coderslab.finalproject.BodyCompositionAnalysis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.finalproject.person.Person;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
    Measurement save(Measurement entity);

    @Query("SELECT m FROM Measurement m WHERE m.person=?1 ORDER BY m.created asc")
    List<Measurement> selectByCreated(Person person);
}
