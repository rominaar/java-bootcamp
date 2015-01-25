import java.util.List;


public class PaypalStrategy implements PaymentStrategy {
 
    private String email;
    private String password;
     
    public PaypalStrategy(String email, String password){
        this.setEmail(email);
        this.setPassword(password);
    }
     
    @Override
    public void pay(int amount, int id) {
        System.out.println(amount + " paid using Paypal....ID: " + id);
    }
    
    public int calculateTotal(List<Item> items){
        int sum = 0;
        Item cheapest = items.get(0);
        for(Item item : items){
        	if (item.getPrice() < cheapest.getPrice()) {
        		cheapest = item;
        		}
        }
        for (Item item : items) {
        	if (!item.equals(cheapest)) {
        		sum += item.getPrice();
              }
        }
        return sum;
           
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}  
}   
   