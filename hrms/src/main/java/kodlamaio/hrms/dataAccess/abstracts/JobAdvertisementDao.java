package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.abstracts.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

    List<JobAdvertisement> getByUserId(int userId);

    @Query(value = "from JobAdvertisement j where j.id = :id")
    JobAdvertisement getById(@Param("id") int id);

    @Modifying
    @Query(value = "update JobAdvertisement j set j.postActive = false where j.id = :id")
    void setActiveStatus(@Param("id") int id);  //JobAdvertisementId

    //@Query("Select new kodlamaio.hrms.entities.dtos.PositionWithJobAdvertisementDto(m.id, m.jobPosition, j.user) From JobAdvertisement j Inner Join j.jobPosition m")
    //List<PositionWithJobAdvertisementDto> getPositionWithJobAdvertisementDetails();
}
