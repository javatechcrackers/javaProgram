package Paper1;

class Fish {
	 String name = "fish ";
	 String eat() { return "fish eats"; }
}
class Shark extends Fish {
	 String name = "shark ";
	 String eat() { return "shark eats"; }
}
public class Sea {
	 public static void main(String[] args) {
		 new Sea().go(); 
	 }
	 void go() {
		 Fish f = new Shark();
		 System.out.println(f.name + f.eat());
	 }
} 