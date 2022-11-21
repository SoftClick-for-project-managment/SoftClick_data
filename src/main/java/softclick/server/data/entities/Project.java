package softclick.server.data.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Data
@Table(name = "project")
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProject ;

    @Column(name="name_project", nullable = false)
    private String nameProject ;

    @Column(name="description_projet",nullable = false)
    private String descriptionProject ;

    @Column(name="revenue_project")
    private Double revenue;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_priority")
    private Domain domainProjet;

    @Column(name = "date_debut" , nullable = false)
    private Date dateDebut ;

    @Column(name = "date_fin" , nullable = true)
    private Date dateFin;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "id",nullable = false)
    private Employee chefProject;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_status",nullable = true)
    private Status projectStatus;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_priority" , nullable = false)
    private Priority projectPriority;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "project")
    private Set<Invoice> invoices = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "project")
    private Set<Task> tasks = new HashSet<>();



}
