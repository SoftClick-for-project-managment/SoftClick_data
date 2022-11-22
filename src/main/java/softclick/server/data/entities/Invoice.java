package softclick.server.data.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@Data
public class Invoice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private double total;
    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;

    public Invoice(Date date, Double total) {
        this.date = date;
        this.total = total;
    }
}
