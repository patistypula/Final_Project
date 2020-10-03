package pl.coderslab.finalproject.BodyCompositionAnalysis;

import lombok.Getter;
import lombok.Setter;
import pl.coderslab.finalproject.person.Person;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = Measurement.TABLE)
public class Measurement {
    public static final String TABLE = "measurement";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Double bodyFatPercentage; //%

    private Double bodyWeight; //kg

    private Double bodyWaterPercentage;  //%

    private Double visceralFat; //level

    private Double muscleMass;  //kg

    private Integer bodyBuildingIndex;  //-

    private Double boneMass;  //kg

    private Double BMI;  //-

    private Integer metabolicAge;  //-

    private Integer basalMetabolicRate;  //kcal

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
