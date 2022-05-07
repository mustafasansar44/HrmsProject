package kodlamaio.hrms.entities.abstracts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "city")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})

public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @NotNull(message = "Şehir adı boş geçilemez.")
    @Column(name = "city_name")
    private String cityName;

    @OneToMany(mappedBy="city")
    private List<JobAdvertisement> jobAdvertisements;
}
