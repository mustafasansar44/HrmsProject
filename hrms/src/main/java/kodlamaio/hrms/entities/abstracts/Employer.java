package kodlamaio.hrms.entities.abstracts;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "user_id")   // Veritabanındaki user_id ye aktar

public class Employer extends User{

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_address")
    private String webAddress;

    @OneToMany(mappedBy = "user")
    private List<JobAdvertisement> jobAdvertisements;

}
