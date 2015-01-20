

public class Book {
	private String name;
	private Author [] authors;
	private double price;
	private int qtyInStock;
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	
	public Author [] getAuthors() {
		return authors;
		}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	//1st constructor
		public Book (String name, Author[] authors, double price) {
			this.name = name;
			this.authors = authors;
			this.price = price;
		}
		
	//2nd constructor
		public Book (String name, Author[] authors, double price, int qtyInStock) {
			this.name = name;
			this.authors = authors;
			this.price = price;
			this.qtyInStock = qtyInStock;
		}
		
	//public String toString() {
		public String toString() {	
				return name + " by " + authors.length + " authors";
	    	}
		
		//new methods in the Book class to return the name, email and gender of the author of the book
	    public void printAuthors() { 
	    	int i;
	    	for (i=0; i < authors.length; i++)
	    		System.out.println(authors[i].toString());
	      }
	    }
