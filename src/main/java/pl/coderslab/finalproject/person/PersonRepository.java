package pl.coderslab.finalproject.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person save(Person entity);

    @Query(value = "SELECT p FROM Person p ORDER BY p.lastName asc")
    List<Person> selectByLastName();

    Optional<Person> findById(Long id);

    @Query(value = "SELECT p FROM Person p WHERE p.lastName LIKE %?1%")
    List<Person> selectByRegex(String lastName);

}
