
public class ShoppingCartTest {
 
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
         
        Item item1 = new Item("TV1",10);
        Item item2 = new Item("TV2",10);
        Item item3 = new Item("Fridge1",10);
        Item item4 = new Item("Computer",10);
        Item item5 = new Item("Cellphone",10);
         
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);
        cart.addItem(item5);
        
        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
         
        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456"));
        
       //pay with cash
        cart.pay(new CashStrategy());
         
        cart.printListItems ();
        
        //Offer
        Offer offer = new Offer ("TVs", 15);
        offer.addItemToOffer(item1);
        offer.addItemToOffer(item2);
        offer.printOffer();
    }
 
}