package softclick.server.data.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@NoArgsConstructor
@Data
public class Competences implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String competenceName;

    public Competences(Long id, String competenceName) {
        this.id = id;
        this.competenceName = competenceName;
    }
}
