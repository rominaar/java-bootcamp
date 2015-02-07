package Transactions;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Notifications.Observer;
import Products.Product;
import Shop.ShoppingCart;
import Notifications.Subject;

@Component
public class TransactionFactory implements Subject{

	private static TransactionFactory transactionFactory = null;
	Set<Observer> transactionObservers;
	@Autowired
	Transaction transaction;
	
	
	
	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	private TransactionFactory() {
		transactionObservers = new HashSet<Observer>();

	}
	
	public static TransactionFactory getInstance() {
		if (transactionFactory == null) {
			transactionFactory = new TransactionFactory();
		}
		return transactionFactory;
	}
	
	public Transaction getTransaction(String transactionType,ShoppingCart shoppingCart){
		switch(transactionType){
		case "CREDIT_CARD":	if(shoppingCart.getUser().getCardNumber()!=0 && shoppingCart.getUser().getName()!=null){
								transaction = new CreditCard(shoppingCart);
								doNotify(transaction);
								return transaction;
							}
							break;
		case "PAYPAL" : 	if(shoppingCart.getUser().getEmail()!=null && shoppingCart.getUser().getPassword()!=null){
								transaction = new PayPal(shoppingCart);
								doNotify(transaction);
								return transaction;
							}
							break;
		default:			transaction = new Cash(shoppingCart);
							doNotify(transaction);
							return transaction;
		}
		System.out.println("Transaction failed, missing user data");
		return null;
	}

	
	@Override
	public void addObserver(Observer transactionObserver) {
		transactionObservers.add(transactionObserver);		
	}

	@Override
	public void removeObserver(Observer transactionObserver) {
		transactionObservers.remove(transactionObserver);
		
	}

	@Override
	public void doNotify(Transaction transaction) {
		Iterator<Observer> it = transactionObservers.iterator();
		while (it.hasNext()) {
			Observer transactionObserver = it.next();
			transactionObserver.doUpdate("\nA transaction was done with the number: "+ transaction.getTransactionNumber());
		}
		
	}

	@Override
	public void doNotify(Product product) {
		// TODO Auto-generated method stub
		
	}
	
	

}
