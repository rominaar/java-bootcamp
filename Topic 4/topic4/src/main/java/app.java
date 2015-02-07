import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Products.Item;
import Transactions.TransactionFactory;


public class app {

	public static void main(String[] args){
		ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("/context.xml");
		TransactionFactory transactionFactory = (TransactionFactory) applicationcontext.getBean("TransactionFactory");
		//System.out.println(item.toString());
	}
}
