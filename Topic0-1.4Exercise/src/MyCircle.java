
public class MyCircle {
	private int radius;
	private MyPoint center;

	//1st constructor
	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}
		
	//2nd constructor
	public MyCircle(int x, int y, int radius) {
			center = new MyPoint(x,y);
			this.radius = radius;		

	}
    // Getter and setter
	public MyPoint getCenter() {return center;}
	public void setCenter(MyPoint center) {	this.center = center;}

	public int getRadius() {return radius;}
	public void setRadius(int radius) {	this.radius = radius;}
	
	public int getCenterX() { return center.getX(); }
	public int getCenterY() { return center.getY();	}
	
	public void setCenter(int x, int y) { 
		center.setX(x); 
		center.setY(y);
	}
	
	// toString() to describe itself
	   public String toString() { 
	      return "Circle @ " + center + "radius = " + radius; 
	   }
	   
	 //getArea
	   public double getArea() {
		      return radius*radius*Math.PI;
		   }

}
