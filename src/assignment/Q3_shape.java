package assignment;

public abstract class Q3_shape {
	
		protected String name;

		public Q3_shape(String n) {
		  name = new String(n);
		}

		public abstract double getArea();

		public String getName() {
			return name;}

		
}
