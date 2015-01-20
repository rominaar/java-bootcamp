
public class TestMyTime {
	public static void main(String[] args) {
		   
		MyTime t1 = new MyTime(23, 44, 12);
		MyTime t2 = new MyTime(12, 33, 32);
	   
		System.out.println(t1.toString());
		System.out.println(t2.toString());
				
		
	    System.out.printf("Update this instance to the next second: ");
	    t2.nextSecond();
	    System.out.println(t2.toString());
	    }
}
