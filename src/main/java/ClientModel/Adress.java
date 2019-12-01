package ClientModel;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Adress {

    @Column(name="country")
    private String country;
    @Column(name="city")
    private String city;
    @Column(name="post_code")
    private String postcode;
    @Column(name="street")
    private String street;
    @Column(name="residence_number")
    private String numberOfResidence;

}
