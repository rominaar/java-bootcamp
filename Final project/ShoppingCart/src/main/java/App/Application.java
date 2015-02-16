package App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import classes.Customer;

public class Application {
	
	 public void Application1 () {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("/context.xml");
		 
		 Customer cu1 = context.getBean("customer", Customer.class);
	
}

	
}
