package softclick.server.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import softclick.server.data.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {



}
