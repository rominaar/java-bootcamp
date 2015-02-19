package repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import classes.Cart;
import classes.Customer;
import classes.Payment;

public interface PaymentRepository extends JpaRepository<Payment, String> {

	

}
