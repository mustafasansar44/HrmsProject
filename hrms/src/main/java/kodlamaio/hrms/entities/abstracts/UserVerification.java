package kodlamaio.hrms.entities.abstracts;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "verification")
@PrimaryKeyJoinColumn(name = "user_id")   // Veritabanındaki user_id ye aktar

public class UserVerification extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false)
    private int id;

    @Column(name = "activation_code")
    private String activationCode;

    @Column(name = "is_confirmed")
    private boolean isConfirmed;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "expires_date")
    private Date expiresDate;
}
