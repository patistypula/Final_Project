package pl.coderslab.finalproject.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import pl.coderslab.finalproject.BodyCompositionAnalysis.Measurement;
import pl.coderslab.finalproject.additional.Additional;
import pl.coderslab.finalproject.dietPlan.DietPlan;
import pl.coderslab.finalproject.exercisePlan.ExercisePlan;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = Person.TABLE)
public class Person {
    public final static String TABLE = "person_details";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Proszę wpisać imię pacjenta")
    private String firstName;

    @NotBlank(message = "Proszę wpisać nazwisko pacjenta")
    private String lastName;

    @NotBlank(message = "Proszę podać płeć pacjenta")
    private String gender;  // F or M

    private Integer height; //cm

    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @NotNull(message = "Proszę wpisać datę urodzenia pacjenta")
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
