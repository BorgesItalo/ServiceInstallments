package entites_servicos;

import java.util.Calendar;
import java.util.Date;

import entites.Contract;
import entites.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {

		double basicQuota = contract.gettotalValue() / months;
		for (int i = 1; i <= months; i++) {
			Date dueDate = addMonths(contract.getdate(), i);
			double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			double payRate = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
			

			contract.getInstallments().add(new Installment(dueDate, payRate));

		}
	}

	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}

}
