package entites;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dueDate;
	private Double amount;
	
	public Installment() {

	}

	public Installment(Date dueDate, Double amount) {
		super();
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("" + sdf.format(dueDate) +" - "+ String.format("%.2f", amount) );
		
		return sb.toString();
		
	}
	
	
}
