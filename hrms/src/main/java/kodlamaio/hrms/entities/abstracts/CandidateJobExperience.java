package kodlamaio.hrms.entities.abstracts;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidate_job_experience")

public class CandidateJobExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotBlank
    @NotNull(message = "Şirket adı boş geçilemez.")
    @Column(name = "business_name")
    private String businessName;

    @Column(name = "position")
    private String position;

    @Column(name = "start_date")
    private int startDate;

    @Column(name = "end_date")
    private int endDate;

    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private Candidate candidate;
}
