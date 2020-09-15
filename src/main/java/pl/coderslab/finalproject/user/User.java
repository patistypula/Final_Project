package pl.coderslab.finalproject.user;

import pl.coderslab.finalproject.BodyCompositionAnalysis.Measurement;
import pl.coderslab.finalproject.additional.Additional;
import pl.coderslab.finalproject.person.Person;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = User.TABLE)
public class User {
    public static final String TABLE = "user";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Email
    private String email;

    @NotBlank
    private String password;

    @OneToMany (mappedBy = "user")
    private List<Measurement> measurement;

    @OneToMany (mappedBy = "user")
    private List<Additional> additional;

    @OneToOne
    private Person person;

    public User() {
        measurement = new ArrayList<>();
        additional = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", person=" + person +
                '}';
    }
}
