package kodlamaio.hrms.entities.abstracts;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_advertisement")

public class JobAdvertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false)
    private int id;

    @Column(name = "job_title")
    private String job_title;

    @Column(name = "description")
    private String description;

    @Column(name = "min_salary")
    private int minSalary;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "people_count")
    private int peopleCount;

    @Column(name = "post_release_date")
    private Date postReleaseDate;

    @Column(name = "post_dead_date")
    private Date postDeadDate;

    @Column(name = "post_active",columnDefinition = "boolean default false")
    @JsonIgnore
    // Buraya JsonIgnore koymazsam isActive true post gönderirsem isActive true oluyor. Bu ne alaka anlayamadım.
    private boolean postActive;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne()
    @JoinColumn(name = "job_position_id")
    private JobPosition jobPosition;

    @ManyToOne()
    @JoinColumn(name = "city_id")
    private City city;
}
