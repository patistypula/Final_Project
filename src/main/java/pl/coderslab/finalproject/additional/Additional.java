package pl.coderslab.finalproject.additional;

import lombok.Getter;
import lombok.Setter;
import pl.coderslab.finalproject.person.Person;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = Additional.TABLE)
public class Additional {
    public static final String TABLE = "additional";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Double rightArmFat;

    private Double rightArmMuscle;

    private Double leftArmFat;

    private Double leftArmMuscle;

    private Double rightLegFat;

    private Double rightLegMuscle;

    private Double leftLegFat;

    private Double leftLegMuscle;

    private Double bodyFat;

    private Double bodyMuscle;

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
