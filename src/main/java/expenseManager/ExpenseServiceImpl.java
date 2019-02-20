package expenseManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;

	@Transactional
	@Override
	public List<Expense> findAll() {
		return expenseRepository.findAll();
	}

	@Transactional
	@Override
	public List<Expense> findByMonthAndYear(String month, int year) {
		return expenseRepository.findByMonthAndYear(month, year);
	}

	@Transactional
	@Override
	public List<Expense> findByYear(int year) {
		return expenseRepository.findByYear(year);
	}

	@Transactional
	@Override
	public void saveOrUpdateExpense(Expense expense) {
		expenseRepository.save(expense);

	}

	@Transactional
	@Override
	public void deleteExpense(String id) {
		expenseRepository.deleteById(id);

	}

}
