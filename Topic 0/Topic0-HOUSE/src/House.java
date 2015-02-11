
public class House {

	private int numRooms;
	private int floors;
	private int walls ;
	private int windows;
	private int doors;
	

	public String toString() {
		return "This house have: " + numRooms + " rooms; floors:" + floors+ " walls: " + walls + " windows:" + windows + 
				" doors:" + doors;
	}

	

	public int getNumRooms() {
		return numRooms;
	}

	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public int getWalls() {
		return walls;
	}

	public void setWalls(int walls) {
		this.walls = walls;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

}