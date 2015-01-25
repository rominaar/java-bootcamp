import java.util.List;


public class CashStrategy implements PaymentStrategy {
		 
	    public CashStrategy(){ }
	    
	    
	    @Override
	    public void pay(int amount, int id) {
	        System.out.println(amount + " paid with Cash.... ID: " + id);
	    }
	    
	 
	    public int calculateTotal(List<Item> items){
	        int sum = 0;
	        Item mostexpensive = new Item (0);
	        for(Item item : items){
	        	if (item.getPrice() > mostexpensive.getPrice()) {
	        		mostexpensive = item;
	        		}
	        }
	        for (Item item : items) {
	        	if (!item.equals(mostexpensive)) {
	        		sum += item.getPrice();
	              }
	        }
	        sum = sum + ((mostexpensive.getPrice() * 10)/100);
	        return sum;
	    }
}
