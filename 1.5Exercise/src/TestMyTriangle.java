
public class TestMyTriangle {
	public static void main(String[] args) {
		MyPoint v1 = new MyPoint(3, 0);
		MyPoint v2 = new MyPoint(5, 0);
		MyPoint v3 = new MyPoint(3, 6);
		MyTriangle t1 = new MyTriangle(v1, v2, v3);
		System.out.println(t1.toString());   // explicit call MyPoint
	    
		MyTriangle t2 = new MyTriangle(2, 5, 4, 3, 2, 1);
	    System.out.println(t2.toString());
	    
	    System.out.println("Perimeter: " + t2.Perimeter());
	    t2.printType();
	  }
}