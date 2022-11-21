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

    @Column(name = "name_domain")
    private String name_domain;

    public Domain(Long id_domain, String name_domain) {
        this.id_domain = id_domain;
        this.name_domain = name_domain;
    }

}
