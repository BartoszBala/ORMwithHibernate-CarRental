package ClientModel;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name="clients")
public class Client {

    @Id
    @Column(name="id_client")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="registry_day")
    private LocalDate registryDate;
    @Column(name="phone")
    private String phoneb9umber;
    @Column(name="email")
    private String email;
    @Column(name="dob")
    LocalDate dateOfBirth;
    @Embedded
    private Adress address;
}
