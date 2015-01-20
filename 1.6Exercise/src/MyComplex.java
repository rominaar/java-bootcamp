
public class MyComplex {
	private double real, imag;

	//Getters and setters
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	//constructor
	public MyComplex(double real, double imag) {
	      this.real = real;
	      this.imag = imag;
     }
	
	public void setValue(double real, double imag){
		this.real = real;
	    this.imag = imag;
	}
	
	// toString() to describe itself
	   public String toString() { 
	      return "(" + real + ", "+ imag + "i )"; 
	   }
	   
	 //Methods isReal()
	   public boolean isReal(){
		   return (imag == 0);
	   }
	   
	 //Methods isImaginary()
	   public boolean isImaginary(){
		   return (real == 0);
	   }
	   
	 //Methods equals
	   public boolean equals(double real, double imag){
		   return (this.real == real && this.imag == imag);
	   }
	   
	 //Methods overloaded equals(MyComplex another)
	   public boolean equals(MyComplex another){
		   return (this.real == another.getReal() && this.imag == another.getImag());
	   }
	   
	 //Methods magnitude
	   public double magnitude(){
		   return (Math.sqrt(real + imag));
	   }
	   
	 //Methods argumentInRadians()
	   public double argumentInRadians(){
		   return Math.atan2(this.real, this.imag);
	   }
	   
	 //Methods argumentInDegrees()
	   //public int argumentInDegrees(){
		  // return Math.atan2(this.real, this.imag);}  ??
	   
	  //method conjugate()
	   public MyComplex conjugate(){
		   return new MyComplex(this.real, -imag);
	   }
	   
	 //method add(MyComplex another)
	   public MyComplex add(MyComplex another){
		   return new MyComplex((this.real + another.getReal()), (this.imag + another.getImag()));
	   }
	   
	 //method subtract(MyComplex another)
	   public MyComplex subtractd(MyComplex another){
		   return new MyComplex((this.real - another.getReal()), (this.imag - another.getImag()));
	   }
	   
	 //method multiplyWith(MyComplex another)
	   public MyComplex multiplyWith(MyComplex another){
		   return new MyComplex((this.real * another.getReal() - this.imag * another.getImag()), 
				   (this.real * another.getImag() - (this.imag * another.getReal())));
	   }
	   
	   
	   
}
	   
