public class Pep25_Predicated {

	
		private String name;
		private int age;
		private double salary;
		public Pep25_Predicated(String name, int age, double salary) {
			super();
			this.name = name;
			this.age = age;
			this.salary = salary;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public double getSalary() {
			return salary;
		}
		public String toString()
		{
			return name+"\t"+age+"\t"+salary;
		}

}
