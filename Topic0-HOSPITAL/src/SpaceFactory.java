
public class SpaceFactory {

		public Space getSpace(String type) {
			if ("emergency".equals(type)) {	return new Emergency();	} 
			if ("room".equals(type)) { return new Room();}
			if ("bathroom".equals(type)) {	return new Bathroom();	}
			if ("operating room".equals(type)) { return new OperatingRoom(); }
			if ("pharmacy".equals(type)) {	return new Pharmacy();	}
			else { return null;}
		}

}