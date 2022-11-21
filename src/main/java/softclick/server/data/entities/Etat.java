package softclick.server.data.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name = "etats")
public class Etat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_etat;

    @Column(name = "name")
    private String name_etat;

    public Etat(Long id_etat, String name_etat) {
        this.id_etat = id_etat;
        this.name_etat = name_etat;
    }
}
