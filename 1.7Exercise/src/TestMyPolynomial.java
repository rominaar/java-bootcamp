
public class TestMyPolynomial {
	public static void main(String[] args) {
	// Can invoke with a variable number of arguments
	MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
	MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
	// Can also invoke with an array
	double[] coeffs = {1.2, 3.4, 5.6, 7.8};
	MyPolynomial p3 = new MyPolynomial(coeffs);
	
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	System.out.println(p3.toString());
	
	System.out.println("El grado del polinomio 1 es:");
	System.out.println(p1.getDegree());
		
   }
}