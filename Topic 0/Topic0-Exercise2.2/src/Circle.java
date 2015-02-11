
public class Circle extends Shape{         
   private double radius;
   
   // 1st constructor, which sets both radius and color to default
   public Circle() {
      radius = 1.0;
   }
   
   // 2nd constructor 
   public Circle(double radius) {
      this.radius = radius;
   }
   
/// 3rd constructor 
   public Circle (double radius, String color, boolean filled) {
      this.radius = radius;
   }
   
   // Getters and setters
   public double getRadius() {
     return radius; 
   }
   
   // A public method for computing the area of circle
   public double getArea() {
      return radius*radius*Math.PI;
   }
   
   // Setter for instance variable radius
   public void setRadius(double radius) {
	   this.radius = radius;  
   }
 
   //getPerimeter
   public double getPerimeter() {
	      return 2*radius*Math.PI;
	   }
   
 /* Setter for instance variable color
   public void setColor(String color) {
	   this.color = color;  } */
   
   @Override
   public String toString() {      // in Circle class
	   return "A Circle with radius = " + radius + ", which is a subclass of " + super.toString();
	 }
   
}

