package softclick.server.data.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name = "domain")
public class Domain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id_domain;

    @Column(name = "name")
    private String name;

    public Domain(Long id_domain, String name) {
        this.id_domain = id_domain;
        this.name = name;
    }

}
