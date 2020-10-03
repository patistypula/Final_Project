package pl.coderslab.finalproject.exercisePlan;

import lombok.Getter;
import lombok.Setter;
import pl.coderslab.finalproject.person.Person;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = ExercisePlan.TABLE)
@Getter
@Setter
public class ExercisePlan {
    public final static String TABLE = "exercise_plan";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String monday;
    private String tuesday;
    private String wednesday;
    private String thursday;
    private String friday;
    private String saturday;
    private String sunday;

    @Column(updatable = false)
    private LocalDateTime created;

    private LocalDateTime updated;

    @ManyToOne
    private Person person;

    @PrePersist
    public void perPersist() {
        created = LocalDateTime.now().withNano(0);
    }

    @PreUpdate
    public void perUpdate() {
        updated = LocalDateTime.now().withNano(0);
    }

}
