
public class Hospital {
	
	private String name;
	private Space[] spaces;
	private SpaceFactory spaceFactory;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String toString() {
		return "This hospital is called " + name + ". Details:  " ;
	}
	
	public void printSpaces() { 
    	int i;
    	for (i=0; i < spaces.length; i++)
    		System.out.println(spaces[i].description());
      }

	public SpaceFactory getSpaceFactory() {
		return spaceFactory;
	}

	public void setSpaceFactory(SpaceFactory spaceFactory) {
		this.spaceFactory = spaceFactory;
	}

	public Space[] getSpaces() {
		return spaces;
	}

	public void setSpaces(Space[] spaces) {
		this.spaces = spaces;
	}

}

