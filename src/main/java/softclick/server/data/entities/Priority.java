package softclick.server.data.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name = "priority")
public class Priority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_priority;

    @Column(name = "name_priority")
    String name_priority;

    @Column(name = "dugree_priority")
    private Float  dugree_priority;

    public Priority(Long id_priority, String name_priority, Float dugree_priority) {
        this.id_priority = id_priority;
        this.name_priority = name_priority;
        this.dugree_priority = dugree_priority;
    }
}
