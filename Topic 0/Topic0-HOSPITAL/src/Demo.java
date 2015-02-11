
public class Demo {

		public static void main(String[] args) {
			
			
			HBuilder builder = new HospitalBuilder();
			Director director = new Director(builder);
			
			Hospital hospital = director.getHospital();
			System.out.println("Hopital details: " + hospital.toString());
			director.constructHouse();
			
		 }

}
