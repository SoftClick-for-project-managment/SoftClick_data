package softclick.server.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softclick.server.data.entities.ExpenseCategory;
@Repository

public interface ExpenseCategoryRepository extends JpaRepository<ExpenseCategory, Long> {
}