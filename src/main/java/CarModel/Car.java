package CarModel;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name="cars")
public class Car {


    @Id
    @Column(name="id_car")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="brand")
    private String brand;
    @Column(name="model")
    private String model;
    @Column(name="type_ofCar")
    private String type;
    @Column(name="first_register")
    private LocalDate firstRegister;
    @Column(name="milage")
    private long milage;
    @Column(name="status")
    private boolean status;


}
