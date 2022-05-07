package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.abstracts.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City, Integer> {
}
