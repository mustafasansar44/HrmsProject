package kodlamaio.hrms.entities.abstracts;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})


public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false)
    private int id;

    @Column(name = "email")
    @Email
    @NotBlank
    @NotNull(message = "Düzgün biçimli bir email adresi değil.")
    private String email;

    @Column(name = "password")
    @NotBlank
    @NotNull
    private String password;

    @CreationTimestamp
    @Column(name = "created_at")
    private Date created_at;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "role_id")
    private Role role;

}

