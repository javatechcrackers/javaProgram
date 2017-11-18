package pkk.IBS;

/**
 * @author PrashantK
 *
 */
public class Employee {

		private int id;
		private String name;
		private int exp;
		public Employee(int id, String name, int exp) {
			super();
			this.id = id;
			this.name = name;
			this.exp = exp;
		}
		public int getExp() {
			return exp;
		}
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public void setExp(int exp) {
			this.exp = exp;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", exp=" + exp
					+ "]";
		}
		
}
