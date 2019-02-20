package expenseManager;

import java.util.List;

public interface ExpenseService {

	public List<Expense> findAll();

	public List<Expense> findByMonthAndYear(String month, int year);

	public List<Expense> findByYear(int year);

	public void saveOrUpdateExpense(Expense expense);

	public void deleteExpense(String id);
}
