package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employees"})

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

}

/*

@OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
private Employees employees;
*/

//private Employees employees;  //employees email ile map edildi (ilişkilendirildi.)
//@OneToOne(mappedBy = "id")  // buradaki id employeeste tanımladıgımız id