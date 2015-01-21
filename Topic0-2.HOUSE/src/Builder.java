
public class Builder {
	private House house;
	private Room [] room;
	private int numRooms;
	
	
	//public Builder addRooms() {	    this.house = new House();	  }
	public Builder () {
		this.house = new House();
		numRooms = 0;
	}
	
	public Builder (House house) {
		this.house = house;
		numRooms = 1;
	}
	
	public Builder buildHouse(String name, int walls, int doors, int windows) {
        this.house.addRooms(new Room(name, walls, doors, windows)); //build the room and add it to the house
        return this;
	}
	
	//public String toString() {
			public String toString() {	
				house.printRooms();
				return house.toString();
				
		    	}

	  public House getHouse() {
	    return this.house;
	  }



	public Room [] getRoom() {
		return room;
	}



	public void setRoom(Room [] room) {
		this.room = room;
	}
	
	public void setHouse(House house) {
		this.house = house;
	}
	
	
}

