package softclick.server.data.entities;

import java.io.Serializable;
import java.util.Collection;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

public class Team implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTeam;
    @Column(nullable = false)
    private String Team_Name;
    @Column(nullable = false)
    private String Description;
    @Column(nullable = false)
    private String[] Members;
    @Column(nullable = false)
    private int Members_number;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Teamemployees")
    private Collection<Employee> employees;
    public Team(Long idTeam, String team_Name, String description, String[] members, int members_number) {
        this.idTeam = idTeam;
        Team_Name = team_Name;
        Description = description;
        Members = members;
        Members_number = members_number;
    }
}
