package pl.coderslab.finalproject.person;

import pl.coderslab.finalproject.BodyCompositionAnalysis.Measurement;
import pl.coderslab.finalproject.additional.Additional;
import pl.coderslab.finalproject.dietPlan.DietPlan;
import pl.coderslab.finalproject.exercisePlan.ExercisePlan;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = Person.TABLE)
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

    @Email
    private String email;

    private String password;

    private int superAdmin;

    @OneToMany (mappedBy = "person")
    private List<Measurement> measurement;

    @OneToMany (mappedBy = "person")
    private List<Additional> additional;

    @OneToMany (mappedBy = "person")
    private List<ExercisePlan> exercisePlan;

    @OneToMany (mappedBy = "person")
    private List<DietPlan> dietPlan;

    public Person() {
        measurement = new ArrayList<>();
        additional = new ArrayList<>();
        exercisePlan = new ArrayList<>();
        dietPlan = new ArrayList<>();
    }

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

    public List<Measurement> getMeasurement() {
        return measurement;
    }

    public void setMeasurement(List<Measurement> measurement) {
        this.measurement = measurement;
    }

    public List<Additional> getAdditional() {
        return additional;
    }

    public void setAdditional(List<Additional> additional) {
        this.additional = additional;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(LocalDate yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<ExercisePlan> getExercisePlan() {
        return exercisePlan;
    }

    public void setExercisePlan(List<ExercisePlan> exercisePlan) {
        this.exercisePlan = exercisePlan;
    }

    public List<DietPlan> getDietPlan() {
        return dietPlan;
    }

    public void setDietPlan(List<DietPlan> dietPlan) {
        this.dietPlan = dietPlan;
    }

    public int getSuperAdmin() {
        return superAdmin;
    }

    public void setSuperAdmin(int superAdmin) {
        this.superAdmin = superAdmin;
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
