package App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

     LoadProducts obj = LoadProducts context.getBean("helloWorld");

     obj.getMessage();
  

	
}
