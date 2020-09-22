package pl.coderslab.finalproject.person;

import lombok.Getter;
import lombok.Setter;
import pl.coderslab.finalproject.BodyCompositionAnalysis.Measurement;
import pl.coderslab.finalproject.additional.Additional;
import pl.coderslab.finalproject.dietPlan.DietPlan;
import pl.coderslab.finalproject.exercisePlan.ExercisePlan;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = Person.TABLE)
@Getter
@Setter
public class Person {
    public final static String TABLE = "person_details";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;

    private String lastName;

    private String gender;  // F or M

    private Integer height; //cm

    private LocalDate yearOfBirth;

    @OneToMany (mappedBy = "person")
    private List<Measurement> measurement;

    @OneToMany (mappedBy = "person")
    private List<Additional> additional;

    @OneToMany (mappedBy = "person")
    private List<ExercisePlan> exercisePlan;

    @OneToMany(mappedBy = "person")
    private List<DietPlan> dietPlan;

    public Person() {
        measurement = new ArrayList<>();
        additional = new ArrayList<>();
        exercisePlan = new ArrayList<>();
        dietPlan = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
