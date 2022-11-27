package softclick.server.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import softclick.server.data.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
