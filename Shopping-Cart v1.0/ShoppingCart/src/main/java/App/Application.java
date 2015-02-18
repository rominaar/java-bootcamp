package App;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.repository.CrudRepository;

import repositories.CustomerRepository;
import repositories.ProductRepository;
import classes.Customer;
import classes.Product;




public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class);
		LoadProducts lp = context.getBean(LoadProducts.class);
		lp.generate();
	}
}