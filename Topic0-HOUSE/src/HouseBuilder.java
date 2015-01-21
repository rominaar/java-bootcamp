
public class HouseBuilder implements Builder {

	private House house;

	public HouseBuilder() {
		house= new House();
	}

	@Override
	public void buildnumRooms() {
		house.setNumRooms(1);
	}

	@Override
	public void buildfloors() {
		house.setFloors(1);
	}

	@Override
	public void buildwalls() {
		house.setWalls(4);
	}
	
	@Override
	public void buildwindows(){
		house.setWindows(0);
	};
	
	@Override
	public void builddoors(){
		house.setDoors(1);
	}
	
	@Override
	public House getHouse() {
		return house;
	}

}