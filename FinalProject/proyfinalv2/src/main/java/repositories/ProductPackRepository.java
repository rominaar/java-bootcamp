package repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import classes.ProductPack;

public interface ProductPackRepository extends JpaRepository<ProductPack, String> {

}
