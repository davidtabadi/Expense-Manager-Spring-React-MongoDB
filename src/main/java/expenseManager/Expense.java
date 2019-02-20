package expenseManager;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Expense {

	private String id;
	private String description;
	private Integer amount;
	private String month;
	private int year;

	public Expense() {
		super();
	}

	public Expense(String description, Integer amount, String month, int year) {
		super();
		this.description = description;
		this.amount = amount;
		this.month = month;
		this.year = year;
	}

	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Expense [id=" + id + ", description=" + description + ", amount=" + amount + ", month=" + month
				+ ", year=" + year + "]";
	}

}
