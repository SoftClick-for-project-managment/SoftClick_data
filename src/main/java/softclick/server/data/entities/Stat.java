package softclick.server.data.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name = "stats")
public class Stat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_stat;

    @Column(name = "name")
    private String name_stat;

    public Stat(Long id_stat, String name_stat) {
        this.id_stat = id_stat;
        this.name_stat = name_stat;
    }
}
