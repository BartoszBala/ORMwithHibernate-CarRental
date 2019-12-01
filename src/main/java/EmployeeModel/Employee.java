package EmployeeModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_employee")
    private Long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="day_start_work")
    private LocalDate startWork;
    @Column(name="email")
    private String email;
    @Column(name="phone")
    private String phone;
    @Column(name="dob")
    private LocalDate birthDate;


}
