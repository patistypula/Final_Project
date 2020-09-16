package pl.coderslab.finalproject.additional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.finalproject.person.Person;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface AdditionalRepository extends JpaRepository<Additional, Long> {
    Additional save(Additional entity);

    @Query("SELECT a FROM Additional a WHERE a.person=?1 ORDER BY a.created asc")
    List<Additional> selectByCreated(Person person);
}
