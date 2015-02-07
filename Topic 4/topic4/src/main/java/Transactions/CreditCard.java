package Transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Shop.ShoppingCart;

@Component
public class CreditCard extends Transaction{
	private String name;
	private int cardNumber;
	
	public CreditCard(){}
	
	public CreditCard(ShoppingCart shoppingCart){
		total=shoppingCart.getTotal();
		name=shoppingCart.getUser().getName();
		cardNumber=shoppingCart.getUser().getCardNumber();
		transactionNumber++;
		calculateDiscount();
	}

	@Override
	public void calculateDiscount() {
		totalWhithDiscount = total - (total * 0.10);
		
		System.out.println("credit card: " + totalWhithDiscount + " whith the number card: "+ cardNumber + " user: "+ name+"\n");
	}
}
