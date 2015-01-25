import java.util.List;



public interface PaymentStrategy {
		 
	    public void pay(int amount, int id);
	    
	    public int calculateTotal(List<Item> items);
	   
	
}
