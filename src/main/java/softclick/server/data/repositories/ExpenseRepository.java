package softclick.server.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softclick.server.data.entities.Expense;
@Repository

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}