
//import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
 
public class ShoppingCart {
 
    //List of items
    private List<Item> items;
    private int IdTransaction;
    
     
    public ShoppingCart(){
        this.items=new ArrayList<Item>();
        this.IdTransaction = 1;
    }
     
    public void addItem(Item item){
        this.items.add(item);
    }
     
    public void removeItem(Item item){
        this.items.remove(item);
    }
    
    public void printListItems () {
    	
        for(Item item : items){
            System.out.println("- Item name: " + item.getIname() + "... $ " + item.getPrice()) ;
        }
    }
     
     
    public void pay(PaymentStrategy paymentMethod){
        int amount = paymentMethod.calculateTotal(items);
        paymentMethod.pay(amount, IdTransaction);
        setIdTransaction(getIdTransaction() + 1);
        
        
    }

	public int getIdTransaction() {
		return IdTransaction;
	}

	public void setIdTransaction(int idTransaction) {
		this.IdTransaction = idTransaction;
	}
}