
public class Director {

		private HBuilder hbuilder = null;

		public Director(HBuilder hbuilder) {
			this.hbuilder = hbuilder;
		}

		public void constructHouse() {
			hbuilder.buildname();
			hbuilder.buildspaces();
			hbuilder.buildSpaceFac();
		}

		public Hospital getHospital() {
			return hbuilder.getHospital();
		}

	
}
