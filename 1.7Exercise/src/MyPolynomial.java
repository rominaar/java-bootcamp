
public class MyPolynomial {
	private double [] coeffs;
	
	//constructor
	 public MyPolynomial(double... coeffs) {  // varargs
		      this.coeffs = coeffs;                 // varargs is treated as array
		  }
	 public int getDegree() {
	        int d = 0;
	        for (int i = 0; i < coeffs.length; i++)
	            if (coeffs[i] != 0) d = i;
	        return d;
	 }
	 
	 public String toString() {
	        if (coeffs.length ==  0) return "" + coeffs[0];
	        if (coeffs.length ==  1) return coeffs[1] + "x + " + coeffs[0];
	        String s = coeffs[coeffs.length] + "x^" + coeffs.length;
	        for (int i = coeffs.length-1; i >= 0; i--) {
	            if      (coeffs[i] == 0) continue;
	            else if (coeffs[i]  > 0) s = s + " + " + ( coeffs[i]);
	            else if (coeffs[i]  < 0) s = s + " - " + (-coeffs[i]);
	            if      (i == 1) s = s + "x";
	            else if (i >  1) s = s + "x^" + i;
	        }
	        return s;
	    }
}
