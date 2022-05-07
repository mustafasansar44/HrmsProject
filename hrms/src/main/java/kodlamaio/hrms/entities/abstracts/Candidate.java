package kodlamaio.hrms.entities.abstracts;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidate")
@PrimaryKeyJoinColumn(name = "user_id")   // Veritabanındaki user_id ye aktar

public class Candidate extends User{

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "national_id")
    private String nationalId;

    @Column(name = "year_of_birth")
    private Date yearOfBirth;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<CandidateEducation> candidateEducation;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<CandidateJobExperience> candidateJobExperiences;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<CandidateLanguage> candidateLanguages;

    @JsonIgnore
    @OneToOne(mappedBy = "candidate")
    private CandidateImage candidateImage;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<CandidateSocial> candidateSocial;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<CandidateTechnology> candidateTechnologies;

}





