package kodlamaio.hrms.entities.abstracts;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "candidate_language")
public class CandidateLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "language_name")
    private String languageName;

    @Column(name = "language_level")
    @Min(value = 1, message = "Seviyeniz 1'den küçük olamaz.")
    @Max(value = 5, message = "Seviyeniz 5'ten büyük olamaz.")
    private String languageLevel;


    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private Candidate candidate;
}
