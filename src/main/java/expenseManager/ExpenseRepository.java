package expenseManager;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense, String> {

	public List<Expense> findByMonthAndYear(String month, int year);

	public List<Expense> findByYear(int year);

}
