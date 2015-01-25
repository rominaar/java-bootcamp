
public class Item {
 
    private String iname;
    private int price;
     
    public Item(String iname, int price){
        this.iname=iname;
        this.price=price;
    }
    
    public Item (int price){
    	this.price=price;
    }
 
    public String getIname() {
        return iname;
    }
 
    public int getPrice() {
        return price;
    }
     
    
}