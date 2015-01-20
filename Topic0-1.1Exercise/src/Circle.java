
public class Circle {           // save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   
   // 1st constructor, which sets both radius and color to default
   public Circle() {
      radius = 1.0;
      color = "red";
   }
   
   // 2nd constructor with given radius, but color default
   public Circle(double radius) {
      this.radius = radius;
      color = "red";
   }
   
// 3rd constructor with given radius, but color default
   public Circle (double radius, String color) {
      this.radius = radius;
      this.color = color;
   }
   
   // A public method for retrieving the radius
   public double getRadius() {
     return radius; 
   }
   
   // A public method for computing the area of circle
   public double getArea() {
      return radius*radius*Math.PI;
   }
   
   //getter Color
   public String getColor(){
	   return color;
   }
   
   // Setter for instance variable radius
   public void setRadius(double radius) {
	   this.radius = radius;   // "this.radius" refers to the instance variable
       // "radius" refers to the method's argument
   }
 
   // Setter for instance variable color
   public void setColor(String color) {
	   this.color = color;
   }
   
   public String toString() {
	   return "Circle: radius=" + radius + " color=" + color;
	}
}

