package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity	// JobPosition bir entity'dir (Sen bir veritabanı nesnesisin arkadaşım demek)
@Table(name="job_positions")
@AllArgsConstructor
@NoArgsConstructor


public class JobPosition {
	
	@Id	// Primary key oldugunu belirtmek için ekledik.
	@GeneratedValue(strategy = GenerationType.IDENTITY)	// id otomatik artan olduğu için
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;

	
}
