package kodlamaio.hrms.entities.abstracts;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidate_education")


public class CandidateEducation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "school_name")
    private String schoolName;

    @Column(name = "department_name")
    private String departmentName;

    @Column(name = "start_year")
    private int startYear;

    @Column(name = "graduation_year")
    private int graduationYear;

    @ManyToOne()
    // SONRA @JsonIgnore eklemeyi unutma. Şimdilik hazır json alayım diye yorum satırına aldım.
    @JoinColumn(name = "user_id")
    private Candidate candidate;
}
