package softclick.server.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import softclick.server.data.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
