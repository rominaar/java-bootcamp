
import java.util.ArrayList;
import java.util.List;

public class Offer {
	private String oname;
	private List<Item> items;
	private int price;
	
	public Offer(){
        this.items=new ArrayList<Item>();
    }
	
	public Offer(String oname, int price){
        this.oname = oname;
        this.price = price;
		this.items=new ArrayList<Item>();
    }
     
    public void addItemToOffer(Item item){
        this.items.add(item);
    }
     
    public void removeItemFromOffer(Item item){
        this.items.remove(item);
    }

	public int getPrice() {	return price;}

	public void setPrice(int price) {	this.price = price; }

	public String getOname() {	return oname; }

	public void setOname(String oname) { 	this.oname = oname;	}
	
	public void printOffer () {
		System.out.println("OFFER: " + oname + "--->  $" + price + "!!");
		for(Item item : items){
    		System.out.println("- Item name: " + item.getIname() + "... $ " + item.getPrice()) ;
        }
    }
}
