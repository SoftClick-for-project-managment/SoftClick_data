package softclick.server.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softclick.server.data.entities.Expense;
import softclick.server.data.entities.ExpenseCategory;
import softclick.server.data.entities.Task;

import java.util.List;

@Repository

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    @Override
    Expense getReferenceById(Long aLong);

    List<Expense> findByTypeExpense(String typeExpense);
    List<Expense> findByExpenseCategory(ExpenseCategory expenseCategory);


    Expense findByTask(Task task);

    @Override
    boolean existsById(Long aLong);

    @Override
    void deleteById(Long aLong);

    boolean existsByTask(Task task);
}