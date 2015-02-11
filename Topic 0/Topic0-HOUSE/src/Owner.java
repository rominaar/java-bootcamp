
public class Owner {

	private Builder builder = null;

	public Owner(Builder builder) {
		this.builder = builder;
	}

	public void constructHouse() {
		builder.buildnumRooms();
		builder.buildfloors();
		builder.buildwalls();
	}

	public House getHouse() {
		return builder.getHouse();
	}

}