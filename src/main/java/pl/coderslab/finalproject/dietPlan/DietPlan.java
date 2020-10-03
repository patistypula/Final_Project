package pl.coderslab.finalproject.dietPlan;

import lombok.Getter;
import lombok.Setter;
import pl.coderslab.finalproject.person.Person;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = DietPlan.TABLE)
public class DietPlan {
    public static final String TABLE = "diet_plan";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String Monday;
    private String Tuesday;
    private String Wednesday;
    private String Thursday;
    private String Friday;
    private String Saturday;
    private String Sunday;

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
