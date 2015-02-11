
public class Rectangle extends Shape{         
	   private double width ;
	   private double length;
	   
	   // 1st constructor, which sets both radius and color to default
	   public Rectangle() {
	      width = 1.0;
	      length = 1.0;
	   }
	   
	   // 2nd constructor 
	   public Rectangle(double width, double length) {
	      this.width = width;
	      this.length = length;
	   }
	   
	/// 3rd constructor 
	   public Rectangle(double width, double length, String color, boolean filled) {
		      this.width = width;
		      this.length = length;
		    }
	   
	   // Getters and setters
	   public double getWidth() {
			return width;
		}
		public void setWidth(double width) {
			this.width = width;
		}
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}

	   
	   
	   // A public method for computing the area of rectangle
	   public double getArea() {
	      return length*width;
	   }
	  
	 
	   //getPerimeter
	   public double getPerimeter() {
		   return (2*length)+(2*width);
		   }
	   
	 
	   
	   @Override
	   public String toString() {      // in Rectangle class
		   return "A Rectangle with width = " + width + "and length = " + length + ", which is a subclass of " + super.toString();
	   }

}
