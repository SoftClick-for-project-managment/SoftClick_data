package softclick.server.data.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;

@Entity
@NoArgsConstructor
@Data
@Proxy(lazy=false)
@Table(name = "users")
public class User implements Serializable, Comparable<User> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private boolean isActive;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles")
    private Collection<Role> roles;
    @OneToOne
    private Employee employee;

    public User(String username, String password, boolean isActive) {
        this.username = username;
        this.password = password;
        this.isActive = isActive;
    }

    @Override
    public int compareTo(User user) {
        return Comparator.comparing(User::getUsername).compare(this, user);
    }
}
