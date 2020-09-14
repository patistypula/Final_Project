package pl.coderslab.finalproject.BodyCompositionAnalysis;

import pl.coderslab.finalproject.person.Person;
import pl.coderslab.finalproject.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name = Measurement.TABLE)
public class Measurement {
    public static final String TABLE = "measurement";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private Double bodyFatPercentage; //%

    @NotBlank
    private Double bodyWeight; //kg

    @NotBlank
    private Double bodyWaterPercentage;  //%

    @NotBlank
    private Double visceralFat; //level

    @NotBlank
    private Double muscleMass;  //kg

    @NotBlank
    private Integer bodyBuildingIndex;  //-

    @NotBlank
    private Double boneMass;  //kg

    @NotBlank
    private Double BMI;  //-

    @NotBlank
    private Integer metabolicAge;  //-

    @NotBlank
    private Integer basalMetabolicRate;  //kcal

    private LocalDateTime created;

    private LocalDateTime updated;

    @ManyToOne
    private Person person;

    @ManyToOne
    private User user;

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

    public Double getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    public void setBodyFatPercentage(Double bodyFatPercentage) {
        this.bodyFatPercentage = bodyFatPercentage;
    }

    public Double getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(Double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public Double getBodyWaterPercentage() {
        return bodyWaterPercentage;
    }

    public void setBodyWaterPercentage(Double bodyWaterPercentage) {
        this.bodyWaterPercentage = bodyWaterPercentage;
    }

    public Double getVisceralFat() {
        return visceralFat;
    }

    public void setVisceralFat(Double visceralFat) {
        this.visceralFat = visceralFat;
    }

    public Double getMuscleMass() {
        return muscleMass;
    }

    public void setMuscleMass(Double muscleMass) {
        this.muscleMass = muscleMass;
    }

    public Integer getBodyBuildingIndex() {
        return bodyBuildingIndex;
    }

    public void setBodyBuildingIndex(Integer bodyBuildingIndex) {
        this.bodyBuildingIndex = bodyBuildingIndex;
    }

    public Double getBoneMass() {
        return boneMass;
    }

    public void setBoneMass(Double boneMass) {
        this.boneMass = boneMass;
    }

    public Double getBMI() {
        return BMI;
    }

    public void setBMI(Double BMI) {
        this.BMI = BMI;
    }

    public Integer getMetabolicAge() {
        return metabolicAge;
    }

    public void setMetabolicAge(Integer metabolicAge) {
        this.metabolicAge = metabolicAge;
    }

    public Integer getBasalMetabolicRate() {
        return basalMetabolicRate;
    }

    public void setBasalMetabolicRate(Integer basalMetabolicRate) {
        this.basalMetabolicRate = basalMetabolicRate;
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

//    public Person getPerson() {
//        return person;
//    }
//
//    public void setPerson(Person person) {
//        this.person = person;
//    }





}
