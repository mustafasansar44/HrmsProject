package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{
	// 1.Değer entity anotasyonu ile süslenmiş nesne için (entity'i koymazsan burada problem yaşarsın.)
	// 2.Değer primary key'i bana ver ki ben intellisense'i ona göre hazırlayayım.
	// JPA REPOSİTORY getAll delete set vs. metodları bizim için oto oluşturur.
	
}
