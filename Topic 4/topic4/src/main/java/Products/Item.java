package Products;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Notifications.Observer;
import Products.Product;
import Shop.ShoppingCartVisitor;
import Transactions.Transaction;

@Component
public class Item implements Product {

	private String name;
	private double price;
	Set<Observer> itemObservers;

	
	public Item(){
		name="item1";
		price=24.0;
	}
	

	public Item(String name, double price) {
		this.name = name;
		this.price = price;
		itemObservers = new HashSet<Observer>();

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
		doNotify(this);
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	@Override
	public void accept(ShoppingCartVisitor visitor) {
		visitor.add(this);
	}

	@Override
	public void addObserver(Observer itemObserver) {
		itemObservers.add(itemObserver);
	}

	@Override
	public void removeObserver(Observer itemObserver) {
		itemObservers.remove(itemObserver);
	}

	@Override
	public void doNotify(Product item) {
		Iterator<Observer> it = itemObservers.iterator();
		while (it.hasNext()) {
			Observer itemObserver = it.next();
			itemObserver.doUpdate("the price of item: " + item.getName()
					+ " was modified to: " + item.getPrice());
		}
	}

	public void doNotify(Transaction transaction) {
	}
}
