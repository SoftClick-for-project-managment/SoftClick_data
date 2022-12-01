package softclick.server.data.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Skill implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String skillName;

    @ManyToMany
    @JoinTable( name = "Employee_Skill",
            joinColumns = @JoinColumn( name = "idSkill" ),
            inverseJoinColumns = @JoinColumn( name = "idEmployee" ) )
    private List<Employee> employees;

    public Skill(Long id, String skillName) {
        this.id = id;
        this.skillName = skillName;
    }
}
