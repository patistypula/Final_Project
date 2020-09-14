package pl.coderslab.finalproject.user;

import pl.coderslab.finalproject.BodyCompositionAnalysis.Measurement;
import pl.coderslab.finalproject.additional.Additional;
import pl.coderslab.finalproject.person.Person;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
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

    @OneToMany
    private List<Measurement> measurement;

    @OneToMany
    private List<Additional> additional;

    @OneToOne
    private Person person;
}
