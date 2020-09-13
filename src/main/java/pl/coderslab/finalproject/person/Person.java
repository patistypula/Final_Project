package pl.coderslab.finalproject.person;

import pl.coderslab.finalproject.BodyCompositionAnalysis.Measurement;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = Person.TABLE)
public class Person {
    public final static String TABLE = "person_details";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotBlank
    private String gender;  // K or M

    private Integer height; //cm

    private LocalDate yearOfBirth;

    private Integer age;
    //age = LocalDate.now() - yearOfBirth;

    @OneToMany (mappedBy = "person")
    private List<Measurement> measurement;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(LocalDate yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    public List<Measurement> getMeasurement() {
//        return measurement;
//    }
//
//    public void setMeasurement(List<Measurement> measurement) {
//        this.measurement = measurement;
//    }
}
