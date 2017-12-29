package lab.phb.carrentalapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "rental")
public class Mobil {

    @Id @Getter @Setter
    private int id;
    @Getter @Setter
    private String nopol;
    @Getter @Setter
    private String merkTipe;

}