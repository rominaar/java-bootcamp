
public class HospitalBuilder implements HBuilder {

		private Hospital hospital;
		private SpaceFactory spaceFactory;
		//private Space[] spaces;
		

		public HospitalBuilder() {
			hospital = new Hospital();
			
		}

		@Override
		public void buildname() {
			hospital.setName("Hospital Padilla");
		}

		@Override
		public void buildspaces() {
			SpaceFactory spaceFactory = new SpaceFactory();

			Space s1 = spaceFactory.getSpace("emergency");
			System.out.println("s1 description: " + s1.description());

			Space s2 = spaceFactory.getSpace("bathroom");
			System.out.println("s2 description: " + s2.description());
			
			Space s3 = spaceFactory.getSpace("room");
			System.out.println("s3 description: " + s3.description());
			
			Space s4 = spaceFactory.getSpace("room");
			System.out.println("s4 description: " + s4.description());
			
			Space s5 = spaceFactory.getSpace("operating room");
			System.out.println("s5 description: " + s5.description());
			
			Space s6 = spaceFactory.getSpace("pharmacy");
			System.out.println("s6 description: " + s6.description());
			
			//spaces[1] = spaceFactory.getSpace("room");
			//spaces[2] = spaceFactory.getSpace("emergency");
			//hospital.setSpaces(spaces);
		}
		
		@Override
		public void buildSpaceFac() {
			
			hospital.setSpaceFactory(spaceFactory);
			}

		@Override
		public Hospital getHospital() {
			return hospital;
		}
		


}