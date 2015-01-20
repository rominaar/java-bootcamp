
public class MyPoint {
		   private int x, y;
		 
		   // Constructors
		   public MyPoint(int x, int y) {
		      this.x = x;
		      this.y = y;
		   }
		   
		   // default (no-arg) constructor
		   public MyPoint() {    
		      x = 0;
		      y = 0;
		   }
		 
		   // Getter and setter for private variables
		   public int getX() { 
		      return x; 
		   }
		   public void setX(int x) { 
		      this.x = x; 
		   }
		   public int getY() { 
		      return y; 
		   }
		   public void setY(int y) { 
		      this.y = y; 
		   }
		   
		 //method setXY() to set both x and y
		   public void setXY(int x, int y){
			   this.x = x; 
			   this.y = y;
		   }
		   
		// Overloading method distance()
		   public double distance(int x, int y) {   // this version takes two ints as arguments
		      int xDiff = this.x - x;
		      int yDiff = this.y - y;
		      return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
		   }
		     
		   public double distance(MyPoint another) { // this version takes a MyPoint instance as argument
		      int xDiff = this.x - another.x;
		      int yDiff = this.y - another.y; 
		      return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
		   }
		 
		   // toString() to describe itself
		   public String toString() { 
		      return "(" + x + "," + y + ")"; 
		   }
}