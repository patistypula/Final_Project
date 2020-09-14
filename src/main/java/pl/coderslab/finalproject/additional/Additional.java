package pl.coderslab.finalproject.additional;

import pl.coderslab.finalproject.person.Person;
import pl.coderslab.finalproject.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name = Additional.TABLE)
public class Additional {
    public static final String TABLE = "additional";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private Double rightArmFat;
    @NotBlank
    private Double rightArmMuscle;

    @NotBlank
    private Double leftArmFat;
    @NotBlank
    private Double leftArmMuscle;

    @NotBlank
    private Double rightLegFat;
    @NotBlank
    private Double rightLegMuscle;

    @NotBlank
    private Double leftLegFat;
    @NotBlank
    private Double leftLegMuscle;

    @NotBlank
    private Double bodyFat;
    @NotBlank
    private Double bodyMuscle;

    @ManyToOne
    private Person person;

    @ManyToOne
    private User user;

    private LocalDateTime created;

    private LocalDateTime updated;

    @PrePersist
    public void perPersist() {
        created = LocalDateTime.now();
    }

    @PreUpdate
    public void perUpdate() {
        updated = LocalDateTime.now();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getRightArmFat() {
        return rightArmFat;
    }

    public void setRightArmFat(Double rightArmFat) {
        this.rightArmFat = rightArmFat;
    }

    public Double getRightArmMuscle() {
        return rightArmMuscle;
    }

    public void setRightArmMuscle(Double rightArmMuscle) {
        this.rightArmMuscle = rightArmMuscle;
    }

    public Double getLeftArmFat() {
        return leftArmFat;
    }

    public void setLeftArmFat(Double leftArmFat) {
        this.leftArmFat = leftArmFat;
    }

    public Double getLeftArmMuscle() {
        return leftArmMuscle;
    }

    public void setLeftArmMuscle(Double leftArmMuscle) {
        this.leftArmMuscle = leftArmMuscle;
    }

    public Double getRightLegFat() {
        return rightLegFat;
    }

    public void setRightLegFat(Double rightLegFat) {
        this.rightLegFat = rightLegFat;
    }

    public Double getRightLegMuscle() {
        return rightLegMuscle;
    }

    public void setRightLegMuscle(Double rightLegMuscle) {
        this.rightLegMuscle = rightLegMuscle;
    }

    public Double getLeftLegFat() {
        return leftLegFat;
    }

    public void setLeftLegFat(Double leftLegFat) {
        this.leftLegFat = leftLegFat;
    }

    public Double getLeftLegMuscle() {
        return leftLegMuscle;
    }

    public void setLeftLegMuscle(Double leftLegMuscle) {
        this.leftLegMuscle = leftLegMuscle;
    }

    public Double getBodyFat() {
        return bodyFat;
    }

    public void setBodyFat(Double bodyFat) {
        this.bodyFat = bodyFat;
    }

    public Double getBodyMuscle() {
        return bodyMuscle;
    }

    public void setBodyMuscle(Double bodyMuscle) {
        this.bodyMuscle = bodyMuscle;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "Additional{" +
                "id=" + id +
                ", rightArmFat=" + rightArmFat +
                ", rightArmMuscle=" + rightArmMuscle +
                ", leftArmFat=" + leftArmFat +
                ", leftArmMuscle=" + leftArmMuscle +
                ", rightLegFat=" + rightLegFat +
                ", rightLegMuscle=" + rightLegMuscle +
                ", leftLegFat=" + leftLegFat +
                ", leftLegMuscle=" + leftLegMuscle +
                ", bodyFat=" + bodyFat +
                ", bodyMuscle=" + bodyMuscle +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}