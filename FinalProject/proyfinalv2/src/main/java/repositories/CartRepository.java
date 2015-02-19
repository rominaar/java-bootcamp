package repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import classes.Cart;

public interface CartRepository extends JpaRepository<Cart, String> {

	public Cart save(Cart cart);

}
