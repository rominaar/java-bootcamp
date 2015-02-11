
public class TestHouse {
	public static void main(String[] args) {

		Builder builder = new HouseBuilder();
		Owner owner = new Owner(builder);
		owner.constructHouse();
		House house = owner.getHouse();
		System.out.println("House details: " + house);
		
		
	}
}
