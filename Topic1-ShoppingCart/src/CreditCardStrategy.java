import java.util.List;


public class CreditCardStrategy implements PaymentStrategy {
 
    private String name;
    private String cardNumber;
    
     
    public CreditCardStrategy(String name, String cardNumber){
        this.setName(name);
        this.setCardNumber(cardNumber);
    }
    

    public String getName() {	return name; }
	public void setName(String name) {	this.name = name; }
	public String getCardNumber() {	return cardNumber; }
	public void setCardNumber(String cardNumber) {	this.cardNumber = cardNumber; }
 
	
    @Override
    public void pay(int amount, int id) {
    	 System.out.println(amount +" paid with Credit card.... ID: " + id);
    }
    
    public int calculateTotal(List<Item> items){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return ((sum * 90) / 100);
    }
	
}