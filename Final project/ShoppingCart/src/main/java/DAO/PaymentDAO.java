package DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import classes.*;
import repositories.PaymentRepository;

@Component
public class PaymentDAO {
	
	@Autowired
	private PaymentRepository paymentrepository;

	public Payment createPayment(Customer customer, String type, Cart cart) {
		double total = cart.getTotal();
		//calculate discount
		if (type == "cash") { total = 0.5 * total; }
			
		return this.paymentrepository.save(new Payment(customer, type, total, cart));
	}


}
