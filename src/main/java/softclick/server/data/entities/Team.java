package softclick.server.data.entities;

import java.io.Serializable;
import java.util.Collection;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

public class Team implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTeam;
    @Column(nullable = false)
    private String team_Name;
    @Column(nullable = false)
    private String description;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "members")
    private Collection<Employee> members;
    public Team(String team_Name, String description, Collection <Employee> members) {
        this.team_Name = team_Name;
        this.description = description;
        this.members = members;

    }
}
