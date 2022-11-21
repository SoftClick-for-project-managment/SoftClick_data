package softclick.server.data.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name = "statuses")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_status;

    @Column(name = "name_status")
    private String name_status;

    public Status(Long id_status, String name_status) {
        this.id_status = id_status;
        this.name_status = name_status;
    }
}
