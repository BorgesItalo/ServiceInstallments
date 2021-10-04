package entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	
	private Integer number;
	private Date date;
	private Double totalValue;

	
	List<Installment> installments = new ArrayList<>();
	

	public Contract(Integer number, Date date, Double totalValue) {
		super();
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		

	}

	public Integer getnumber() {
		return number;
	}

	public void setnumber(Integer number) {
		this.number = number;
	}

	public Date getdate() {
		return date;
	}

	public void setdate(Date date) {
		this.date = date;
	}

	public Double gettotalValue() {
		return totalValue;
	}

	public void settotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public void setInstallments(List<Installment> installments) {
		this.installments = installments;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
	
	
	
	
}
