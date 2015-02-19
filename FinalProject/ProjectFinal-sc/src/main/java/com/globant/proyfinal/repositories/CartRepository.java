package com.globant.proyfinal.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.globant.proyfinal.classes.*;

public interface CartRepository extends JpaRepository<Cart, String> {

	public Cart save(Cart cart);

}
